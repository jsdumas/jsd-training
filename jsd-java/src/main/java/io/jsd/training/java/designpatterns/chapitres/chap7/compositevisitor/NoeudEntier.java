package io.jsd.training.java.designpatterns.chapitres.chap7.compositevisitor;

public class NoeudEntier implements Noeud {

    protected int valeur;

    public NoeudEntier(int valeur) {
        super();
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public void ajouteSousNoeudGauche(Noeud sousNoeud) {
    }

    @Override
    public void ajouteSousNoeudDroit(Noeud sousNoeud) {
    }

    @Override
    public Noeud getSousNoeudDroit() {
        return null;
    }

    @Override
    public Noeud getSousNoeudGauche() {
        return null;
    }

    @Override
    public void accepteVisiteurTest(
            VisiteurTest visiteurTest) {
        visiteurTest.visite(this);
    }

}
