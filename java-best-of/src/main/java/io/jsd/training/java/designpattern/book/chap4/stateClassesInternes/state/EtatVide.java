package io.jsd.training.java.designpattern.book.chap4.stateClassesInternes.state;

class EtatVide extends EtatPile {

    protected EtatVide(Pile pile) {
        super(pile);
    }

    protected EtatPile depile(Pile.ParamEntier paramValeur) {
        paramValeur.valeur = null;
        return this;
    }

    protected EtatPile empile(int valeur) {
        pile.contenuPile[pile.sommet] = valeur;
        pile.sommet++;
        return pile.etatNormal;
    }

    protected boolean peutEmpiler() {
        return true;
    }

    protected boolean peutDepiler() {
        return false;
    }

}
