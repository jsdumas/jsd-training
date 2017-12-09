package io.jsd.training.designpatterns.chapitres.chap4.stategyClasseGenerique.strategy;

import java.util.List;

public interface StrategieTri {
    <T extends Comparable<T>> List<T> trie(List<T> donnees);
}
