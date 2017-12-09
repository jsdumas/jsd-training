package io.jsd.training.java.algorithms.practice.graph;

import test.io.jsd.training.java.algorithms.practice.graph.AdjListBuilder;

public class AdjListApp {

	private final static AdjList<Integer> GRAPH = new AdjListBuilder().withVertex(1).withVertex(3).withVertex(5).withEdge(1, 3).withEdge(3,
			5).withEdge(5, 3).withEdge(1, 5).build();

	public static void main(String[] args) {

		// DFS
		DFSAdjList<Integer> dfs = new DFSAdjList<Integer>(GRAPH);
		dfs.dfs(3);
		for (int v : GRAPH.vertices())
			System.out.println("dfs(" + v + ")=" + dfs.dfsNum(v));
		System.out.println();

		// BFS
		BFSAdjList<Integer> bfs = new BFSAdjList<Integer>(GRAPH);
		bfs.bfs();
		for (int v : GRAPH.vertices())
			System.out.println("bfs(" + v + ")=" + bfs.bfsNum(v));

		System.out.println("TestAdjList OK");
	}

}
