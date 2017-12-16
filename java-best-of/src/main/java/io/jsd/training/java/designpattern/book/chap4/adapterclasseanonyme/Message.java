package io.jsd.training.java.designpattern.book.chap4.adapterclasseanonyme;

public interface Message {
    boolean prepare(ContenuMessage contenu);

    boolean envoie();
}
