package io.jsd.training.designpatterns.chapitres.chap4.factoryMethodClasseGenerique.factorymethod;

public class Test {

    public static void main(String[] args) {
        CourrierHtml courrierHtml = new CourrierHtml();
        courrierHtml
                .prepare("adresse1@domaine", "texte1");
        courrierHtml.affiche();

        CourrierTexte courrierTexte = new CourrierTexte();
        courrierTexte.prepare("adresse2@domaine",
                "texte2");
        courrierTexte.affiche();
    }
}
