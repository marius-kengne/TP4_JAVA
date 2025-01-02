package com.rsv.servlet;

import com.rsv.beans.Client;
import com.rsv.beans.Reservation;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ReservationServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String error = (String) request.getSession().getAttribute("error");
        if (error != null) {
            request.setAttribute("error", error);
            request.getSession().removeAttribute("error");
        }
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Views/reservation.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String type = request.getParameter("type");
        String prixString = request.getParameter("prix");
        String[] options = request.getParameterValues("option");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");

        if (nom.isEmpty() || prenom.isEmpty() || telephone.isEmpty() || email.isEmpty() || type.isEmpty()
                || prixString.isEmpty() || options == null || options.length == 0) {
            request.getSession().setAttribute("error", "Vous devez remplir tous les champs");
            response.sendRedirect(request.getContextPath() + "/reservation");
        } else {
            double prix = Double.parseDouble(prixString);
            Reservation reservation = new Reservation();
            try {
                reservation.setType(type);
                reservation.setPrix(prix);
                reservation.setOption(String.join(", ", options));
            } catch (IllegalArgumentException e) {
                request.getSession().setAttribute("error", e.getMessage());
                response.sendRedirect(request.getContextPath() + "/reservation");
                return;
            }

            Client client = new Client();
            try {
                client.setNom(nom);
                client.setPrenom(prenom);
                client.setTelephone(telephone);
                client.setEmail(email);
                client.setReservation(reservation);
            } catch (IllegalArgumentException e) {
                request.getSession().setAttribute("error", e.getMessage());
                response.sendRedirect(request.getContextPath() + "/reservation");
                return;
            }

            request.setAttribute("reservation", reservation);
            request.setAttribute("client", client);
            request.setAttribute("success", "Réservation faite avec succès");
            request.getRequestDispatcher("WEB-INF/Views/info_reservation.jsp").forward(request, response);
        }
    }

}
