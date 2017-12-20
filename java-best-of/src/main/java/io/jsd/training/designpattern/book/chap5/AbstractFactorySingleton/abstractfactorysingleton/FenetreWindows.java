package io.jsd.training.designpattern.book.chap5.AbstractFactorySingleton.abstractfactorysingleton;

public class FenetreWindows implements Fenetre {
	protected String titre;

	public FenetreWindows(String titre) {
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
		System.out.println("Fenetre Windows "+titre);
	}

}
