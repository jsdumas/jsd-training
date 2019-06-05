package io.jsd.training.practice.graph;

import static io.jsd.training.practice.graph.AdjListBuilder.initAdjList;

import io.jsd.training.practice.graph.AdjListBuilder;

public class AdjacencyListApp {


	public static void main(String[] args) {

		AdjList<Integer> adjList = initAdjList()
				.addVertex(1)
				.addVertex(3)
				.addVertex(5)
				.addEdge(1, 3)
				.addEdge(3, 5)
				.addEdge(5, 3)
				.addEdge(1, 5)
				.build();

		// DFS
		DFSAdjList<Integer> dfs = new DFSAdjList<>(adjList);
		dfs.dfs(3);
		for (int v : adjList.vertices())
			System.out.println("dfs(" + v + ")=" + dfs.dfsNum(v));
		System.out.println();

		// BFS
		BFSAdjList<Integer> bfs = new BFSAdjList<>(adjList);
		bfs.bfs();
		for (int v : adjList.vertices())
			System.out.println("bfs(" + v + ")=" + bfs.bfsNum(v));

		System.out.println("TestAdjList OK");
	}

}
