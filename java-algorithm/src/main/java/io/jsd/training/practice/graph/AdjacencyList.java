package io.jsd.training.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdjacencyList<T> {

	private final Map<T, LinkedList<T>> verticesWithEdges;

	public AdjacencyList() {
		this.verticesWithEdges = new HashMap<>();
	}

	public void addNewVertex(T vertex) {
		this.verticesWithEdges.computeIfAbsent(vertex, v -> new LinkedList<T>());
	}

	public boolean hasEdge(T vertexFrom, T vertexTo) {
		List<T> childVertices = this.verticesWithEdges.get(vertexFrom);
		return childVertices != null && childVertices.contains(vertexTo);
	}

	public void addEdge(T vertexFrom, T vertexTo) {
		addNewVertex(vertexFrom);
		this.verticesWithEdges.get(vertexFrom).add(vertexTo);
	}

	public void removeEdge(T vertexFrom, T vertexTo) {
		List<T> childVertices = this.verticesWithEdges.get(vertexFrom);
		if (childVertices != null)
			childVertices.remove(vertexTo);
	}

	public List<T> getChildsFromVertex(T vertex) {
		return this.verticesWithEdges.get(vertex);
	}

	public Set<T> getAllVertices() {
		return this.verticesWithEdges.keySet();
	}

}

