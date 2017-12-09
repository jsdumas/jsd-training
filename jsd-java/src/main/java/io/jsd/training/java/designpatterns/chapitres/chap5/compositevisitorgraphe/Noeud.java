package io.jsd.training.java.designpatterns.chapitres.chap5.compositevisitorgraphe;

public abstract class Noeud implements NoeudIntf {
    protected String nom;

    public Noeud(String nom) {
        this.nom = nom;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

}
