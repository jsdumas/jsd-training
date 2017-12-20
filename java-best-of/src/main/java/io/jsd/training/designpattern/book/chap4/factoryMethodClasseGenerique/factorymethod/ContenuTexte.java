package io.jsd.training.designpattern.book.chap4.factoryMethodClasseGenerique.factorymethod;

public class ContenuTexte implements Contenu {

    protected String texte;

    public void encode(String texte) {
        this.texte = texte;
    }

    public void affiche() {
        System.out.println(texte);
    }

}
