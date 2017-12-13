package io.jsd.training.java.designpattern.chapitres.chap5.proxyPrototype.proxy;

public class Calculatrice {
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
