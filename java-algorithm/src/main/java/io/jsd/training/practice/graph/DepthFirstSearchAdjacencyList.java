package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;

public class DepthFirstSearchAdjacencyList<T> {

		private final AdjacencyList<T> g;
		private final HashMap<T, Integer> visited;
		private int count;

		public DepthFirstSearchAdjacencyList(AdjacencyList<T> g) {
			this.g = g;
			this.visited = new HashMap<>();
			this.count = 0;
		}

		public void dfs(T v) {
			if (this.visited.containsKey(v))
				return;
			this.visited.put(v, count++);
			for (T w : g.successors(v))
				dfs(w);
		}

		void dfs() {
			for (T v : g.vertices())
				dfs(v);
		}

		public int dfsNum(T v) {
			dfs(v);
			return this.visited.get(v);
		}

	}
