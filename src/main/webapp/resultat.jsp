<%@ page contentType="text/html;charset=UTF-8" language="java" session = "true" %>
<%@ page import="com.example.tp4.JavaBean.Formulaire" %>



<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Résultat du Formulaire</title>
    <style>
            table {
                width: 50%;
                margin: 25px;
                border: 1px solid #ddd;
                border-collapse: collapse;
            }
            th, td {
                padding: 8px;
                text-align: left;
                border-bottom: 1px solid #ddd;
            }
            th {
                background-color: #f2f2f2;
            }
        </style>
</head>
<body>

<% Formulaire formulaire = (Formulaire) session.getAttribute("formulaire"); %>

<h1 style="text-align: center;">Détails du formulaire soumis</h1>

<table>
    <tr>
        <th>Nom</th>
        <td> <%= formulaire.getNom() %></td>
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

<a href="formulaire.jsp" style="display: block; text-align: center; margin-top: 20px;">Retour au formulaire</a>
</body>
</html>
