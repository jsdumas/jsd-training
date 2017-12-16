package io.jsd.training.java.designpattern.book.chap4.stateClassesInternes.state;

class EtatPlein extends EtatPile {

    protected EtatPlein(Pile pile) {
        super(pile);
    }

    protected EtatPile depile(Pile.ParamEntier paramValeur) {
        pile.sommet--;
        paramValeur.valeur = pile.contenuPile[pile.sommet];
        return pile.etatNormal;
    }

    protected EtatPile empile(int valeur) {
        return this;
    }

    protected boolean peutEmpiler() {
        return false;
    }

    protected boolean peutDepiler() {
        return true;
    }

}
