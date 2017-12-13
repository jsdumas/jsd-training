package io.jsd.training.java.designpattern.chapitres.chap5.compositevisitorgraphe;

import java.util.ArrayList;
import java.util.List;

public class Compose extends Noeud {

    protected List<Noeud> enfants = new ArrayList<Noeud>();

    public Compose(String nom) {
        super(nom);
    }

    @Override
    public void afficheNom() {
        System.out.println("Noeud composé : " + nom);
    }

    @Override
    public void ajouteEnfant(Noeud enfant) {
        enfants.add(enfant);
    }

    @Override
    public List<Noeud> getEnfants() {
        return enfants;
    }

    @Override
    public <T> void accepte(
            VisiteurGraphe<T> visiteur) {
        visiteur.visite(this);
    }

}
