package io.jsd.training.java.designpattern.book.chap5.compositevisitorstrategy;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Noeud {
    protected List<Noeud> sousNoeuds = new ArrayList<Noeud>();

    public Repertoire(String nom) {
        super(nom);
    }

    @Override
    public void ajouteSousNoeud(Noeud sousNoeud) {
        sousNoeuds.add(sousNoeud);
    }

    @Override
    public List<Noeud> listeSousNoeuds() {
        return sousNoeuds;
    }

    public <T1 extends StrategieVisiteur<T2>, T2> void accepteVisiteur(
            Visiteur<T1, T2> visiteur) {
        visiteur.visite(this);
    }

}
