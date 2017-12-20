package io.jsd.training.guava.collect;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import com.google.common.collect.HashMultiset;

//"Multiset" est un nom un peu trompeur pour cette classe. 
//En réalité, il s'agit plutôt d'un bag, c'est-à-dire une collection non ordonnée autorisant les doublons.
//Cette collection a pour particularité de compter le nombre d'occurrences de chaque élément qui y est inséré. 
//Elle est pratique pour collecter des statistiques sur la fréquence d'apparition des éléments au sein d'un ensemble.
//Plusieurs versions existent : HashMultiset, LinkedHashMultiset et TreeMultiset. 
//Elles sont toutes instanciées via leur méthode factory create().
//Enfin, il est possible de retransformer un Multiset en Set grâce à la méthode elementSet() (les doublons sont éliminés au passage).

public class MultisetTest {
	
	@Test
	public void multiset() {
	 
		HashMultiset<Integer> ages = HashMultiset.create();
		// Existe également en version LinkedHashSet, TreeSet, et ConcurrentHashSet :
		// HashMultiset<Integer> ages = LinkedHashMultiset.create();
		// HashMultiset<Integer> ages = TreeMultiset.create();
		// HashMultiset<Integer> ages = ConcurrentHashMultiset.create();
	 
		ages.add(28);
		ages.add(28);
		ages.add(30, 3); // Ajouter 3 fois cet élément
		ages.add(31);
		ages.add(32);
	 
		// Attention, size() renvoie le nombre total d'éléments dans la collection
		assertThat(ages.size(), equalTo(7));
		// Pour obtenir la taille du Set, utiliser entrySet().size()
		assertThat(ages.entrySet().size(), equalTo(4));
	 
		// comptage des occurrences
		assertThat(ages.count(0), equalTo(0));
		assertThat(ages.count(28), equalTo(2));
		assertThat(ages.count(30), equalTo(3));
		assertThat(ages.count(31), equalTo(1));
		assertThat(ages.count(32), equalTo(1));
		
	}

}
