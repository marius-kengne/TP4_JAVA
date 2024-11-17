<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Formulaire</title>
</head>
<body>
<h1>Formulaire</h1>

<!-- Affichage des erreurs -->
<%-- Affiche le message d'erreur s'il existe --%>
    <% String errorMessage = (String) request.getAttribute("erreur"); %>
    <% if (errorMessage != null) { %>
    <p style="color: red;"><%= errorMessage %></p>
    <br>
    <% } %>

<form action="Formulaire" method="POST">
    <label for="nom">Nom :</label>
    <input type="text" id="nom" name="nom"><br><br>

    <label for="email">Email :</label>
    <input type="text" id="email" name="email"><br><br>

    <label for="sexe">Sexe :</label>
    <select id="sexe" name="sexe">
        <option value="">-- Sélectionnez --</option>
        <option value="Homme">Homme</option>
        <option value="Femme">Femme</option>
    </select><br><br>

    <label for="code">Code Postal :</label>
    <input type="text" id="code" name="code"><br><br>

    <button type="submit">Envoyer</button>
</form>
</body>
</html>
