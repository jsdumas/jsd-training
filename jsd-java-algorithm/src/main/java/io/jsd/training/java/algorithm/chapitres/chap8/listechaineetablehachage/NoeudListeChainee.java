package io.jsd.training.java.algorithm.chapitres.chap8.listechaineetablehachage;

public class NoeudListeChainee {
	Donnee donnee;
	NoeudListeChainee suivant;

	public NoeudListeChainee(Donnee donnee) {
		this.donnee = donnee;
	}

	public void insere(Donnee nouvelleDonnee) {
		if (donnee.clef == nouvelleDonnee.clef) {
			donnee.valeur = nouvelleDonnee.valeur;
			return;
		}
		if (suivant == null)
			suivant = new NoeudListeChainee(nouvelleDonnee);
		else
			suivant.insere(nouvelleDonnee);
	}

	public void affiche() {
		System.out.println(donnee);
		if (suivant != null)
			suivant.affiche();
	}

	public Donnee recherche(int clef) {
		if (donnee.clef == clef)
			return donnee;
		if (suivant != null)
			return suivant.recherche(clef);
		else
			return null;
	}
}
