package io.jsd.training.java.designpattern.chapitres.chap2.proxy;
public class BD implements BaseDonnees {
    public void executeRequete(String requete) {
        System.out
                .println("Exécution de la requête sur la base de données");
    }

    public void retourneResultat() {
        System.out
                .println("Renvoi du résultat de la requête");
    }
}
