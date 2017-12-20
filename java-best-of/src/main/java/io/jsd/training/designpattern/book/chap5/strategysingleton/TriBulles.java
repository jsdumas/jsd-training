package io.jsd.training.designpattern.book.chap5.strategysingleton;

import java.util.ArrayList;
import java.util.List;

public class TriBulles implements StrategieTri {
    protected static TriBulles instance = null;

    private TriBulles() {
    }

    public static TriBulles getInstance() {
        if (instance == null)
            instance = new TriBulles();
        return instance;
    }

    @Override
    public <T extends Comparable<T>> List<T> trie(
            List<T> donnees) {
        ArrayList<T> resultat = new ArrayList<T>();
        for (T element : donnees)
            resultat.add(element);
        boolean trie;
        do {
            trie = true;
            for (int i = 0; i < resultat.size() - 1; i++)
                if (resultat.get(i).compareTo(
                        resultat.get(i + 1)) > 0) {
                    T temp;
                    temp = resultat.get(i);
                    resultat.set(i, resultat.get(i + 1));
                    resultat.set(i + 1, temp);
                    trie = false;
                }
        } while (!trie);
        return resultat;
    }

}
