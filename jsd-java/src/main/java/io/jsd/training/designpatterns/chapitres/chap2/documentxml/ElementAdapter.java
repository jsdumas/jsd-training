package io.jsd.training.designpatterns.chapitres.chap2.documentxml;

import java.util.List;

public class ElementAdapter implements Element {
	protected ElementXMLCompose adapte;

	public ElementAdapter(ElementXMLCompose adapte) {
		this.adapte = adapte;
	}

	@Override
	public int getNombreEnfants() {
		return adapte.getElementsEnfants().size();
	}

	@Override
	public ElementXML getEnfant(int index) {
		List<ElementXML> enfants = adapte.getElementsEnfants();
		return enfants.get(index);

	}

	@Override
	public ElementXML getPremierEnfantAvecTag(String tag) {
		List<ElementXML> enfants = adapte.getElementsEnfants();
		for (ElementXML elt : enfants) {
			if (elt.getTag().equals(tag))
				return elt;
		}
		return null;
	}
}
