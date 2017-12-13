package io.jsd.training.java.designpattern.chapitres.chap5.compositevisitorgraphe;

import java.util.ArrayList;
import java.util.List;

public class Feuille extends Noeud {

    public Feuille(String nom) {
        super(nom);
    }

    @Override
    public void afficheNom() {
        System.out.println("Feuille : " + nom);
    }

    @Override
    public void ajouteEnfant(Noeud enfant) {
    }

    @Override
    public List<Noeud> getEnfants() {
        return new ArrayList<Noeud>();
    }

    @Override
    public <T> void accepte(
            VisiteurGraphe<T> visiteur) {
        visiteur.visite(this);
    }

}
