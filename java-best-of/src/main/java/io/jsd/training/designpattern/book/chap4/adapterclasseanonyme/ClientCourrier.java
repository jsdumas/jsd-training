package io.jsd.training.designpattern.book.chap4.adapterclasseanonyme;

public class ClientCourrier {
    protected Courrier courrier;

    public ClientCourrier(Courrier courrier) {
        super();
        this.courrier = courrier;
    }

    public void traitementCourrier(String[] destinataires) {

        for (String destinataire : destinataires) {
            try {
                courrier
                        .prepare(destinataire,
                                "admin@admin.com",
                                "Mise à jour",
                                "Merci de mettre à jour vos données");
            } catch (Courrier.ExceptionMessageIncorrect e) {
                System.out
                        .println("Adresse incorrecte : "
                                + destinataire);
                continue;
            }
            try {
                courrier.envoie();
                System.out.println("Message envoyé à : "
                        + destinataire);
            } catch (Courrier.ExceptionEnvoiMessage e) {
                System.out
                        .println("Message non envoyé à : "
                                + destinataire);
            }
        }
    }
}
