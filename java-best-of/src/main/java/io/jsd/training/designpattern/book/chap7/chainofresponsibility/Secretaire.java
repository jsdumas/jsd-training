package io.jsd.training.designpattern.book.chap7.chainofresponsibility;

public class Secretaire extends Employe {

    public Secretaire(Employe employeSuivant) {
        super(employeSuivant);
    }

    @Override
    protected boolean accepteCourrier(Courrier courrier) {
        return (courrier.getCategorie() == Courrier.Categorie.ADMINISTRATIF);
    }

}
