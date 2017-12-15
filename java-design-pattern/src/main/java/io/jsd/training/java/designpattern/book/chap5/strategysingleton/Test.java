package io.jsd.training.java.designpattern.book.chap5.strategysingleton;

public class Test {

	public static void main(String[] args) {
		BaseDonnees maBase = new BaseDonnees(TriJava.getInstance());
		maBase.afficheDonneesTriees();

		BaseDonnees maBase2 = new BaseDonnees(TriBulles.getInstance());
		maBase2.afficheDonneesTriees();

		BaseDonnees maBase3 = new BaseDonnees(TriSelection.getInstance());
		maBase3.afficheDonneesTriees();
	}

}
