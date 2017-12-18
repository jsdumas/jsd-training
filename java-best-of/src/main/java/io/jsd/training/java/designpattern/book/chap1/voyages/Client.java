package io.jsd.training.java.designpattern.book.chap1.voyages;

import java.util.*;

@SuppressWarnings("unchecked")
public class Client {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ConstructeurVoyage constructeur;
		Voyage voyage;
		System.out.print(
				"Quelle gamme de voyage désirez vous composer? " + "Voyage de luxe (1) ou Voyage economique (2) :");
		String choix = reader.next();
		if (choix.equals("1")) {
			constructeur = new ConstructeurVoyageLuxe();
		} else {
			constructeur = new ConstructeurVoyageEconomique();
		}
		System.out.print("Désirez-vous inclure les vols? " + "Oui (1) ou Non (2) :");
		choix = reader.next();
		if (choix.equals("1")) {
			constructeur.ajouteVol();
		}
		System.out.print("Désirez-vous inclure l'hebergement dans un hotel? " + "Oui (1) ou Non (2) :");
		choix = reader.next();
		if (choix.equals("1")) {
			constructeur.ajouteHotel();
		}
		System.out.print("Désirez-vous inclure les repas? " + "Oui (1) ou Non (2) :");
		choix = reader.next();
		if (choix.equals("1")) {
			constructeur.ajouteRepas();
		}
		System.out.print("Désirez-vous inclure des activités? " + "Oui (1) ou Non (2) :");
		choix = reader.next();
		if (choix.equals("1")) {
			constructeur.ajouteActivites();
		}
		voyage = constructeur.composeVoyage();
		voyage.affiche();

	}
}
