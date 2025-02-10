package tp.tp3webjspservletcatalogue.catalogue;

public class Produit {
    private int idProd;
    private  double prixProd;
    private  String nomProd;

    public Produit(int idProd, double prixProd, String nomProd) {
        this.idProd = idProd;
        this.prixProd = prixProd;
        this.nomProd = nomProd;
    }
    public int getIdProd() {
        return idProd;
    }
    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }
    public double getPrixProd() {
        return prixProd;
    }
    public void setPrixProd(double prixProd) {
        this.prixProd = prixProd;
    }
    public String getNomProd() {
        return nomProd;
    }
    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }
}
