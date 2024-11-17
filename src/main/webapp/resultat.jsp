<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ page import="com.example.tp4.JavaBean.Formulaire" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Résultat du Formulaire</title>
    <style>
        /* Centrage de tout le contenu */
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column; /* Ajouté pour centrer verticalement aussi */
            min-height: 100vh;
            margin: 0;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px; /* Ajout d'un espace sous le titre */
        }

        table {
            width: 100%;
            max-width: 600px;
            margin-bottom: 25px;
            border: 1px solid #ddd;
            border-collapse: collapse;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
            font-weight: bold;
            color: #555;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: #007BFF;
            font-weight: bold;
            transition: color 0.3s;
        }

        a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>
<% Formulaire formulaire = (Formulaire) session.getAttribute("formulaire"); %>

<h1>Détails du formulaire soumis</h1>

<table>
    <tr>
        <th>Nom</th>
        <td><%= formulaire.getNom() %></td>
    </tr>
    <tr>
        <th>Email</th>
        <td><%= formulaire.getEmail() %></td>
    </tr>
    <tr>
        <th>Sexe</th>
        <td><%= formulaire.getSexe() %></td>
    </tr>
    <tr>
        <th>Code Postal</th>
        <td><%= formulaire.getCodePostal() %></td>
    </tr>
</table>

<a href="formulaire.jsp">Retour au formulaire</a>
</body>
</html>
