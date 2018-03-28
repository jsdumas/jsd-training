package io.jsd.training.designpattern.book.chap7.chainofresponsibility;

import org.junit.Test;

public class TestChaine {

	@Test
	public void testChaine() {

		Comptable comptable = new Comptable(null);
		Commercial commercial = new Commercial(new DecorateurEmployeTest(comptable, Courrier.Categorie.COMPTABLE));
		Secretaire secretaire = new Secretaire(new DecorateurEmployeTest(commercial, Courrier.Categorie.COMMERCIAL));

		Employe tete = new DecorateurEmployeTest(secretaire, Courrier.Categorie.ADMINISTRATIF);

		tete.gereCourrier(new Courrier(Courrier.Categorie.COMPTABLE, "lettre 1"));
		tete.gereCourrier(new Courrier(Courrier.Categorie.ADMINISTRATIF, "lettre 2"));
		tete.gereCourrier(new Courrier(Courrier.Categorie.COMMERCIAL, "lettre 3"));
	}

}
