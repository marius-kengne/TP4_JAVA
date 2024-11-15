<%--
  Created by IntelliJ IDEA.
  User: CYTech Student
  Date: 11/15/2024
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Réservation</title>
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

        form {
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        input[type="text"], select {
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            width: 100%;
            box-sizing: border-box;
        }

        .checkbox-group {
            display: flex;
            flex-wrap: wrap;
            gap: 10px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px;
            border-radius: 4px;
            cursor: pointer;
            font-weight: bold;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .error {
            color: red;
            text-align: center;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Réservation d'Appartement</h1>
    <form action="reservation" method="post">
        Nom: <input type="text" name="nom">
        Prénom: <input type="text" name="prenom">
        Téléphone: <input type="text" name="telephone">
        Email: <input type="text" name="email">
        Type d'Appartement:
        <select name="type">
            <option value="T1">T1</option>
            <option value="T2">T2</option>
            <option value="T3">T3</option>
        </select>
        Prix: <input type="number" name="prix">
        Options:
        <div class="checkbox-group">
            <label><input type="checkbox" name="option" value="Proche de la mer"> Proche de la mer</label>
            <label><input type="checkbox" name="option" value="Piscine"> Piscine</label>
            <label><input type="checkbox" name="option" value="Jardin"> Jardin</label>
        </div>
        <input type="submit" value="Réserver">
    </form>

    <% if (request.getAttribute("error") != null) { %>
    <p style="color: red; text-align: center"><%= request.getAttribute("error") %></p>
    <% } %>
</div>
</body>
</html>
