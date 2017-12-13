package io.jsd.training.java.designpattern.chapitres.chap7.compositevisitor;

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

    public void ajouteSousNoeudGauche(Noeud sousNoeud) {
    }

    public void ajouteSousNoeudDroit(Noeud sousNoeud) {
    }

    public Noeud getSousNoeudDroit() {
        return null;
    }

    public Noeud getSousNoeudGauche() {
        return null;
    }

    public void accepteVisiteurTest(
            VisiteurTest visiteurTest) {
        visiteurTest.visite(this);
    }

}
