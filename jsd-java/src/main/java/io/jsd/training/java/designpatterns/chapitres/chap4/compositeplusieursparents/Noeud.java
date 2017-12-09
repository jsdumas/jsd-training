package io.jsd.training.java.designpatterns.chapitres.chap4.compositeplusieursparents;

import java.util.HashSet;
import java.util.Set;

public abstract class Noeud {
    protected String nom;
    protected Set<Interface> interfacesParents = new HashSet<Interface>();

    public Set<Interface> toutesLesInterfacesParents() {
        Set<Interface> resultat = new HashSet<Interface>();
        for (Interface interfaceParent : interfacesParents) {
            resultat.add(interfaceParent);
            resultat.addAll(interfaceParent
                    .toutesLesInterfacesParents());
        }
        return resultat;
    }

    abstract public Set<Noeud> tousLesEnfants();

    abstract public void ajouteEnfant(Noeud enfant);

    protected void ajouteInterfaceParent(
            Interface interfaceParent) {
        interfacesParents.add(interfaceParent);
    }

    public Noeud(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    abstract public void afficheNom();

}
