package io.jsd.training.java.designpatterns.chapitres.chap3.facturation;
public class Facture {
    protected Affichage affichage;
    protected double montant = 0;

    public Facture(Affichage affichage) {
        this.affichage = affichage;
    }

    public void affiche() {
        affichage.affiche(this);
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

}
