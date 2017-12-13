package io.jsd.training.java.designpattern.chapitres.chap3.facturation;
public class AffichageAllemand implements Affichage {

    public void affiche(Facture facture) {
        System.out.println("Der Rechnungsbetrag ist: € "
                + facture.getMontant());
    }
}
