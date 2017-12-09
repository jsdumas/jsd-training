package io.jsd.training.designpatterns.chapitres.chap7.chainofresponsibility;

public class Commercial extends Employe {

    public Commercial(Employe employeSuivant) {
        super(employeSuivant);
    }

    @Override
    protected boolean accepteCourrier(Courrier courrier) {
        return (courrier.getCategorie() == Courrier.Categorie.COMMERCIAL);
    }

}
