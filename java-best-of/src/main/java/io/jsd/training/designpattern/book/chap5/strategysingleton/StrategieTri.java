package io.jsd.training.designpattern.book.chap5.strategysingleton;

import java.util.List;

public interface StrategieTri {
    <T extends Comparable<T>> List<T> trie(List<T> donnees);
}
