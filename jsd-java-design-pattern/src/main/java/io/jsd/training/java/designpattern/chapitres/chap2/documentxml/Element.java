package io.jsd.training.java.designpattern.chapitres.chap2.documentxml;

public interface Element {
	int getNombreEnfants();

	ElementXML getEnfant(int index);

	ElementXML getPremierEnfantAvecTag(String tag);
}
