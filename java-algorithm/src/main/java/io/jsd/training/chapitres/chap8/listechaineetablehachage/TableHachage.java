package io.jsd.training.chapitres.chap8.listechaineetablehachage;

public class TableHachage {
	final int tailleTable = 10;

	ListeChainee table[] = new ListeChainee[tailleTable];

	public int fonctionHachage(int nouvelleClef) {
		return nouvelleClef % tailleTable;
	}

	public void insere(int nouvelleClef, String donnee) {
		int i = fonctionHachage(nouvelleClef);
		if (table[i] == null)
			table[i] = new ListeChainee();
		table[i].insere(nouvelleClef, donnee);
	}

	public void affiche() {
		for (int i = 0; i < tailleTable; i++)
			if (table[i] != null)
				table[i].affiche();
	}

	public Donnee recherche(int clef) {
		int indice = fonctionHachage(clef);
		if (table[indice] != null)
			return table[indice].recherche(clef);
		else
			return null;
	}
}
