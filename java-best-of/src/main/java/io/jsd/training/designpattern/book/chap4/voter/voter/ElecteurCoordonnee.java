package io.jsd.training.designpattern.book.chap4.voter.voter;

public class ElecteurCoordonnee implements Electeur {
    protected String attributModifie;
    protected int min, max;

    public ElecteurCoordonnee(String attributModifie,
            int min, int max) {
        this.attributModifie = attributModifie;
        this.min = min;
        this.max = max;
    }

    public boolean metsAJour(String attributModifie,
            Object valeur) {
        if (this.attributModifie.equals(attributModifie)) {
            Integer valeurCoordonnee = (Integer) valeur;
            if ((valeurCoordonnee >= min)
                    && (valeurCoordonnee <= max)) {
                System.out.println("Accord");
                return true;
            } else {
                System.out.println("Refus");
                return false;
            }
        }
        System.out.println("Accord");
        return true;
    }

}
