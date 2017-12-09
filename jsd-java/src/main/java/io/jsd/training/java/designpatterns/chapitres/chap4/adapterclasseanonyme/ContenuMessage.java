package io.jsd.training.java.designpatterns.chapitres.chap4.adapterclasseanonyme;

public class ContenuMessage {
    private String destinataire;
    private String emetteur;
    private String sujet;
    private String corps;

    public ContenuMessage(String destinataire,
            String emetteur, String sujet, String corps) {
        super();
        this.destinataire = destinataire;
        this.emetteur = emetteur;
        this.sujet = sujet;
        this.corps = corps;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }
}
