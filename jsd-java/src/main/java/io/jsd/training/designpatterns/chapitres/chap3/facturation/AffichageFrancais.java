package io.jsd.training.designpatterns.chapitres.chap3.facturation;
public class AffichageFrancais implements Affichage {

    public void affiche(Facture facture) {
        System.out
                .println("Le montant de la facture est: "
                        + facture.getMontant() + " €");
    }
}
