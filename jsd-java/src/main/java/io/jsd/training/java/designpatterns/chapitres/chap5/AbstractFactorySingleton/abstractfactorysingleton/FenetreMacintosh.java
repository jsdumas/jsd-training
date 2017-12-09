package io.jsd.training.java.designpatterns.chapitres.chap5.AbstractFactorySingleton.abstractfactorysingleton;

public class FenetreMacintosh implements Fenetre {
	protected String titre;

	public FenetreMacintosh(String titre) {
		super();
		this.titre = titre;
	}

	@Override
	public String getTitre() {
		return titre;
	}

	@Override
	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public void affiche() {
		System.out.println("Fenetre Macintosh "+titre);
	}

}
