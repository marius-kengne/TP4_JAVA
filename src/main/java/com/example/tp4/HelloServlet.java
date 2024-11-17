package com.example.tp4;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;


public class HelloServlet extends HttpServlet {



    // Methode doGet qui utilise le fichier HTML

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("hello.html");
        dispatcher.forward(request, response);

    }

    public void destroy() {
    }
}