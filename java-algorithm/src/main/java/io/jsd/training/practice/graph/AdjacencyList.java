package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdjacencyList<T> {

	private final Map<T, LinkedList<T>> adjacencyList;

	public AdjacencyList() {
		this.adjacencyList = new HashMap<>();
	}

	public void addVertex(T vertex) {
		this.adjacencyList.computeIfAbsent(vertex, v -> new LinkedList<T>());
	}

	public boolean hasEdge(T vertexFrom, T vertexTo) {
		List<T> vertexList = this.adjacencyList.get(vertexFrom);
		return vertexList != null && vertexList.contains(vertexTo);
	}

	public void addEdge(T vertexFrom, T vertexTo) {
		addVertex(vertexFrom);
		this.adjacencyList.get(vertexFrom).add(vertexTo);
	}

	public void removeEdge(T vertexFrom, T vertexTo) {
		List<T> vertexList = this.adjacencyList.get(vertexFrom);
		if (vertexList != null)
			vertexList.remove(vertexTo);
	}

	public List<T> successors(T vertex) {
		return this.adjacencyList.get(vertex);
	}

	public Set<T> vertices() {
		return this.adjacencyList.keySet();
	}

}

