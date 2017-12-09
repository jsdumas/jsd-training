package io.jsd.training.designpatterns.chapitres.chap4.adapterclasseanonyme;

public interface Courrier {
    public class ExceptionEnvoiMessage extends Exception {
    }

    public class ExceptionMessageIncorrect extends
            Exception {
    }

    void prepare(String destinataire, String emetteur,
            String sujet, String corps)
            throws ExceptionMessageIncorrect;

    void envoie() throws ExceptionEnvoiMessage;
}
