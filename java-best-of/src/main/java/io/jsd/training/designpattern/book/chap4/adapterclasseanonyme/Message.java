package io.jsd.training.designpattern.book.chap4.adapterclasseanonyme;

public interface Message {
    boolean prepare(ContenuMessage contenu);

    boolean envoie();
}
