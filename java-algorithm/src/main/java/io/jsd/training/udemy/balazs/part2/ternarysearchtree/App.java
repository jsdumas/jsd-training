package io.jsd.training.udemy.balazs.part2.ternarysearchtree;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		TST tst = new TST();
		
		tst.put("a", 1);
		tst.put("apple", 100);
		
		System.out.println(tst.get("apple"));
		

	}

}
