package io.jsd.training.designpattern.book.chap3.billetterie;
public class BilletPaye extends EtatBillet {
    public BilletPaye(Billet billet) {
        super(billet);
    }

    public void annule() {
        System.out
                .println("Impossible d'annuler un billet payé");
    }

    public void modifie() {
        System.out.println("Billet modifié");
    }

    public EtatBillet etatSuivant() {
        return new BilletApresDepart(billet);
    }
}
