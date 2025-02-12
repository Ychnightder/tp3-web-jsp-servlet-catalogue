package tp.tp3webjspservletcatalogue.catalogue;

public class Produit {
    private static int count = 1;
    private int idProd;
    private  double prixProd;
    private  String nomProd;

    public Produit(String nomProd, double prixProd) {
        this.idProd = count;
        count++;
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
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("- ID: ").append(idProd)
        .append("\n- Nom: ").append(nomProd)
                .append("\n- Prix: ").append(prixProd).append("€");

        return sb.toString();
    }
}
