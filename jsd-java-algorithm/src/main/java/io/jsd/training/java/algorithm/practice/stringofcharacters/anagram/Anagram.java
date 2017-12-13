package io.jsd.training.java.algorithm.practice.stringofcharacters.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
	
	public List<String> selectAnagram(String sentence){
		String[] wordsArray = deleteWordDuplicated(sentence).split(" ");
		
//		for(String w : wordsArray){
//		System.out.println("wordsArray "+w);
//		}
		
		Map<String, List<Integer>> dico = new HashMap<String, List<Integer>>();
		
		for(int i=0; i<wordsArray.length; i++){
			 String signature = signature(wordsArray[i]);
//		     System.out.println("signature "+signature);
		     if(dico.containsKey(signature)){
		    	 dico.get(signature).add(i);
		     } else {
		    	 List<Integer> index = new ArrayList<Integer>();
		    	 index.add(i);
		    	 dico.put(signature, index);
		     }
		}
		
		List<String> reponse = new ArrayList<String>();
		
		for (Map.Entry<String, List<Integer>> entry : dico.entrySet())
		{
//		    System.out.println(entry.getKey() + "/" + entry.getValue());
		    if(entry.getValue().size()>1){
		    	for(Integer i : entry.getValue()){
//		    		System.out.println("wordsArray[i] "+wordsArray[i]);
		    		reponse.add(wordsArray[i]);
		    	}
		    }
		    
		}
		return reponse;
	}
	
	private String signature(String word){
		//signature d'un mot
		//Trie des lettre dans l'ordre
	     char[] chars = word.toCharArray();
	     Arrays.sort(chars);
	     return new String(chars);
	}
	
	private String deleteWordDuplicated(String sentence) {
		// retirer tous les doublons
	    return new LinkedHashSet<String>(Arrays.asList(sentence.split(" "))).toString().replaceAll("(^\\[|\\]$)", "").replace(", ", " ");
	}

}
