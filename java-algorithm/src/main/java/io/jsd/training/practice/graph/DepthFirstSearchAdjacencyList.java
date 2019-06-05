package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class DepthFirstSearchAdjacencyList<T> {

		private final AdjList<T> g;
		private final HashMap<T, Integer> visited;
		private int count;

		public DepthFirstSearchAdjacencyList(AdjList<T> g) {
			this.g = g;
			this.visited = new HashMap<T, Integer>();
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
