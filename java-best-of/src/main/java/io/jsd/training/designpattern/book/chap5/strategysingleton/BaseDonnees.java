package io.jsd.training.designpattern.book.chap5.strategysingleton;

import java.util.Arrays;
import java.util.List;

public class BaseDonnees {
    protected StrategieTri strategieTri = null;
    protected List<String> donnees = Arrays.asList("D1",
            "D3", "D2");

    public BaseDonnees(StrategieTri strategieTri) {
        this.strategieTri = strategieTri;
    }

    public void afficheDonneesTriees() {
        List<String> donneesTriees = strategieTri
                .trie(donnees);
        for (String donnee : donneesTriees)
            System.out.println(donnee);
    }

}
