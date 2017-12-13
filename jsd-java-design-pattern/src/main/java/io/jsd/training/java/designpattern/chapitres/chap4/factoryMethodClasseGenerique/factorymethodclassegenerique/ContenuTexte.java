package io.jsd.training.java.designpattern.chapitres.chap4.factoryMethodClasseGenerique.factorymethodclassegenerique;

public class ContenuTexte implements Contenu {

	protected String texte;
	
	public void encode(String texte) {
		this.texte = texte;
	}

	public void affiche() {
		System.out.println(texte);
	}

}
