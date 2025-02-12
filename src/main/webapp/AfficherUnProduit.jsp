<%@ page import="tp.tp3webjspservletcatalogue.catalogue.Produit" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <c:choose>
            <c:when test="${not empty produitTrouve}">
                <h1><c:out value="${produitTrouve}"></c:out></h1>
            </c:when>
            <c:otherwise>
                <p>Aucun produit trouvé.</p>
            </c:otherwise>
        </c:choose>
        <a href="index.html">retour</a>
</body>
</html>
