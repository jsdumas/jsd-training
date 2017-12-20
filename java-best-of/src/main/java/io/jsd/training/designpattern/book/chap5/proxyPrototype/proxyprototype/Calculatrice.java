package io.jsd.training.designpattern.book.chap5.proxyPrototype.proxyprototype;

public class Calculatrice implements Cloneable {
    @Override
    public Calculatrice clone()
            throws CloneNotSupportedException {
        return (Calculatrice) super.clone();
    }

    protected int valeur = 0;

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void ajoute(int montant) {
        valeur = valeur + montant;
    }

    public void soustrait(int montant) {
        valeur = valeur - montant;
    }

    public void multiplie(int coefficient) {
        valeur = valeur * coefficient;
    }

}
