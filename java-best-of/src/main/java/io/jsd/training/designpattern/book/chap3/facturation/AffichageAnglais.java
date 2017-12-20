package io.jsd.training.designpattern.book.chap3.facturation;
public class AffichageAnglais implements Affichage {

    public void affiche(Facture facture) {
        System.out
                .println("The amount of the invoice is: £ "
                        + facture.getMontant());
    }
}
