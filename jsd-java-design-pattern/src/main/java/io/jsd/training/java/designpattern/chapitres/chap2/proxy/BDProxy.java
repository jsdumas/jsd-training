package io.jsd.training.java.designpattern.chapitres.chap2.proxy;
public class BDProxy implements BaseDonnees {
    protected BD bd;

    public BDProxy(BD bd) {
        this.bd = bd;
    }

    public void executeRequete(String requete) {
        System.out.println("Décryptage de la requête: "
                + requete);
        bd.executeRequete(requete);
    }

    public void retourneResultat() {
        bd.retourneResultat();
        System.out.println("Cryptage du résultat");
    }

}
