package io.jsd.training.java.designpattern.book.chap1.connexions;
public abstract class Connexion {
    protected String utilisateur;
    protected String motdepasse;

    public Connexion(String utilisateur, String motdepasse) {
        this.utilisateur = utilisateur;
        this.motdepasse = motdepasse;
    }

    public abstract void getDescription();
}
