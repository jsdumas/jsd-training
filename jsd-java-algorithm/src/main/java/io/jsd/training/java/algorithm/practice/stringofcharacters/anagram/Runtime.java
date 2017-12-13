package io.jsd.training.java.algorithm.practice.stringofcharacters.anagram;

import java.util.List;

public class Runtime {

	public static void main(String[] args) {

		Anagram anagram = new Anagram();
		
		List<String> reponse = anagram.selectAnagram("une nue marche charme chien niche chine perroquet limace limace");
		
		for(String rep : reponse){
			System.out.println(rep);
		}
		
		
	}

}
