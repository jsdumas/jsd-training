package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;

public class DepthFirstSearchAdjacencyList<T> {

		private final AdjacencyList<T> adjacencyList;
		private final HashMap<T, Integer> visited;
		private int count;

		public DepthFirstSearchAdjacencyList(AdjacencyList<T> adjacencyList) {
			this.adjacencyList = adjacencyList;
			this.visited = new HashMap<>();
			this.count = 0;
		}

		public void depthFirstSearch(T vertex) {
			if (this.visited.containsKey(vertex))
				return;
			this.visited.put(vertex, count++);
			for (T childVertex : adjacencyList.getChildsFromVertex(vertex))
				depthFirstSearch(childVertex);
		}

		public void depthFirstSearch() {
			for (T vertex : adjacencyList.getAllVertices())
				depthFirstSearch(vertex);
		}

		public int depthFirstSearchNumber(T vertex) {
			depthFirstSearch(vertex);
			return this.visited.get(vertex);
		}

	}
