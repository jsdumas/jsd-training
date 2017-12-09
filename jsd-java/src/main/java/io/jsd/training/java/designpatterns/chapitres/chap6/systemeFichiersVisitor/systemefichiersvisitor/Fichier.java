package io.jsd.training.java.designpatterns.chapitres.chap6.systemeFichiersVisitor.systemefichiersvisitor;

import java.util.*;

public class Fichier implements Noeud {
    protected long taille;
    protected TypeFichier typeFichier;

    public Fichier(long taille, TypeFichier typeFichier) {
        this.taille = taille;
        this.typeFichier = typeFichier;
    }

    public long getTaille() {
        return taille;
    }

    public TypeFichier getTypeFichier() {
        return typeFichier;
    }

    public void setTaille(long taille) {
        this.taille = taille;
    }

    public void setTypeFichier(TypeFichier typeFichier) {
        this.typeFichier = typeFichier;
    }

    @Override
    public List<Noeud> noeuds() {
        return new ArrayList<Noeud>();
    }

    @Override
    public void ajouteNoeud(Noeud noeud) {
    }

    @Override
    public void supprimeNoeud(Noeud noeud) {
    }

    @Override
    public void accepte(Visiteur v) {
        v.visite(this);
    }
}
