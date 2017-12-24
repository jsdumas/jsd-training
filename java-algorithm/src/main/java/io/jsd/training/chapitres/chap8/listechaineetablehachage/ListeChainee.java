package io.jsd.training.chapitres.chap8.listechaineetablehachage;

public class ListeChainee {
	NoeudListeChainee racine;

	public void insere(int nouvelleClef, String donnee) {
		Donnee nouvelleDonnee = new Donnee(nouvelleClef, donnee);
		if (racine == null)
			racine = new NoeudListeChainee(nouvelleDonnee);
		else
			racine.insere(nouvelleDonnee);
	}

	public void affiche() {
		if (racine != null)
			racine.affiche();
	}

	public Donnee recherche(int clef) {
		if (racine != null)
			return racine.recherche(clef);
		else
			return null;
	}
}
