package io.jsd.training.java.designpatterns.chapitres.chap3.venteenligne;
public class Mediateur {
    protected Accueil accueil;
    protected Catalogue catalogue;
    protected Panier panier;
    protected Recapitulatif recapitulatif;

    public Mediateur() {
        accueil = new Accueil(this);
        catalogue = new Catalogue(this);
        panier = new Panier(this);
        recapitulatif = new Recapitulatif(this);
    }

    public Accueil getAccueil() {
        return accueil;
    }

    public void lance(String page) {
        if (page.equals("accueil.htm")) {
            accueil.lance();
        } else if (page.equals("catalogue.htm")) {
            catalogue.lance();
        } else if (page.equals("panier.htm")) {
            panier.lance();
        } else if (page.equals("recapitulatif.htm")) {
            recapitulatif.lance();
        }

    }
}
