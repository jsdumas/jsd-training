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

		public void depthFirstSearchFromVertex(T vertex) {
			if (this.visited.containsKey(vertex))
				return;
			this.visited.put(vertex, count++);
			for (T childVertex : adjacencyList.getChildsFromVertex(vertex))
				depthFirstSearchFromVertex(childVertex);
		}

		public void depthFirstSearchForAllVertices() {
			for (T vertex : adjacencyList.getAllVertices())
				depthFirstSearchFromVertex(vertex);
		}

		public int vertexPositionAfterdepthFirstSearch(T vertex) {
			depthFirstSearchFromVertex(vertex);
			return this.visited.get(vertex);
		}

	}
