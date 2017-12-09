package io.jsd.training.designpatterns.chapitres.chap4.adapterclasseanonyme;

public interface Message {
    boolean prepare(ContenuMessage contenu);

    boolean envoie();
}
