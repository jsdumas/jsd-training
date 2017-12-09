package io.jsd.training.designpatterns.chapitres.chap4.stateClassesInternes.state;

abstract class EtatPile {
    protected Pile pile;

    EtatPile(Pile pile) {
        this.pile = pile;
    }

    abstract protected EtatPile empile(int valeur);

    abstract protected EtatPile depile(
            Pile.ParamEntier paramValeur);

    abstract protected boolean peutEmpiler();

    abstract protected boolean peutDepiler();
}
