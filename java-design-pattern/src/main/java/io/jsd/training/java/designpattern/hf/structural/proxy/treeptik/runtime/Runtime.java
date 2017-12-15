package io.jsd.training.java.designpattern.hf.structural.proxy.treeptik.runtime;

import java.util.Iterator;
import java.util.List;

import io.jsd.training.java.designpattern.hf.structural.proxy.treeptik.proxy.FileDescription;

public class Runtime {

	public static void main(String[] args) {

		/* Proxy */

		FileDescription filDesc = new FileDescription("Dictionnaire", "/home/stagiaire/liste.de.mots.francais.frgut.txt");
		List<String> lines = filDesc.getLines();

		// System.out.println(lines.get(5));

		// lines.forEach(System.out::println);

		// for(String line : lines)
		// System.out.println(line);

		Iterator<String> iterator = lines.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

	}

}
