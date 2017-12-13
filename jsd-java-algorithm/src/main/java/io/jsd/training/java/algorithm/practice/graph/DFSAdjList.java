package io.jsd.training.java.algorithm.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class DFSAdjList<V> {

		private final AdjList<V> g;
		private final HashMap<V, Integer> visited;
		private int count;

		public DFSAdjList(AdjList<V> g) {
			this.g = g;
			this.visited = new HashMap<V, Integer>();
			this.count = 0;
		}

		public void dfs(V v) {
			if (this.visited.containsKey(v))
				return;
			this.visited.put(v, count++);
			for (V w : g.successors(v))
				dfs(w);
		}

		void dfs() {
			for (V v : g.vertices())
				dfs(v);
		}

		public int dfsNum(V v) {
			dfs(v);
			return this.visited.get(v);
		}

	}