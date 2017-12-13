package io.jsd.training.java.algorithm.chapitres.chap6.comptes;

import java.util.Scanner;

public class TestComptes {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Compte monCompte;
		System.out.print("Desirez-vous un compte avec decouvert (O/N) ");
		String choix = reader.next();
		if (choix.equals("O") || choix.equals("o")) {
			System.out.print("Saisissez la valeur du decouvert autorise : ");
			long decouvertAutorise = reader.nextLong();
			CompteAvecDecouvert monCompteAvecDecouvert = new CompteAvecDecouvert();
			monCompteAvecDecouvert.setDecouvertAutorise(decouvertAutorise);
			monCompte = monCompteAvecDecouvert;
		} else {
			monCompte = new CompteClassique();
		}
		System.out.print("Saisissez la valeur du depet : ");
		long montant = reader.nextLong();
		monCompte.ajoute(montant);
		System.out.print("Saisissez la valeur du retrait : ");
		montant = reader.nextLong();
		if (monCompte.retire(montant))
			System.out.println("Retrait autorise");
		else
			System.out.println("Retrait non autorise");
		System.out.println("Nouvelle valeur du solde : " + monCompte.getSolde());
	}
}
