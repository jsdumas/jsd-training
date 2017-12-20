package io.jsd.training.designpattern.book.chap1.connexions;

public class SGBDOracle extends SGBD {
	@Override
	protected Connexion creeConnexion(String utilisateur, String motdepasse) {
		return new ConnexionOracle(utilisateur, motdepasse);
	}
}
