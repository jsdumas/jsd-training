package io.jsd.training.designpatterns.chapitres.chap7.chainofresponsibility;

public class Secretaire extends Employe {

    public Secretaire(Employe employeSuivant) {
        super(employeSuivant);
    }

    @Override
    protected boolean accepteCourrier(Courrier courrier) {
        return (courrier.getCategorie() == Courrier.Categorie.ADMINISTRATIF);
    }

}
