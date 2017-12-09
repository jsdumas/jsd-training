package io.jsd.training.designpatterns.chapitres.chap4.stategyClasseGenerique.strategy;

public class Test {

    public static void main(String[] args) {
        BaseDonnees maBase = new BaseDonnees(
                new TriJava());
        maBase.afficheDonneesTriees();

        BaseDonnees maBase2 = new BaseDonnees(
                new TriBulles());
        maBase2.afficheDonneesTriees();

        BaseDonnees maBase3 = new BaseDonnees(
                new TriSelection());
        maBase3.afficheDonneesTriees();
    }

}
