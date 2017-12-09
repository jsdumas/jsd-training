package io.jsd.training.designpatterns.chapitres.chap1.connexions;

import java.util.ArrayList;
import java.util.List;

public abstract class SGBD {
	protected List<Connexion> connexions = new ArrayList<Connexion>();

	protected abstract Connexion creeConnexion(String utilisateur, String motdepasse);

	public Connexion nouvelleConnexion(String utilisateur, String motdepasse) {
		Connexion connexion = this.creeConnexion(utilisateur, motdepasse);
		connexions.add(connexion);
		return connexion;
	}
}
