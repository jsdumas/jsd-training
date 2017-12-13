package io.jsd.training.java.designpattern.chapitres.chap7.chainofresponsibility;

public abstract class Employe {
    protected Employe employeSuivant;

    public Employe(Employe employeSuivant) {
        super();
        this.employeSuivant = employeSuivant;
    }

    public Employe getEmployeSuivant() {
        return employeSuivant;
    }

    public void setEmployeSuivant(Employe employeSuivant) {
        this.employeSuivant = employeSuivant;
    }

    abstract protected boolean accepteCourrier(
            Courrier courrier);

    public void gereCourrier(Courrier courrier) {
        if ((!accepteCourrier(courrier))
                && (employeSuivant != null))
            employeSuivant.gereCourrier(courrier);
    }
}
