package io.jsd.training.java.designpatterns.chapitres.chap6.lexiqueLinguistiqueState.lexiquelinguistique;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> resultatFormesFlechies;
        LexiqueLinguistique lexique = new LexiqueLinguistique();
        lexique.ajouteVerbe("walk");
        lexique.libereMemoire();
        resultatFormesFlechies = lexique
                .formesFlechiesVerbe("walk");
        if (resultatFormesFlechies != null)
            for (String forme : resultatFormesFlechies)
                System.out.println(forme);
        else
            System.out
                    .println("walk est un mot inconnu ! ");
        lexique.ajouteVerbe("pick");
        lexique.optimiseDonnees();
        lexique.ajouteNom("floor");
        lexique.libereMemoire();
        resultatFormesFlechies = lexique
                .formesFlechiesVerbe("pick");
        if (resultatFormesFlechies != null)
            for (String forme : resultatFormesFlechies)
                System.out.println(forme);
        else
            System.out
                    .println("pick est un mot inconnu ! ");
        resultatFormesFlechies = lexique
                .formesFlechiesVerbe("floor");
        if (resultatFormesFlechies != null)
            for (String forme : resultatFormesFlechies)
                System.out.println(forme);
        else
            System.out
                    .println("floor est un mot inconnu ! ");
    }

}
