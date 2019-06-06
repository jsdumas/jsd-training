package io.jsd.training.practice.graph;

import io.jsd.training.practice.graph.AdjacencyList;

public class AdjacencyListBuilder {

	public static AdjacencyListBuilder initAdjList() {
		return new AdjacencyListBuilder();
	}
	
	private AdjacencyList<Integer> graph;
	
	private AdjacencyListBuilder(){
		this.graph = new AdjacencyList<>();
	}
	
	public AdjacencyList<Integer> build(){
		return this.graph;
	}
	
	public AdjacencyListBuilder addVertex(Integer number){
		this.graph.addNewVertex(number);
		return this;
	}
	
	public AdjacencyListBuilder addEdge(Integer from, Integer to){
		this.graph.addEdge(from, to);
		return this;
	}

}
