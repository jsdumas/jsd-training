package io.jsd.training.java.designpatterns.chapitres.chap5.strategysingleton;

import java.util.List;

public interface StrategieTri {
    <T extends Comparable<T>> List<T> trie(List<T> donnees);
}
