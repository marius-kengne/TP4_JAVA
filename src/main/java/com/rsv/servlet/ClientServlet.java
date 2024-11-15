package com.rsv.servlet;

import com.example.tp4.HelloServlet;
import com.rsv.beans.Client;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ClientServlet extends HelloServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String error = (String) request.getSession().getAttribute("error");
        if (error != null) {
            request.setAttribute("error", error);
            request.getSession().removeAttribute("error");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Views/inscription.jsp");
        dispatcher.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");

        if (nom.isEmpty() || prenom.isEmpty() || telephone.isEmpty() || email.isEmpty()) {
            request.getSession().setAttribute("error", "Vous devez remplir tous les champs");
            System.out.println("############# context : "+request.getContextPath());
            response.sendRedirect(request.getContextPath() + "/client");
        } else {
            Client client = new Client();
            client.setNom(nom);
            client.setPrenom(prenom);
            client.setTelephone(telephone);
            client.setEmail(email);

            request.setAttribute("client", client);
            request.setAttribute("success", "Inscription avec succès");
            request.getRequestDispatcher("WEB-INF/Views/info_client.jsp").forward(request, response);
        }
    }

}
