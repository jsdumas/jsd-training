package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchAdjacencyList<T> {

	private final AdjacencyList<T> adjacencyList;
	private final HashMap<T, Integer> visited;
	private int count;

	public BreadthFirstSearchAdjacencyList(AdjacencyList<T> adjacencyList) {
		this.adjacencyList = adjacencyList;
		this.visited = new HashMap<>();
		this.count = 0;
	}

	public void breadthFirstSearch(T vertex) {
		Queue<T> queue = new LinkedList<>();
		if (!this.visited.containsKey(vertex))
			queue.add(vertex);
		while (!queue.isEmpty()) {
			vertex = queue.poll();
			this.visited.put(vertex, count++);
			for (T childVertex : adjacencyList.getChildsFromVertex(vertex))
				if (!this.visited.containsKey(childVertex))
					queue.add(childVertex);
		}
	}

	public void breadthFirstSearch() {
		for (T vertex : adjacencyList.getAllVertices())
			breadthFirstSearch(vertex);
	}

	public int breadthFirstSearchNumber(T vertex) {
		breadthFirstSearch(vertex);
		return this.visited.get(vertex);
	}

}

