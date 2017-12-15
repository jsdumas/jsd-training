package io.jsd.training.java.designpattern.book.chap4.stategyClasseGenerique.stategyclassegenerique;

public class Test {

	public static void main(String[] args) {
		BaseDonnees<TriJava> maBase = new BaseDonnees<TriJava>(TriJava.class);
		maBase.afficheDonneesTriees();

		BaseDonnees<TriBulles> maBase2 = new BaseDonnees<TriBulles>(
				TriBulles.class);
		maBase2.afficheDonneesTriees();

		BaseDonnees<TriSelection> maBase3 = new BaseDonnees<TriSelection>(
				TriSelection.class);
		maBase3.afficheDonneesTriees();
	}

}
