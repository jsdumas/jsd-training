package io.jsd.training.practice.graph;

import io.jsd.training.practice.graph.AdjacencyList;

public class AdjacencyListBuilder {

	public static AdjacencyListBuilder initAdjList() {
		return new AdjacencyListBuilder();
	}
	
	private AdjacencyList<Integer> adjacencyList;
	
	private AdjacencyListBuilder(){
		this.adjacencyList = new AdjacencyList<>();
	}
	
	public AdjacencyList<Integer> build(){
		return this.adjacencyList;
	}
	
	public AdjacencyListBuilder addVertex(Integer number){
		this.adjacencyList.addNewVertex(number);
		return this;
	}
	
	public AdjacencyListBuilder addEdge(Integer from, Integer to){
		this.adjacencyList.addEdge(from, to);
		return this;
	}

}
