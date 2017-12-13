package io.jsd.training.java.designpattern.chapitres.chap5.interpreterCompositeVisitor.interpretercomposite;

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
    public int valeurNoeud() {
        return getValeur();
    }

}
