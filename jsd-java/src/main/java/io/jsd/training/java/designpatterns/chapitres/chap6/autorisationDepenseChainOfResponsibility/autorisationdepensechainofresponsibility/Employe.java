package io.jsd.training.java.designpatterns.chapitres.chap6.autorisationDepenseChainOfResponsibility.autorisationdepensechainofresponsibility;

public class Employe {
    protected int plafondDepense;
    protected String nom;
    protected Employe decideurDirect;

    public Employe(int plafondDepense, String nom,
            Employe decideurDirect) {
        super();
        this.plafondDepense = plafondDepense;
        this.nom = nom;
        this.decideurDirect = decideurDirect;
    }

    public int getPlafondDepense() {
        return plafondDepense;
    }

    public void setPlafondDepense(int plafondDepense) {
        this.plafondDepense = plafondDepense;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Employe getDecideurDirect() {
        return decideurDirect;
    }

    public void setDecideurDirect(Employe decideurDirect) {
        this.decideurDirect = decideurDirect;
    }

    protected boolean accordImmediatDepense(int montant) {
        if (montant <= plafondDepense) {
            System.out
                    .println(nom
                            + " a donné son accord pour une dépense de "
                            + montant);
            return true;
        }
        return false;
    }

    public boolean accordDepense(int montant) {
        if (this.accordImmediatDepense(montant))
            return true;
        if (decideurDirect != null)
            return decideurDirect.accordDepense(montant);
        else
            return false;
    }

}
