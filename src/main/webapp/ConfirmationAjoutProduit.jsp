<%@ page import="tp.tp3webjspservletcatalogue.catalogue.Catalogue" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    boolean produit = (boolean) request.getAttribute("resultatAjout");
%>
    <h1><%="resultat de l'ajoute : "+ produit%></h1>
<a href="index.html">retour</a>
</body>
</html>
