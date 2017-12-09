package io.jsd.training.java.designpatterns.chapitres.chap5.strategysingleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriJava implements StrategieTri {
    protected static TriJava instance = null;

    private TriJava() {
    }

    public static TriJava getInstance() {
        if (instance == null)
            instance = new TriJava();
        return instance;
    }

    @Override
    public <T extends Comparable<T>> List<T> trie(
            List<T> donnees) {
        ArrayList<T> resultat = new ArrayList<T>();
        for (T element : donnees)
            resultat.add(element);
        Collections.sort(resultat);
        return resultat;
    }

}
