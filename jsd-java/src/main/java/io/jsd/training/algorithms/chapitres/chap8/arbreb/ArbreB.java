package io.jsd.training.algorithms.chapitres.chap8.arbreb;

public class ArbreB {
	NoeudArbreB racine;
	int ordre;

	public ArbreB(int ordre) {
		this.ordre = ordre;
		racine = new NoeudArbreB(ordre);
	}

	public void insere(int nouvelleClef, String donnee) {
		Donnee nouvelleDonnee = new Donnee(nouvelleClef, donnee);
		NoeudArbreB noeudDroitNouvelleDonnee = new NoeudArbreB(ordre);
		nouvelleDonnee = racine.insere(nouvelleDonnee, noeudDroitNouvelleDonnee);
		if (nouvelleDonnee == null)
			return;
		NoeudArbreB nouvelleRacine = new NoeudArbreB(ordre);
		nouvelleRacine.donnees[0] = nouvelleDonnee;
		nouvelleRacine.enfants[0] = racine;
		nouvelleRacine.enfants[1] = noeudDroitNouvelleDonnee;
		nouvelleRacine.nbrDonnees = 1;
		racine = nouvelleRacine;
	}

	public void affiche() {
		racine.affiche(0);
	}

	public Donnee recherche(int clef) {
		return racine.recherche(clef);
	}
}
