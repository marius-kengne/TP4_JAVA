<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infos Réservation</title>
    <%@ page import="com.rsv.beans.Client" %>
    <%@ page import="com.rsv.beans.Reservation" %>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
        }

        .container {
            background-color: white;
            padding: 20px 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            box-sizing: border-box;
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
            font-size: 24px;
            color: #333;
        }

        .success {
            color: green;
            font-weight: bold;
            text-align: center;
            margin-bottom: 15px;
        }

        .error {
            color: red;
            font-weight: bold;
            text-align: center;
            margin-bottom: 15px;
        }

        p {
            margin: 8px 0;
            color: #555;
        }
        .error{
            color: red;
            font-weight: bold;
            text-align: center;
        }
        .success{
            color: green;
            font-weight: bold;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Information de la Réservation</h1>

        <% if (request.getAttribute("success") != null) { %>
        <p class="success"><%= request.getAttribute("success") %></p>
        <% } %>

        <%
            Reservation reservation = (Reservation) request.getAttribute("reservation");
            Client client = (Client) request.getAttribute("client");
        %>

        <p>Type: <%= reservation.getType() %></p>
        <p>Prix: <%= reservation.getPrix() %></p>
        <p>Options: <%= reservation.getOption() %></p>
        <p>Nom: <%= client.getNom() %></p>
        <p>Prénom: <%= client.getPrenom() %></p>
        <p>Téléphone: <%= client.getTelephone() %></p>
        <p>Email: <%= client.getEmail() %></p>
    </div>
</body>
</html>