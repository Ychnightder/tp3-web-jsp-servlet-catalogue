package tp.tp3webjspservletcatalogue.catalogue;

import java.util.HashMap;

public class Catalogue {
    private String catalogueName;
    HashMap<Integer, Produit> produitHashMap;

    public String getCatalogueName() {
        return catalogueName;
    }

    public Catalogue(String catalogueName) {
        this.catalogueName = catalogueName;
        produitHashMap = new HashMap<>();
    }

    public Catalogue(String catalogueName, HashMap<Integer, Produit> produitHashMap) {
        this.catalogueName = catalogueName;
        this.produitHashMap = produitHashMap;

    }
    public boolean addProd(Produit produit){
        if (this.getProd(produit.getNomProd()) != null){
            return false;
        }
        if (produitHashMap.putIfAbsent(produit.getIdProd(), produit) == null){
            return true;
        }
        return false;
    }
    public boolean removeProd(Produit produit){
        return produitHashMap.remove(produit.getIdProd(), produit);
    }
    public Produit getProd(String nomProd){
        for (Produit p : produitHashMap.values()){
            if (p.getNomProd().equalsIgnoreCase(nomProd)){
                return p;
            }
        }
        return null;
    }
    public HashMap<Integer, Produit> maxPrix(double pPrix){
        HashMap<Integer, Produit> maxPrixHashMap = new HashMap<>();
        for (Produit prod : produitHashMap.values()){
            if (prod.getPrixProd() <= pPrix){
                maxPrixHashMap.put(prod.getIdProd(), prod);
            }
        }
        return maxPrixHashMap;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalogue: ").append(catalogueName).append("\n");
        sb.append("Produits:\n");
        if (produitHashMap.isEmpty()) {
            sb.append("Aucun produit dans le catalogue.\n");
        } else {
            for (Produit produit : produitHashMap.values()) {
                sb.append("- ID: ").append(produit.getIdProd())
                        .append(", Nom: ").append(produit.getNomProd())
                        .append(", Prix: ").append(produit.getPrixProd()).append("€\n");
            }
        }
        return sb.toString();
    }

}
