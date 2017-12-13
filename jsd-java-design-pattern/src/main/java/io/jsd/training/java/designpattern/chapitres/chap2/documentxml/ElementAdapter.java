package io.jsd.training.java.designpattern.chapitres.chap2.documentxml;

import java.util.List;

public class ElementAdapter implements Element {
	protected ElementXMLCompose adapte;

	public ElementAdapter(ElementXMLCompose adapte) {
		this.adapte = adapte;
	}

	public int getNombreEnfants() {
		return adapte.getElementsEnfants().size();
	}

	public ElementXML getEnfant(int index) {
		List<ElementXML> enfants = adapte.getElementsEnfants();
		return enfants.get(index);

	}

	public ElementXML getPremierEnfantAvecTag(String tag) {
		List<ElementXML> enfants = adapte.getElementsEnfants();
		for (ElementXML elt : enfants) {
			if (elt.getTag().equals(tag))
				return elt;
		}
		return null;
	}
}
