package io.jsd.training.designpattern.book.chap2.documentxml;

public class ElementXMLSimple extends ElementXML {
	protected String valeur;

	public ElementXMLSimple(String tag) {
		super(tag);
	}

	@Override
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	@Override
	public String getValeur() {
		return valeur;
	}

	@Override
	public void ajouteEnfant(ElementXML enfant) {
	};
}
