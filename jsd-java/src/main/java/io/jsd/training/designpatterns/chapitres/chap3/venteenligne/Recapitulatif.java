package io.jsd.training.designpatterns.chapitres.chap3.venteenligne;
import java.util.*;

public class Recapitulatif extends Page {
    protected Scanner reader = new Scanner(System.in);

    public Recapitulatif(Mediateur mediateur) {
        super(mediateur);
    }

    public void lance() {
        System.out
                .println("Nous vous remercions pour votre commande.");
        mediateur.lance("accueil.htm");
    }
}
