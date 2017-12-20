package io.jsd.training.designpattern.book.chap4.factoryMethodClasseGenerique.factorymethod;

public class CourrierTexte extends Courrier {

    @Override
    protected Contenu nouveauContenu() {
        return new ContenuTexte();
    }

}