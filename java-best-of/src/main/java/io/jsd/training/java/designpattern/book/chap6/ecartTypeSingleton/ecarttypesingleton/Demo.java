package io.jsd.training.java.designpattern.book.chap6.ecartTypeSingleton.ecarttypesingleton;

public class Demo {

    public static void main(String[] args) {
        Application appli = new Application();
        ApplicationTest appliTest = new ApplicationTest();

        appli.litDonnees();
        appli.calculeStatistiques(AlgoEcartType1
                .getInstance());
        appli.afficheStatistiques();

        appliTest.traiteDonnees();
        // code masqué
        appliTest.traiteDonnees();
    }

}
