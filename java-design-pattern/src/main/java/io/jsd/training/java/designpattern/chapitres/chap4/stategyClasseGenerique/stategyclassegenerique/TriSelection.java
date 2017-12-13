package io.jsd.training.java.designpattern.chapitres.chap4.stategyClasseGenerique.stategyclassegenerique;

import java.util.ArrayList;
import java.util.List;

public class TriSelection implements StrategieTri {

    public <T extends Comparable<T>> List<T> trie(
            List<T> donnees) {
        ArrayList<T> resultat = new ArrayList<T>();
        for (T element : donnees)
            resultat.add(element);
        for (int i = 0; i < resultat.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < resultat.size(); j++)
                if (resultat.get(j).compareTo(
                        resultat.get(minIndex)) < 0)
                    minIndex = j;
            T temp;
            temp = resultat.get(i);
            resultat.set(i, resultat.get(minIndex));
            resultat.set(minIndex, temp);
        }
        return resultat;
    }

}
