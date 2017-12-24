package io.jsd.training.chapitres.chap4;

public class Fraction {
	int numerateur, denominateur;

	public Fraction(int num, int den) {
		if ((num >= 0) && (den > 0)) {
			numerateur = num;
			denominateur = den;
		} else {
			numerateur = 0;
			denominateur = 1;
		}
	}

	public double reel() {
		return (double) numerateur / (double) denominateur;
	}

	public int pgcd(int a, int b) {
		int reste = a % b;
		while (reste != 0) {
			a = b;
			b = reste;
			reste = a % b;
		}
		return b;
	}

	public void reduit() {
		if (numerateur == 0)
			return;
		int pgcdNumDen = pgcd(numerateur, denominateur);
		numerateur = numerateur / pgcdNumDen;
		denominateur = denominateur / pgcdNumDen;
	}

	public Fraction addition(Fraction uneFraction) {
		Fraction resultat = new Fraction(numerateur * uneFraction.denominateur + uneFraction.numerateur * denominateur, denominateur
				* uneFraction.denominateur);
		resultat.reduit();
		return resultat;
	}
}
