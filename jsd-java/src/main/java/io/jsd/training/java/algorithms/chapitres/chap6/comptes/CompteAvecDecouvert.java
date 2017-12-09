package io.jsd.training.java.algorithms.chapitres.chap6.comptes;

public class CompteAvecDecouvert extends Compte {
	long decouvertAutorise;

	public CompteAvecDecouvert() {
		decouvertAutorise = 0;
	}

	public long getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(long decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	@Override
	public boolean retire(long montant) {
		if (montant <= solde + decouvertAutorise) {
			solde -= montant;
			return true;
		} else
			return false;
	}
}
