package io.jsd.training.java.algorithm.chapitres.chap6.devine;

public class DevineNombre2 {
	LienDevine lien;
	NombreAleatoire nbrAleatoire;

	public DevineNombre2(NombreAleatoire nbrAleatoire) {
		this.nbrAleatoire = nbrAleatoire;
		this.lien = new LienDevine(nbrAleatoire);
	}

	public int devine() {
		int borneInf = nbrAleatoire.getBorneInf();
		int borneSup = nbrAleatoire.getBorneSup();
		int milieu, reponse;
		lien.initialise();
		do {
			milieu = (borneInf + borneSup) / 2;
			reponse = lien.propose(milieu);
			if (reponse == 1)
				borneSup = milieu - 1;
			else if (reponse == -1)
				borneInf = milieu + 1;
		} while (reponse != 0);
		return lien.getNombreTentatives();
	}
}
