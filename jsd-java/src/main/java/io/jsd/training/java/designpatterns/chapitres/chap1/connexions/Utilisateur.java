package io.jsd.training.java.designpatterns.chapitres.chap1.connexions;

public class Utilisateur {

	public static void main(String[] args) {
		SGBD sgbd;
		Connexion connexion;
		sgbd = new SGBDOracle();
		connexion = sgbd.nouvelleConnexion("admin", "oracle");
		connexion.getDescription();
		sgbd = new SGBDMySQL();
		connexion = sgbd.nouvelleConnexion("root@localhost", "mysql");
		connexion.getDescription();

	}
}
