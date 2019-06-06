package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchAdjacencyList<T> {

	private final AdjacencyList<T> g;
	private final HashMap<T, Integer> visited;
	private int count;

	public BreadthFirstSearchAdjacencyList(AdjacencyList<T> g) {
		this.g = g;
		this.visited = new HashMap<>();
		this.count = 0;
	}

	void bfs(T v) {
		Queue<T> q = new LinkedList<>();
		if (!this.visited.containsKey(v))
			q.add(v);
		while (!q.isEmpty()) {
			v = q.poll();
			this.visited.put(v, count++);
			for (T w : g.getChildsFromVertex(v))
				if (!this.visited.containsKey(w))
					q.add(w);
		}
	}

	public void bfs() {
		for (T v : g.getAllVertices())
			bfs(v);
	}

	public int bfsNum(T v) {
		bfs(v);
		return this.visited.get(v);
	}

}

