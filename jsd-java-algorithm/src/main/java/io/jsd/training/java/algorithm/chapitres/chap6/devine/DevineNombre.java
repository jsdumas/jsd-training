package io.jsd.training.java.algorithm.chapitres.chap6.devine;

public class DevineNombre {
	DevineNombreES devineES;

	public DevineNombre() {
		devineES = new DevineNombreES();
	}

	public int devine(int inf, int sup) {
		int borneInf = inf;
		int borneSup = sup;
		int nbrTentatives = 0;
		int milieu, reponse;
		do {
			nbrTentatives++;
			milieu = (borneInf + borneSup) / 2;
			reponse = devineES.propose(milieu);
			if (reponse == 1)
				borneSup = milieu - 1;
			else if (reponse == -1)
				borneInf = milieu + 1;
		} while (reponse != 0);
		return nbrTentatives;
	}
}
