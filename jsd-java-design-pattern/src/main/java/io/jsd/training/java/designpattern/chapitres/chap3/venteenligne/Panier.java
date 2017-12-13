package io.jsd.training.java.designpattern.chapitres.chap3.venteenligne;
import java.util.*;

public class Panier extends Page {
    protected Scanner reader = new Scanner(System.in);

    public Panier(Mediateur mediateur) {
        super(mediateur);
    }

    public void lance() {
        System.out
                .println("Désirez-vous valider votre payement?");
        String reponse = reader.nextLine();
        if (reponse.equals("oui"))
            mediateur.lance("recapitulatif.htm");
        else
            mediateur.lance("accueil.htm");
    }
}
