package io.jsd.training.java.algorithm.hb.part2.datacompression.huffmanencoding;

public class App {

	public static void main(String[] args) {
		
		String text = "My name is Joeiiii!";
		
		int[] charFrequencies = new int[256];
		
		for(char c : text.toCharArray()){
			++charFrequencies[c];
		}
		
		HuffmanCode huffmanCode = new HuffmanCode();
		
		HuffmanTree huffmanTree = huffmanCode.buildTree(charFrequencies);
		
		huffmanCode.printCodes(huffmanTree, new StringBuilder());

	}
}
