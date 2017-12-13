package io.jsd.training.java.algorithm.chapitres.chap7.composite;

public class SystemeFichiers {

	public static void main(String[] args) {
		Repertoire systeme = new Repertoire();
		Repertoire repertoire1 = new Repertoire();
		Repertoire repertoire2 = new Repertoire();
		repertoire1.ajouteNoeud(new Fichier());
		repertoire1.ajouteNoeud(new Fichier());
		repertoire2.ajouteNoeud(new Fichier());
		repertoire2.ajouteNoeud(new Fichier());
		repertoire2.ajouteNoeud(new Fichier());
		systeme.ajouteNoeud(repertoire1);
		systeme.ajouteNoeud(repertoire2);
		systeme.ajouteNoeud(new Fichier());
		System.out.println(" Nombre de fichiers dans le systeme : " + systeme.nombreFichiers());
		System.out.println(" Nombre de repertoire dans le systeme : " + systeme.nombreRepertoires());
	}
}
