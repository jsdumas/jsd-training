package io.jsd.training.java.algorithms.chapitres.chap8.arbreb;

public class NoeudArbreB {
	Donnee donnees[];
	NoeudArbreB enfants[];
	int ordre;
	int nbrDonnees;

	public NoeudArbreB(int ordre) {
		this.ordre = ordre;
		donnees = new Donnee[2 * ordre];
		enfants = new NoeudArbreB[2 * ordre + 1];
		nbrDonnees = 0;
	}

	public Donnee insere(Donnee nouvelleDonnee, NoeudArbreB noeudDroitRetourne) {
		int i;
		NoeudArbreB noeudDroitNouvelleDonnee;
		// insertion de la nouvelle donnee dans un enfant si le noeud en possede
		noeudDroitNouvelleDonnee = null;
		i = 0;
		while ((i < nbrDonnees) && (donnees[i].clef < nouvelleDonnee.clef))
			i++;
		if (i == nbrDonnees) {
			if (enfants[nbrDonnees] != null) {
				noeudDroitNouvelleDonnee = new NoeudArbreB(ordre);
				nouvelleDonnee = enfants[nbrDonnees].insere(nouvelleDonnee, noeudDroitNouvelleDonnee);
			}
		} else {
			if (donnees[i].clef == nouvelleDonnee.clef) {
				// donnee deje presente
				donnees[i] = nouvelleDonnee;
				return null;
			} else if (enfants[i] != null) {
				noeudDroitNouvelleDonnee = new NoeudArbreB(ordre);
				nouvelleDonnee = enfants[i].insere(nouvelleDonnee, noeudDroitNouvelleDonnee);
			}
		}
		if (nouvelleDonnee == null)
			return null;
		// insertion de la nouvelle donnee
		i = 0;
		while ((i < nbrDonnees) && (donnees[i].clef < nouvelleDonnee.clef))
			i++;
		if ((i < nbrDonnees) && (donnees[i].clef == nouvelleDonnee.clef)) {
			// donnee deje presente
			donnees[i] = nouvelleDonnee;
			return null;
		}
		if (i < nbrDonnees) {
			// i est le plus petit indice tel que
			// donnees[i].clef > nouvelleDonnee.clef
			Donnee tempNouvelleDonnee = donnees[nbrDonnees - 1];
			NoeudArbreB tempNoeudDroitNouvelleClef = enfants[nbrDonnees];
			for (int j = nbrDonnees - 1; j > i; j--) {
				donnees[j] = donnees[j - 1];
				enfants[j + 1] = enfants[j];
			}
			donnees[i] = nouvelleDonnee;
			enfants[i + 1] = noeudDroitNouvelleDonnee;
			nouvelleDonnee = tempNouvelleDonnee;
			noeudDroitNouvelleDonnee = tempNoeudDroitNouvelleClef;
		}
		// il faut maintenant inserer au niveau de nbrDonnees
		// premier cas : le noeud n'est pas complet
		if (nbrDonnees < 2 * ordre) {
			donnees[nbrDonnees] = nouvelleDonnee;
			enfants[nbrDonnees + 1] = noeudDroitNouvelleDonnee;
			nbrDonnees++;
			return null;
		}
		// second cas, le noeud est complet, il faut le scinder et creer un
		// nouveau noeud, la donnee[ordre] ne va plus y figurer mais va etre
		// inseree dans le noeud pere
		else {
			// le nouveau noeud va contenir toutes les valeurs allant de ordre+1
			// jusqu'e nbrDonnees-1 ainsi que la nouvelle donnee
			for (int j = 0; j < ordre - 1; j++) {
				noeudDroitRetourne.donnees[j] = donnees[ordre + j + 1];
				noeudDroitRetourne.enfants[j + 1] = enfants[ordre + j + 2];
			}
			// le premier enfant du nouveau noeud est l'enfant droit de la
			// donnee[ordre]
			noeudDroitRetourne.enfants[0] = enfants[ordre + 1];
			// insertion de la nouvelle donnee dans le nouveau noeud en ordre-1
			noeudDroitRetourne.donnees[ordre - 1] = nouvelleDonnee;
			noeudDroitRetourne.enfants[ordre] = noeudDroitNouvelleDonnee;
			// fixation du nombre de donnees des deux noeuds
			noeudDroitRetourne.nbrDonnees = ordre;
			nbrDonnees = ordre;
			return donnees[ordre];
		}
	}

	public void affiche(int marge) {
		if (enfants[0] != null)
			enfants[0].affiche(marge + 1);
		for (int j = 0; j < nbrDonnees; j++) {
			for (int k = 0; k < marge; k++)
				System.out.print(" ");
			System.out.println(donnees[j]);
			if (enfants[j + 1] != null)
				enfants[j + 1].affiche(marge + 1);
		}
	}

	public Donnee recherche(int clef) {
		int i;
		i = 0;
		while ((i < nbrDonnees) && (donnees[i].clef < clef))
			i++;
		if (i == nbrDonnees)
			if (enfants[nbrDonnees] != null)
				return enfants[nbrDonnees].recherche(clef);
			else
				return null;
		else if (donnees[i].clef == clef)
			return donnees[i];
		else if (enfants[i] != null)
			return enfants[i].recherche(clef);
		else
			return null;
	}
}
