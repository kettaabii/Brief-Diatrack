<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06/06/2024
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save-prelevement" method="POST">

    <div class="form-group">
        <label for="niveauGlicemique">Niveau Glicemique:</label>
        <input type="number"  id="niveauGlicemique" name="niveauGlicemique">
    </div>
    <div class="form-group">
        <label for="datePrelevement">Date prelevement:</label>
        <input type="datetime-local"  id="datePrelevement" name="datePrelevement">
    </div>
    <div class="form-group">
        <label for="range">range:</label>
        <input type="text"  id="range" name="range">
    </div>

</form>
</body>
</html>
