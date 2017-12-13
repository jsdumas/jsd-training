package io.jsd.training.java.designpattern.chapitres.chap4.compositeplusieursparents;

import java.util.Set;
import java.util.HashSet;

public class Interface extends Noeud {

    protected Set<Noeud> enfants = new HashSet<Noeud>();

    public Interface(String nom) {
        super(nom);
    }

    @Override
    public Set<Noeud> tousLesEnfants() {
        Set<Noeud> resultat = new HashSet<Noeud>();
        for (Noeud enfant : enfants) {
            resultat.add(enfant);
            resultat.addAll(enfant.tousLesEnfants());
        }
        return resultat;
    }

    @Override
    public void ajouteEnfant(Noeud enfant) {
        enfants.add(enfant);
        enfant.ajouteInterfaceParent(this);
    }

    @Override
    public void afficheNom() {
        System.out.println("Interface : " + nom);
    }

}
