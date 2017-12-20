package io.jsd.training.designpattern.book.chap1.connexions;

public class ConnexionMySQL extends Connexion {
	public ConnexionMySQL(String utilisateur, String motdepasse) {
		super(utilisateur, motdepasse);
	}

	@Override
	public void getDescription() {
		System.out.println("Connecté à MySQL avec le nom d'utilisateur : " + utilisateur);
	}
}
