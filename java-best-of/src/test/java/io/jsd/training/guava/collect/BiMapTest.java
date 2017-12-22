package io.jsd.training.guava.collect;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

//Une Bimap est une Map bidirectionnelle : on peut interroger ses clés pour récupérer les valeurs associées, 
//et également interroger ses valeurs pour retrouver les clés associées.
//Pour que ce soit possible, les valeurs ne doivent évidemment pas comporter de doublons.
//La méthode inverse() d'une Bimap permet d'en obtenir une vue symétrique, où clés et valeurs sont inversées. 
//On peut ainsi interroger la collection sur ses valeurs, pour récupérer les clés associées.

public class BiMapTest {
	
	private HashBiMap<String, Integer> daltonsSizeByName;
	
	@Before
	public void setUp() {
		daltonsSizeByName = HashBiMap.create();
		daltonsSizeByName.put("Joe", 1);
		daltonsSizeByName.put("Jack", 2);
		daltonsSizeByName.put("William", 3);
		daltonsSizeByName.put("Averell", 4);
	}
	
	@Test
	public void bimap() {
		// Inverse map
		BiMap<Integer,String> daltonsNameBySize = daltonsSizeByName.inverse();
		assertThat(daltonsSizeByName.size(), equalTo(daltonsNameBySize.size()));
		assertThat(daltonsNameBySize.keySet(), equalTo(daltonsSizeByName.values()));
		assertThat(daltonsNameBySize.values(), equalTo(daltonsSizeByName.keySet()));
		
		assertThat((int) daltonsSizeByName.get("Joe"), equalTo(1));
		assertThat(daltonsNameBySize.get(1), equalTo("Joe"));
	 
	}

}
