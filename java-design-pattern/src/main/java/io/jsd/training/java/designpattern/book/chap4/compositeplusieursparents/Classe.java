package io.jsd.training.java.designpattern.book.chap4.compositeplusieursparents;

import java.util.HashSet;
import java.util.Set;

public class Classe extends Noeud {

    public Classe(String nom) {
        super(nom);
    }

    @Override
    public Set<Noeud> tousLesEnfants() {
        return new HashSet<Noeud>();
    }

    @Override
    public void ajouteEnfant(Noeud enfant) {
    }

    @Override
    public void afficheNom() {
        System.out.println("Classe : " + nom);
    }
}
