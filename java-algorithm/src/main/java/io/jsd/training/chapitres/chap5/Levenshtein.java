package io.jsd.training.chapitres.chap5;

import java.util.Scanner;

public class Levenshtein {

	public static int distanceLevenshtein(String s1, String s2) {
		int[][] M = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i <= s1.length(); i++)
			M[i][0] = i;
		for (int j = 0; j <= s2.length(); j++)
			M[0][j] = j;
		for (int i = 1; i <= s1.length(); i++)
			for (int j = 1; j <= s2.length(); j++) {
				int diff;
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					diff = 0;
				else
					diff = 1;
				M[i][j] = Math.min(Math.min(M[i - 1][j] + 1, M[i][j - 1] + 1), M[i - 1][j - 1] + diff);
			}
		return M[s1.length()][s2.length()];
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le premier mot : ");
		String s1 = reader.nextLine();
		System.out.print("Entrez le second mot : ");
		String s2 = reader.nextLine();
		System.out.println("La distance de Levenshtein est de : " + distanceLevenshtein(s1, s2));
	}
}
