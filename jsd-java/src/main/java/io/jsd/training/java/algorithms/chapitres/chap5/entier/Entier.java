package io.jsd.training.java.algorithms.chapitres.chap5.entier;

public class Entier {
	int valeur;

	public Entier(int valeur) {
		this.valeur = valeur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String versChaine() {
		String resultat = "";
		int nombreChiffres = 0;
		int copieValeur = Math.abs(valeur);
		while (copieValeur != 0) {
			if (nombreChiffres == 3) {
				nombreChiffres = 0;
				resultat = " " + resultat;
			}
			resultat = (char) (48 + copieValeur % 10) + resultat;
			copieValeur = copieValeur / 10;
			nombreChiffres++;
		}
		if (valeur < 0)
			resultat = "-" + resultat;
		else if (valeur == 0)
			resultat = "0";
		return resultat;
	}

	public void depuisChaine(String s) {
		int valeurTemp, signe;
		valeurTemp = 0;
		signe = 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				if ((i == 0) && (c == '-'))
					signe = -1;
				else if ((c >= '0') && (c <= '9'))
					valeurTemp = 10 * valeurTemp + c - 48;
				else
					return; // chaîne incorrecte
			}
		}
		valeur = valeurTemp * signe;
	}
}
