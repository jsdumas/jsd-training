package io.jsd.training.java.designpattern.book.chap5.compositevisitorstrategy;

import java.util.ArrayList;
import java.util.List;

public class Fichier extends Noeud {

    public Fichier(String nom) {
        super(nom);
    }

    @Override
    public void ajouteSousNoeud(Noeud sousNoeud) {
    }

    @Override
    public List<Noeud> listeSousNoeuds() {
        return new ArrayList<Noeud>();
    }

    public <T1 extends StrategieVisiteur<T2>, T2> void accepteVisiteur(
            Visiteur<T1, T2> visiteur) {
        visiteur.visite(this);
    }

}
