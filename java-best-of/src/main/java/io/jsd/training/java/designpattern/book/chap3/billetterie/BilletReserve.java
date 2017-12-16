package io.jsd.training.java.designpattern.book.chap3.billetterie;
public class BilletReserve extends EtatBillet {
    public BilletReserve(Billet billet) {
        super(billet);
    }

    public void annule() {
        System.out
                .println("Réservation du billet annulée");
    }

    public void modifie() {
        System.out.println("Réservation modifiée");
    }

    public EtatBillet etatSuivant() {
        return new BilletPaye(billet);
    }
}
