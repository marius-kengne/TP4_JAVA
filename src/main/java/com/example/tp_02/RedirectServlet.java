package com.example.tp_02;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String page = request.getParameter("page");

        if ("PageRedirect".equals(action) && page != null && !page.isEmpty()) {
            response.sendRedirect(page);
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h3 style='color:red;'>Erreur : paramètre 'action' ou 'page' non valide.</h3>");
            response.getWriter().println("</body></html>");
        }
    }
}
