package io.jsd.training.java.designpatterns.chapitres.chap4.stateClassesInternes.state;

class EtatNormal extends EtatPile {

    protected EtatNormal(Pile pile) {
        super(pile);
    }

    protected EtatPile depile(Pile.ParamEntier paramValeur) {
        pile.sommet--;
        paramValeur.valeur = pile.contenuPile[pile.sommet];
        if (pile.sommet == 0)
            return pile.etatVide;
        return this;
    }

    protected EtatPile empile(int valeur) {
        pile.contenuPile[pile.sommet] = valeur;
        pile.sommet++;
        if (pile.sommet == pile.tailleMax)
            return pile.etatPlein;
        return this;
    }

    protected boolean peutEmpiler() {
        return true;
    }

    protected boolean peutDepiler() {
        return true;
    }

}
