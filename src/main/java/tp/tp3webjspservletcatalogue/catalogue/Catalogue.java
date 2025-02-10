package tp.tp3webjspservletcatalogue.catalogue;

import java.util.HashMap;

public class Catalogue {
    private String catalogueName;
    private static int count = 1;
    HashMap<Integer, Produit> produitHashMap;
    public Catalogue(String catalogueName) {
        this.catalogueName = catalogueName;
        produitHashMap = new HashMap<>();
    }
    public boolean addProd(Produit produit){
        if (produitHashMap.putIfAbsent(count, produit) == null){
            count++;
            return true;
        }
        return false;
    }
    public boolean removeProd(Produit produit){
        return produitHashMap.remove(count, produit);
    }
    public Produit getProd(int id){
        return produitHashMap.get(id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(produitHashMap.keySet().toString());
        return sb.toString();
    }
}
