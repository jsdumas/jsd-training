package io.jsd.training.java.designpattern.chapitres.chap4.stategyClasseGenerique.stategyclassegenerique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriJava implements StrategieTri {

	public <T extends Comparable<T>> List<T> trie(List<T> donnees) {
		ArrayList<T> resultat = new ArrayList<T>();
		for (T element : donnees)
			resultat.add(element);
		Collections.sort(resultat);	
		return resultat;
	}

}
