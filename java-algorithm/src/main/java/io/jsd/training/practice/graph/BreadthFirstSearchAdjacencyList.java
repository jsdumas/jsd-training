package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearchAdjacencyList<T> {

	private final AdjList<T> g;
	private final HashMap<T, Integer> visited;
	private int count;

	public BreadthFirstSearchAdjacencyList(AdjList<T> g) {
		this.g = g;
		this.visited = new HashMap<T, Integer>();
		this.count = 0;
	}

	void bfs(T v) {
		Queue<T> q = new LinkedList<T>();
		if (!this.visited.containsKey(v))
			q.add(v);
		while (!q.isEmpty()) {
			v = q.poll();
			this.visited.put(v, count++);
			for (T w : g.successors(v))
				if (!this.visited.containsKey(w))
					q.add(w);
		}
	}

	public void bfs() {
		for (T v : g.vertices())
			bfs(v);
	}

	public int bfsNum(T v) {
		bfs(v);
		return this.visited.get(v);
	}

}

