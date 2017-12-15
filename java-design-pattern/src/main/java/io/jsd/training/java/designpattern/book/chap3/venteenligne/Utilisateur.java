package io.jsd.training.java.designpattern.book.chap3.venteenligne;
public class Utilisateur {

    public static void main(String[] args) {
        Mediateur mediateur = new Mediateur();
        mediateur.getAccueil().lance();
    }
}
