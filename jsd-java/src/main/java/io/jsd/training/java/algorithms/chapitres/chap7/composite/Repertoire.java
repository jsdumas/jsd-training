package io.jsd.training.java.algorithms.chapitres.chap7.composite;

public class Repertoire implements Noeud {
	final int nbrMaxNoeuds = 10;
	Noeud[] noeuds = new Noeud[nbrMaxNoeuds];
	int nbrNoeuds = 0;

	@Override
	public long nombreFichiers() {
		int resultat = 0;
		for (int i = 0; i < nbrNoeuds; i++)
			resultat += noeuds[i].nombreFichiers();
		return resultat;
	}

	@Override
	public long nombreRepertoires() {
		int resultat = 1; // y compris le repertoire lui-meme
		for (int i = 0; i < nbrNoeuds; i++)
			resultat += noeuds[i].nombreRepertoires();
		return resultat;
	}

	public boolean ajouteNoeud(Noeud noeud) {
		int j = 0;
		while ((j < nbrNoeuds) && (noeuds[j] != noeud))
			j++;
		if (j == nbrNoeuds) {
			if (nbrNoeuds == nbrMaxNoeuds)
				return false;
			noeuds[nbrNoeuds] = noeud;
			nbrNoeuds++;
		}
		return true;
	}
}
