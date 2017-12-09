package io.jsd.training.algorithms.chapitres.chap6.comptes;

public abstract class Compte {
	long solde;

	public Compte() {
		solde = 0;
	}

	public long getSolde() {
		return solde;
	}

	public void ajoute(long montant) {
		solde += montant;
	}

	public abstract boolean retire(long montant);
}
