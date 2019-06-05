package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AdjList<V> {

	private final Map<V, LinkedList<V>> adjacencyList;

	public AdjList() {
		this.adjacencyList = new HashMap<>();
	}

	public void addVertex(V vertex) {
		this.adjacencyList.computeIfAbsent(vertex, v -> new LinkedList<V>());
	}

	public boolean hasEdge(V vertexFrom, V vertexTo) {
		List<V> vertexList = this.adjacencyList.get(vertexFrom);
		return vertexList != null && vertexList.contains(vertexTo);
	}

	public void addEdge(V vertexFrom, V vertexTo) {
		addVertex(vertexFrom);
		this.adjacencyList.get(vertexFrom).add(vertexTo);
	}

	public void removeEdge(V vertexFrom, V vertexTo) {
		List<V> vertexList = this.adjacencyList.get(vertexFrom);
		if (vertexList != null)
			vertexList.remove(vertexTo);
	}

	List<V> successors(V vertex) {
		return this.adjacencyList.get(vertex);
	}

	public Set<V> vertices() {
		return this.adjacencyList.keySet();
	}

}

