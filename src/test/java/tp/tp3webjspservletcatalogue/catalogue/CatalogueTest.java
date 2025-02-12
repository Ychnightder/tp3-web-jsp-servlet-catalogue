package tp.tp3webjspservletcatalogue.catalogue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CatalogueTest {

   private Catalogue catalogue ;
   private Produit p1 ,p2 , p3 ;
    @BeforeEach
    void setUp() {
        catalogue = new Catalogue("Test Catalogue");
        p1 = new Produit("pc", 1500.00);
        p2 = new Produit("souris", 200.00);
        p3 = new Produit("ecran", 500.00);
    }

    @Test
    void addProd() {
       assertTrue(catalogue.addProd(p1));
       assertTrue(catalogue.addProd(p2));
       assertTrue(catalogue.addProd(p3));
    }

    @Test
    void removeProd() {
        assertTrue(catalogue.addProd(p1));
        assertTrue(catalogue.removeProd(p1));
        assertFalse(catalogue.removeProd(p2));

    }

    @Test
    void getProd() {
        catalogue.addProd(p1);
        catalogue.addProd(p2);
        Produit test = catalogue.getProd("pc");
        assertTrue(test.equals(p1));
        assertFalse(test.equals(p2));
    }

    @Test
    void maxPrix() {
        catalogue.addProd(p1);
        catalogue.addProd(p2);
        catalogue.addProd(p3);
        double  prixTest = 600;
        HashMap <Integer , Produit> map = new HashMap();
        map = catalogue.maxPrix(prixTest);
        for (Produit p : map.values()) {
            assertTrue(p.getPrixProd() <= prixTest);
        }

    }

    @Test
    void testToString() {
        catalogue.addProd(p1);
        catalogue.addProd(p2);
        catalogue.addProd(p3);
        String catalogueString = "Catalogue: Test Catalogue\n" +
                "Produits:\n" +
                "- ID: 4, Nom: pc, Prix: 1500.0€\n" +
                "- ID: 5, Nom: souris, Prix: 200.0€\n" +
                "- ID: 6, Nom: ecran, Prix: 500.0€"+"\n";
        assertEquals(catalogueString, catalogue.toString())      ;
    }
}