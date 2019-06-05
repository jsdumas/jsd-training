package io.jsd.training.practice.graph;

import static io.jsd.training.practice.graph.AdjListBuilder.initAdjList;

import io.jsd.training.practice.graph.AdjListBuilder;

public class AdjListApp {

	private static final AdjList<Integer> GRAPH = initAdjList().addVertex(1).addVertex(3).addVertex(5).addEdge(1, 3).addEdge(3,
			5).addEdge(5, 3).addEdge(1, 5).build();

	public static void main(String[] args) {

		// DFS
		DFSAdjList<Integer> dfs = new DFSAdjList<>(GRAPH);
		dfs.dfs(3);
		for (int v : GRAPH.vertices())
			System.out.println("dfs(" + v + ")=" + dfs.dfsNum(v));
		System.out.println();

		// BFS
		BFSAdjList<Integer> bfs = new BFSAdjList<>(GRAPH);
		bfs.bfs();
		for (int v : GRAPH.vertices())
			System.out.println("bfs(" + v + ")=" + bfs.bfsNum(v));

		System.out.println("TestAdjList OK");
	}

}
