package io.jsd.training.java.designpatterns.chapitres.chap4.factoryMethodClasseGenerique.factorymethod;

public class CourrierTexte extends Courrier {

    @Override
    protected Contenu nouveauContenu() {
        return new ContenuTexte();
    }

}