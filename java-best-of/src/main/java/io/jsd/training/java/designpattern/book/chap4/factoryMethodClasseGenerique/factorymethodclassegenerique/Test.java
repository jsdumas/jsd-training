package io.jsd.training.java.designpattern.book.chap4.factoryMethodClasseGenerique.factorymethodclassegenerique;

public class Test {

    public static void main(String[] args) {
        Courrier<ContenuHtml> courrierHtml = new Courrier<ContenuHtml>(
                ContenuHtml.class);
        courrierHtml
                .prepare("adresse1@domaine", "texte1");
        courrierHtml.affiche();

        Courrier<ContenuTexte> courrierTexte = new Courrier<ContenuTexte>(
                ContenuTexte.class);
        courrierTexte.prepare("adresse2@domaine",
                "texte2");
        courrierTexte.affiche();

    }

}
