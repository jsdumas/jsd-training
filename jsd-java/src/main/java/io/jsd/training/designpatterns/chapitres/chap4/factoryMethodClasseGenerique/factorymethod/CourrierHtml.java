package io.jsd.training.designpatterns.chapitres.chap4.factoryMethodClasseGenerique.factorymethod;

public class CourrierHtml extends Courrier {

    @Override
    protected Contenu nouveauContenu() {
        return new ContenuHtml();
    }

}
