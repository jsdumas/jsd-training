package io.jsd.training.codingame.teads;

import java.util.HashSet;
import java.util.Set;

public class Vertex {

	private final int id;
	private final Set<Vertex> adjacentVertices;


	public Vertex(int vertexID) {
		this.id = vertexID;
		this.adjacentVertices = new HashSet<>();
	}


	public int getId() {
		return id;
	}


	public void addAdjacentVertex(Vertex vertex) {
		adjacentVertices.add(vertex);
	}
	
	public void removeAdjacentVertex(Vertex vertex) {
		adjacentVertices.remove(vertex);
	}
	
	public void removeFromAdjacentVertices() {
		adjacentVertices.stream().forEach(vertex -> vertex.removeAdjacentVertex(this));
	}
	
	public boolean isLeaf() {
		return adjacentVertices.size() == 1;
	}

}
