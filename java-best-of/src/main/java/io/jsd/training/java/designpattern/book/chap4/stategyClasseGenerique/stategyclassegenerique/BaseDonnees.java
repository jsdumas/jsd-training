package io.jsd.training.java.designpattern.book.chap4.stategyClasseGenerique.stategyclassegenerique;

import java.util.Arrays;
import java.util.List;

public class BaseDonnees<T extends StrategieTri> {
	protected T strategieTri = null;
	protected List<String> donnees = Arrays.asList("D1","D3","D2");

    public BaseDonnees(Class<T> classeStrategie) {
		try {
			strategieTri = classeStrategie.newInstance();
		} catch (IllegalAccessException e) {
		} catch (InstantiationException e) {
		}
	}
	
	public void afficheDonneesTriees() {
		List<String> donneesTriees = strategieTri.trie(donnees);
		for (String donnee : donneesTriees)
			System.out.println(donnee);
	}

}
