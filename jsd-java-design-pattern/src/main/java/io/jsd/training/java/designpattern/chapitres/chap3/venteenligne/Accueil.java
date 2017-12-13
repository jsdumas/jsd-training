package io.jsd.training.java.designpattern.chapitres.chap3.venteenligne;
import java.util.*;

public class Accueil extends Page {
    protected Scanner reader = new Scanner(System.in);

    public Accueil(Mediateur mediateur) {
        super(mediateur);
    }

    public void lance() {
        System.out
                .println("Bienvenue, désirez-vous effectuer des achats?");
        String reponse = reader.nextLine();
        if (reponse.equals("oui"))
            mediateur.lance("catalogue.htm");
        else
            System.out
                    .println("Au revoir et à bientôt sur notre site.");
    }
}
