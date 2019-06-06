package io.jsd.training.practice.graph;

import static io.jsd.training.practice.graph.AdjacencyListBuilder.initAdjList;


public class AdjacencyListApp {


	public static void main(String[] args) {

		AdjacencyList<Integer> adjacencyList = initAdjList()
				.addVertex(1)
				.addVertex(3)
				.addVertex(5)
				.addEdge(1, 3)
				.addEdge(3, 5)
				.addEdge(5, 3)
				.addEdge(1, 5)
				.build();

		// DFS
        DepthFirstSearchAdjacencyList<Integer> dfs = new DepthFirstSearchAdjacencyList<>(adjacencyList);
		dfs.depthFirstSearchFromVertex(3);
		for (int vertex : adjacencyList.getAllVertices())
			System.out.println("dfs(" + vertex + ")=" + dfs.vertexPositionAfterdepthFirstSearch(vertex));
		System.out.println();

		// BFS
        BreadthFirstSearchAdjacencyList<Integer> bfs = new BreadthFirstSearchAdjacencyList<>(adjacencyList);
		bfs.breadthFirstSearch();
		for (int vertex : adjacencyList.getAllVertices())
			System.out.println("bfs(" + vertex + ")=" + bfs.breadthFirstSearchNumber(vertex));

		System.out.println("TestAdjList OK");
	}

}
