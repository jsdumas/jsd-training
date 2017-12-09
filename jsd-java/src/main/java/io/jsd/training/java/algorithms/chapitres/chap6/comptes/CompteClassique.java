package io.jsd.training.java.algorithms.chapitres.chap6.comptes;

public class CompteClassique extends Compte {

	@Override
	public boolean retire(long montant) {
		if (montant <= solde) {
			solde -= montant;
			return true;
		} else
			return false;
	}
}
