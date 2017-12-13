package io.jsd.training.java.designpattern.chapitres.chap4.factoryMethodClasseGenerique.factorymethodclassegenerique;

public class ContenuHtml implements Contenu {
	
	protected String codeHtml;

	public void encode(String texte) {
		codeHtml = "<HTML>"+texte+"</HTML>";
	}

	public void affiche() {
		System.out.println(codeHtml);
	}
}
