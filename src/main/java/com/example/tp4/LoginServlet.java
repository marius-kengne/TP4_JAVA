package com.example.tp4;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/login.jsp");
        dispatcher.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("J2EE") && password.equals("J2EE")){
            System.out.println("Login OK");
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h1>Bienvenue, " + username + "!</h1>");
            response.getWriter().println("<form action=\"RedirectServlet\" method=\"GET\">");
            response.getWriter().println("Type d' action : <input type=\"text\" name=\"action\" value=\"PageRedirect\"><br><br>");
            response.getWriter().println("Texte ou URL : <input type=\"text\" name=\"page\" required><br><br>");
            response.getWriter().println("<input type=\"submit\" value=\"Soumettre\">");
            response.getWriter().println("</form>");
            response.getWriter().println("</body></html>");
        }else {
            request.setAttribute("errorMessage", "Le nom d' utilisateur ou mot de passe saisi est incorrect.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/login.jsp");
            dispatcher.forward(request, response);
        }

    }
}
