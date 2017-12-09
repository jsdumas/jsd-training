package io.jsd.training.algorithms.chapitres.chap6.devine;

public class LienDevine {
	Devine2 nombreDevine;

	public LienDevine(NombreAleatoire nombreAleatoire) {
		nombreDevine = new Devine2(nombreAleatoire);
	}

	public int propose(int tentative) {
		int resultat;
		System.out.println("Tentative : " + tentative);
		resultat = nombreDevine.propose(tentative);
		switch (resultat) {
			case -1:
				System.out.println("Le nombre e deviner est superieur e la tentative.");
				break;
			case 0:
				System.out.println("Nombre trouve");
				break;
			case 1:
				System.out.println("Le nombre e deviner est inferieur e la tentative.");
				break;
		}
		return resultat;
	}

	public void initialise() {
		nombreDevine.initialise();
	}

	public int getNombreTentatives() {
		return nombreDevine.getNombreTentatives();
	}
}
