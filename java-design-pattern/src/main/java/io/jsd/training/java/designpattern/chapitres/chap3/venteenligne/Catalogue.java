package io.jsd.training.java.designpattern.chapitres.chap3.venteenligne;
import java.util.*;

public class Catalogue extends Page {
    protected Scanner reader = new Scanner(System.in);

    public Catalogue(Mediateur mediateur) {
        super(mediateur);
    }

    public void lance() {
        System.out
                .println("Désirez-vous valider votre commande?");
        String reponse = reader.nextLine();
        if (reponse.equals("oui"))
            mediateur.lance("panier.htm");
        else
            mediateur.lance("accueil.htm");
    }
}
