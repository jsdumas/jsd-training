package io.jsd.training.udemy.balazs.advanced.breadthfirstsearch.breadthfirstsearch;

public class App {

	public static void main(String[] args) {
		
		BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
		
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		
		vertex1.addChild(vertex2);
		vertex1.addChild(vertex4);
		vertex4.addChild(vertex5);
		vertex2.addChild(vertex3);
		
		breadthFirstSearch.bfs(vertex1);

	}
}
