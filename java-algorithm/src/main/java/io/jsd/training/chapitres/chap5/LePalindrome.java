package io.jsd.training.chapitres.chap5;

import java.util.Scanner;

public class LePalindrome {

	public static boolean palindrome(String texte) {
		String texteSansEspace;
		texteSansEspace = "";
		for (int i = 0; i < texte.length(); i++) {
			char c = texte.charAt(i);
			if (c != ' ')
				texteSansEspace = texteSansEspace + c;
		}
		int i = 0;
		int len = texteSansEspace.length();
		while ((i < len / 2) && (texteSansEspace.charAt(i) == texteSansEspace.charAt(len - 1 - i)))
			i++;
		return (i == len / 2);
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String texte;
		System.out.print("Entrez un texte : ");
		texte = reader.nextLine();
		if (palindrome(texte))
			System.out.print(texte + " est un palindrome.");
		else
			System.out.print(texte + " n'est pas un palindrome.");
	}
}
