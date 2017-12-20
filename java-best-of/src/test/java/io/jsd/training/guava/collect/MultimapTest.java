package io.jsd.training.guava.collect;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.SetMultimap;

//Une Multimap associe plusieurs valeurs à chaque clé. Ces valeurs sont contenues dans une List ou un Set, créés automatiquement à la première insertion.
//En tant que développeur, vous n'avez donc plus à vous soucier de l'existence ou de la création des collections contenant vos valeurs : 
//il suffit d'appeler put(K,V) ou remove(K,V) comme d'habitude.
//Il existe deux familles de Multimap :
//    Les ListMultimap, qui utilisent au choix une LinkedList (LinkedListMultimap) ou une ArrayList (ArrayListMultimap)pour stocker les valeurs.
//    Les SetMultimap, qui associent à chaque clé un Set de valeurs : HashMultimap, LinkedHashMultimap et TreeMultimap.
//Chacune de ces classes est instanciée via une méthode factory appelée create().

public class MultimapTest {
	
	@Test
	public void listMultimap() {
	 
		ListMultimap<Integer, Integer> tablesMultiplication = LinkedListMultimap.create();
		// Existe aussi en version ArrayList :
		// ListMultimap<Integer, Integer> tablesMultiplication = ArrayListMultimap.create();
	 
		for (int table = 0; table < 10; table++) {
			for (int i = 0; i < 10; i++) {
				tablesMultiplication.put(table, i * table);
			}
		}
	 
		List<Integer> tableDe2 = tablesMultiplication.get(2);
		assertThat(tableDe2 instanceof List, is(true));
		assertThat(tableDe2.size(), equalTo(10));
		assertThat(tableDe2.containsAll(Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14, 16, 18)), is(true));
	 
		// Suppression de l'élément "10" dans la table de 2
		tablesMultiplication.remove(2, 10);
		assertThat(tableDe2.size(), equalTo(9));
		assertThat(tableDe2.containsAll(Arrays.asList(0, 2, 4, 6, 8, /*10,*/ 12, 14, 16, 18)), is(true));
	 
		// Transformation en simple Map
		Map<Integer, Collection<Integer>> map = tablesMultiplication.asMap();
	}
	 
	@Test
	public void setMultimap() {
	 
		SetMultimap<String, Integer> caveAVins = HashMultimap.create();
		// Existe aussi en version LinkedHashMultimap et TreeMultimap :
		// SetMultimap<String, Integer> caveAVins = LinkedHashMultimap.create();
		// SetMultimap<String, Integer> caveAVins = TreeMultimap.create();
	 
		caveAVins.put("Bordeaux", 1985);
		caveAVins.put("Bordeaux", 1986);
		caveAVins.put("Bordeaux", 1985);
		caveAVins.put("Bordeaux", 1985);
		caveAVins.put("Bordeaux", 1990);
	 
		Set<Integer> bordeaux = caveAVins.get("Bordeaux");
		assertThat(bordeaux instanceof Set, is(true));
		assertThat(bordeaux.size(), equalTo(3));
		assertThat(bordeaux.containsAll(Arrays.asList(1985, 1986, 1990)), is(true));
		
	 
		// Suppression de 1996
		bordeaux.remove(1986);
		assertThat(bordeaux.size(), equalTo(2));
		assertThat(bordeaux.containsAll(Arrays.asList(1985, /*1986,*/ 1990)), is(true));
	 
		// Transformation en simple Map
		Map<String, Collection<Integer>> map = caveAVins.asMap();
	}

}
