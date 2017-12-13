package io.jsd.training.java.algorithm.chapitres.chap2;

public class ValeursCommunes {

	public static void main(String[] args) {
		final int taille = 10;
		int i, j;
		int nbrValeursCommunes;
		// d�claration et cr�ation des tableaux
		int[] tableau = new int[taille];
		int[] tableau2 = new int[taille];
		// remplissage des tableaux
		for (i = 0; i < taille; i++) {
			tableau[i] = (int) (Math.random() * 10) + 1;
			tableau2[i] = (int) (Math.random() * 10) + 1;
		}
		// affichage des deux tableaux
		for (i = 0; i < taille; i++)
			System.out.println("tableau[" + i + "]=" + tableau[i]);
		for (i = 0; i < taille; i++)
			System.out.println("tableau2[" + i + "]=" + tableau2[i]);
		// recherche du nombre de valeurs communes
		nbrValeursCommunes = 0;
		for (i = 0; i < taille; i++) {
			// test si tableau[i] est pr�sent dans tableau2
			j = 0;
			while ((j < taille) && (tableau2[j] != tableau[i]))
				j++;
			if (j < taille)
				nbrValeursCommunes++;
		}
		System.out.println("Nombre de valeurs communes entre les deux tableaux " + nbrValeursCommunes);
	}
}
