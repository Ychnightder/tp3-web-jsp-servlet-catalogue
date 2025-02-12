package tp.tp3webjspservletcatalogue;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tp.tp3webjspservletcatalogue.catalogue.Catalogue;
import tp.tp3webjspservletcatalogue.catalogue.Produit;

import java.io.IOException;

@WebServlet({"/catalogue","/catalogue/nom" , "/catalogue/prixMax"})
public class ServletCatalogue extends HttpServlet {
    private static Catalogue catalogue = new Catalogue("Catalogue");
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String produitName = request.getParameter("nomProd");
        double produitPrice;

        try {
             produitPrice = Double.parseDouble(request.getParameter("prixProd"));
        }catch (NumberFormatException e){
            throw new ServletException(e);
        }
        Produit courrant = new Produit(produitName , produitPrice);
        boolean resultatAjout =  catalogue.addProd(courrant);
        request.setAttribute("resultatAjout", resultatAjout);
        request.getRequestDispatcher("/ConfirmationAjoutProduit.jsp").forward(request, response);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if ("/catalogue/nom".equals(path)) {
            String produitName = request.getParameter("nomProdChercher");
            Produit produitTrouve = catalogue.getProd(produitName);
            request.setAttribute("produitTrouve", produitTrouve);
            request.getRequestDispatcher("/AfficherUnProduit.jsp").forward(request, response);

        }
        else if ("/catalogue/prixMax".equals(path)) {
            double prixMax;
            try{
                 prixMax = Double.parseDouble(request.getParameter("prixProdMax"));
            }catch (NumberFormatException e){
                throw new ServletException(e);
            }

            Catalogue currentCatalogue = new Catalogue(catalogue.getCatalogueName() , catalogue.maxPrix(prixMax));
            request.setAttribute("currentCatalogue", currentCatalogue);
            request.getRequestDispatcher("/AfficherLesProduits.jsp").forward(request, response);
        }

    }
}
