package io.jsd.training.chapitres.chap8.arbrebinaire;

public class NoeudArbreBinaire {
	Donnee donnee;
	NoeudArbreBinaire gauche, droite;

	public NoeudArbreBinaire(Donnee donnee) {
		this.donnee = donnee;
	}

	public void insere(Donnee nouvelleDonnee) {
		if (donnee.clef == nouvelleDonnee.clef)
			return;
		if (donnee.clef > nouvelleDonnee.clef)
			if (gauche == null)
				gauche = new NoeudArbreBinaire(nouvelleDonnee);
			else
				gauche.insere(nouvelleDonnee);
		else if (droite == null)
			droite = new NoeudArbreBinaire(nouvelleDonnee);
		else
			droite.insere(nouvelleDonnee);
	}

	public void affiche(int marge) {
		if (gauche != null)
			gauche.affiche(marge + 1);
		for (int k = 0; k < marge; k++)
			System.out.print(" ");
		System.out.println(donnee);
		if (droite != null)
			droite.affiche(marge + 1);
	}

	public Donnee recherche(int clef) {
		if (donnee.clef == clef)
			return donnee;
		else if (donnee.clef > clef)
			if (gauche == null)
				return null;
			else
				return gauche.recherche(clef);
		else if (droite == null)
			return null;
		else
			return droite.recherche(clef);
	}
}
