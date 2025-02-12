<%@ page import="tp.tp3webjspservletcatalogue.catalogue.Catalogue" %><%--
  Created by IntelliJ IDEA.
  User: Pierr
  Date: 12/02/2025
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <title>Title</title>
</head>
<body>
<%
        Catalogue c = (Catalogue) request.getAttribute("currentCatalogue");
%>
        <h1><%= c.toString() %></h1>
</body>
</html>
