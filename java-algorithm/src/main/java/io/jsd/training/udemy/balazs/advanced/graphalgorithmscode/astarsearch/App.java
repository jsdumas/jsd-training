package io.jsd.training.udemy.balazs.advanced.graphalgorithmscode.astarsearch;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Node node_A = new Node("A");
		Node node_B = new Node("B");
		Node node_C = new Node("C");
		Node node_D = new Node("D");
		Node node_E = new Node("E");
		Node node_F = new Node("F");
		
		node_A.addChild(new Edge(node_B,4));
		node_A.addChild(new Edge(node_C,2));
		
		node_B.addChild(new Edge(node_C, 5));
		node_B.addChild(new Edge(node_D, 10));
		
		node_C.addChild(new Edge(node_E, 3));
		
		node_D.addChild(new Edge(node_F, 11));
		
		node_E.addChild(new Edge(node_D, 4));

		AstarSearch algorithm = new AstarSearch(node_A, node_F);
		
		algorithm.executeAStarSearch();

		List<Node> path = algorithm.printPath(node_F);
		System.out.println("Path " + path);
	}

	
}
