package io.jsd.training.java.designpattern.chapitres.chap7.observer;

public class Personne extends Sujet {
    protected String nom;
    protected String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        notifie("nom", nom);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
        notifie("prenom", prenom);
    }

}
