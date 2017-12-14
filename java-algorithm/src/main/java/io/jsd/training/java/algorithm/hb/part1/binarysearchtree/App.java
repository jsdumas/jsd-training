package io.jsd.training.java.algorithm.hb.part1.binarysearchtree;


public class App {

	public static void main(String[] args) {
		// O(N) OR O(logN)
		Tree<Person> bst = new BinarySearchTree<>();
		bst.insert(new Person("Adam", 27));
		bst.insert(new Person("Kevin", 13));
		bst.insert(new Person("Joe", 67));
		bst.insert(new Person("Michael", 2));
		bst.insert(new Person("Smith", 11));

		bst.traversal();
	}

}