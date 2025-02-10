<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/dark.css">
    <title>Catalogue - Produit</title>
</head>
<body>
<div class="wrapper">
    <div class="catalogueAddProd">
        <form action="catalogue" method="post">
            <label for="nomProd">Nom du produit :</label>
            <input id="nomProd" type="text">
            <label for="prixProd">Nom du produit :</label>
            <input id="prixProd" type="text">
            <button type="submit">Enregister</button>
        </form>
    </div>
    <div class="catalogeChercherProd">
        <form action="catalogue" method="get">

        </form>
    </div>
</div>
<div class="catalogeProd">
</div>
</body>
</html>