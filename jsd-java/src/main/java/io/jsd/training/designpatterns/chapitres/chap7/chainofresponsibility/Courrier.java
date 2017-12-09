package io.jsd.training.designpatterns.chapitres.chap7.chainofresponsibility;

public class Courrier {
    public enum Categorie {
        ADMINISTRATIF, COMMERCIAL, COMPTABLE;
    }

    protected Categorie categorie;
    protected String contenu;

    public Courrier(Categorie categorie, String contenu) {
        super();
        this.categorie = categorie;
        this.contenu = contenu;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public String getContenu() {
        return contenu;
    }

}
