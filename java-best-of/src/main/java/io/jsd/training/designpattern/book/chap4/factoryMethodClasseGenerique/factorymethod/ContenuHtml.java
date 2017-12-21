package io.jsd.training.designpattern.book.chap4.factoryMethodClasseGenerique.factorymethod;

public class ContenuHtml implements Contenu {

    protected String codeHtml;

    public void encode(String texte) {
        codeHtml = "<HTML>" + texte + "</HTML>";
    }

    public void affiche() {
        System.out.println(codeHtml);
    }
    
}
