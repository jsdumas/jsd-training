package io.jsd.training.java.designpattern.chapitres.chap4.adapterclasseanonyme;

public class ExempleAdapter {

    public static void main(String[] args) {
        ClientCourrier monClientCourrier = new ClientCourrier(
                new Courrier() {
                    protected Message message = new MessageImpl();

                    public void prepare(
                            String destinataire,
                            String emetteur,
                            String sujet, String corps)
                            throws ExceptionMessageIncorrect {
                        if (!message
                                .prepare(new ContenuMessage(
                                        destinataire,
                                        emetteur, sujet,
                                        corps)))
                            throw new ExceptionMessageIncorrect();
                    }

                    public void envoie()
                            throws ExceptionEnvoiMessage {
                        if (!message.envoie())
                            throw new ExceptionEnvoiMessage();
                    }
                });
        monClientCourrier
                .traitementCourrier(new String[] {
                        "adresse1@domaine1", "adresse2" });
    }
}
