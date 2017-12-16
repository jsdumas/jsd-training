package io.jsd.training.java.designpattern.book.chap5.voterstrategy;

public class ElecteurCoordonnee implements Electeur {
    protected String attributModifie;
    protected int min, max;

    public ElecteurCoordonnee(String attributModifie,
            int min, int max) {
        this.attributModifie = attributModifie;
        this.min = min;
        this.max = max;
    }

    @Override
    public Vote metsAJour(String attributModifie,
            Object valeur) {
        if (this.attributModifie.equals(attributModifie)) {
            Integer valeurCoordonnee = (Integer) valeur;
            if ((valeurCoordonnee >= min)
                    && (valeurCoordonnee <= max)) {
                System.out.println("Accord");
                return Vote.pour;

            } else {
                System.out.println("Refus");
                return Vote.contre;
            }
        }
        System.out.println("Neutre");
        return Vote.neutre;
    }

}
