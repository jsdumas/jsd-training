package io.jsd.training.java.designpatterns.chapitres.chap4.stategyClasseGenerique.stategyclassegenerique;

import java.util.List;

public interface StrategieTri {
    <T extends Comparable<T>> List<T> trie(List<T> donnees);
}
