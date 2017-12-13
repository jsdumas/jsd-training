package io.jsd.training.java.designpattern.chapitres.chap1.connexions;

public class SGBDMySQL extends SGBD {
	@Override
	protected Connexion creeConnexion(String utilisateur, String motdepasse) {
		return new ConnexionMySQL(utilisateur, motdepasse);
	}
}
