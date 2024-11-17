<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>

    <h1>Page de Connexion</h1>

    <%-- Affiche le message d'erreur s'il existe --%>
    <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
    <% if (errorMessage != null) { %>
    <p style="color: red;"><%= errorMessage %></p>
    <br>
    <% } %>

    <form action="LoginServlet" method="POST">
        <label for="username">nom d' utilisateur :</label>
        <input type="text" id="username" name="username" required>
        <br><br>
        <label for="password">Mot de Passe :</label>
        <input type="text" id="password" name="password" required>
        <br><br>
        <input type="submit" value="Valider">
    </form>

</body>
</html>