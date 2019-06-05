package io.jsd.training.practice.graph;

import static io.jsd.training.practice.graph.AdjListBuilder.initAdjList;

import io.jsd.training.practice.graph.AdjListBuilder;

public class AdjacencyListApp {


	public static void main(String[] args) {

		AdjList<Integer> adjacencyList = initAdjList()
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
		dfs.dfs(3);
		for (int vertex : adjacencyList.vertices())
			System.out.println("dfs(" + vertex + ")=" + dfs.dfsNum(vertex));
		System.out.println();

		// BFS
        BreadthFirstSearchAdjacencyList<Integer> bfs = new BreadthFirstSearchAdjacencyList<>(adjacencyList);
		bfs.bfs();
		for (int vertex : adjacencyList.vertices())
			System.out.println("bfs(" + vertex + ")=" + bfs.bfsNum(vertex));

		System.out.println("TestAdjList OK");
	}

}
