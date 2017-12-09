package io.jsd.training.designpatterns.chapitres.chap2.documentxml;

public interface Element {
	int getNombreEnfants();

	ElementXML getEnfant(int index);

	ElementXML getPremierEnfantAvecTag(String tag);
}
