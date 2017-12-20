package io.jsd.training.designpattern.book.chap3.facturation;
public class Utilisateur {

    public static void main(String[] args) {
        Facture facture1 = new Facture(
                new AffichageFrancais());
        facture1.setMontant(1129.90);
        facture1.affiche();
        Facture facture2 = new Facture(
                new AffichageAnglais());
        facture2.setMontant(978.80);
        facture2.affiche();
        Facture facture3 = new Facture(
                new AffichageAllemand());
        facture3.setMontant(7688.09);
        facture3.affiche();
    }
}
