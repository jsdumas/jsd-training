package io.jsd.training.chapitres.chap8.arbrebinaire;

public class ArbreBinaire {
	NoeudArbreBinaire racine;

	public void insere(int nouvelleClef, String donnee) {
		Donnee nouvelleDonnee = new Donnee(nouvelleClef, donnee);
		if (racine == null)
			racine = new NoeudArbreBinaire(nouvelleDonnee);
		else
			racine.insere(nouvelleDonnee);
	}

	public void affiche() {
		if (racine != null)
			racine.affiche(0);
	}

	public Donnee recherche(int clef) {
		if (racine != null)
			return racine.recherche(clef);
		else
			return null;
	}
}
