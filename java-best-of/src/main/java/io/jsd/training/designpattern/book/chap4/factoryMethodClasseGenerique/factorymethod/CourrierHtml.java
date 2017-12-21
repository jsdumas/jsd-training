package io.jsd.training.designpattern.book.chap4.factoryMethodClasseGenerique.factorymethod;

public class CourrierHtml extends Courrier {

    @Override
    protected Contenu nouveauContenu() {
        return new ContenuHtml();
    }

}
