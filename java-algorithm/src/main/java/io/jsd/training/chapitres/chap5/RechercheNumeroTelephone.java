package io.jsd.training.chapitres.chap5;

import java.util.Scanner;

public class RechercheNumeroTelephone {

	public static boolean deuxChiffres(String texte, int position) {
		final int premierIndiceImpossible = 1;
		if (position >= texte.length() - premierIndiceImpossible)
			return false;
		char c = texte.charAt(position);
		char c1 = texte.charAt(position + 1);
		return ((c >= '0') && (c <= '9') && (c1 >= '0') && (c1 <= '9'));
	}

	public static boolean deuxChiffresUnPoint(String texte, int position) {
		final int premierIndiceImpossible = 2;
		if (position >= texte.length() - premierIndiceImpossible)
			return false;
		return deuxChiffres(texte, position) && (texte.charAt(position + 2) == '.');
	}

	public static boolean numeroTel(String texte, int position) {
		final int nombrePoints = 4;
		final int premierIndiceImpossible = 13;

		int i, positionTexte;

		if (position >= texte.length() - premierIndiceImpossible)
			return false;
		i = 0;
		positionTexte = position;
		while ((i < nombrePoints) && deuxChiffresUnPoint(texte, positionTexte)) {
			i++;
			positionTexte += 3;
		}
		if (i == nombrePoints) {
			if (deuxChiffres(texte, positionTexte))
				return true;
		}
		return false;
	}

	public static String RechercheNumTel(String texte) {
		final int longeurNumero = 14;
		int i = 0;
		int len = texte.length();
		while ((i <= len - longeurNumero) && !numeroTel(texte, i))
			i++;
		if (i <= len - longeurNumero)
			return texte.substring(i, i + longeurNumero);
		else
			return null;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le texte : ");
		String texte = reader.nextLine();
		String numTel = RechercheNumTel(texte);
		if (numTel != null)
			System.out.println("Le numero de telephone est : " + numTel);
		else
			System.out.println("Aucun numero de telephone n'a ete trouve.");
	}
}
