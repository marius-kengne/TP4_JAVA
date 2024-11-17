package com.example.tp4.Controller;

import com.example.tp4.JavaBean.Formulaire;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class FormController extends HttpServlet {



        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            RequestDispatcher dispatcher = request.getRequestDispatcher("formulaire.jsp");
            dispatcher.forward(request, response);
        }


        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            HttpSession session = request.getSession();

            //verification
            if(request.getParameter("nom").trim().isEmpty() == true || request.getParameter("email").trim().isEmpty() == true || request.getParameter("sexe").trim().isEmpty() == true || request.getParameter("code").isEmpty() ){

               String erreur = "Tous les champs sont obligatoires. Merci de remplir correctement le formulaire.";
                request.setAttribute("erreur", erreur);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/formulaire.jsp");
                dispatcher.forward(request, response);
                return;  // Stoppe l'exécution de la servlet si l'erreur est détectée
            }



            Formulaire formulaire = new Formulaire();


            // Récupération des données envoyées par le formulaire
            formulaire.setNom(request.getParameter("nom"));
            formulaire.setEmail(request.getParameter("email"));
            formulaire.setSexe(request.getParameter("sexe"));
            formulaire.setCodePostal(request.getParameter("code"));


            session.setAttribute("formulaire", formulaire);



            // Stocker les données dans l'objet request pour l'affichage dans la vue
           // request.setAttribute("formulaire", formulaire);

            // Rediriger vers une page JSP ou afficher un message de confirmation
           RequestDispatcher dispatcher = request.getRequestDispatcher("/resultat.jsp");
           dispatcher.forward(request, response);
        }




}
