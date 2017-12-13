package io.jsd.training.java.designpattern.chapitres.chap2.documentxml;

import java.util.ArrayList;
import java.util.List;

public class ElementXMLCompose extends ElementXML {
	protected List<ElementXML> enfants = new ArrayList<ElementXML>();

	public ElementXMLCompose(String tag) {
		super(tag);
	}

	@Override
	public void setValeur(String valeur) {
	}

	@Override
	public String getValeur() {
		return null;
	}

	@Override
	public void ajouteEnfant(ElementXML enfant) {
		enfants.add(enfant);
	}

	public List<ElementXML> getElementsEnfants() {
		return enfants;
	}
}
