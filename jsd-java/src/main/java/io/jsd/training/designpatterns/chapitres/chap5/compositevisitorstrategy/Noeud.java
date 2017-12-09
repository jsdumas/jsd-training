package io.jsd.training.designpatterns.chapitres.chap5.compositevisitorstrategy;

import java.util.List;

abstract public class Noeud {
    protected String Nom;

    public Noeud(String nom) {
        super();
        Nom = nom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    abstract public void ajouteSousNoeud(Noeud sousNoeud);

    abstract public List<Noeud> listeSousNoeuds();

    abstract public <T1 extends StrategieVisiteur<T2>, T2> void accepteVisiteur(
            Visiteur<T1, T2> visiteur);

}
