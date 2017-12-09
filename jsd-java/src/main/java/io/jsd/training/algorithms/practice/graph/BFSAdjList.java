package io.jsd.training.algorithms.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSAdjList<V> {

	private final AdjList<V> g;
	private final HashMap<V, Integer> visited;
	private int count;

	public BFSAdjList(AdjList<V> g) {
		this.g = g;
		this.visited = new HashMap<V, Integer>();
		this.count = 0;
	}

	void bfs(V v) {
		Queue<V> q = new LinkedList<V>();
		if (!this.visited.containsKey(v))
			q.add(v);
		while (!q.isEmpty()) {
			v = q.poll();
			this.visited.put(v, count++);
			for (V w : g.successors(v))
				if (!this.visited.containsKey(w))
					q.add(w);
		}
	}

	public void bfs() {
		for (V v : g.vertices())
			bfs(v);
	}

	public int bfsNum(V v) {
		bfs(v);
		return this.visited.get(v);
	}

}

