package io.jsd.training.java.designpatterns.treeptik.runtime;

import java.util.Iterator;
import java.util.List;

import io.jsd.training.java.designpatterns.treeptik.proxy.FileDescription;

public class Runtime {

	private static int size;

	public static void main(String[] args) {

		/* Singleton 2 */
		/*
		 * Singleton2 s1 = Singleton2.getInstance("test1"); Singleton2 s2 = Singleton2.getInstance(null); if(s1.equals(s2))
		 * System.out.println("instance unique"); else System.out.println("instance multiple"); System.out.println("S1 :"+s1);
		 * System.out.println("S2 :"+s2);
		 */
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
