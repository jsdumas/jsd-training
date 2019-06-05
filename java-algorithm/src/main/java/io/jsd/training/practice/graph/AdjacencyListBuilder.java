package io.jsd.training.practice.graph;

import java.util.LinkedList;
import java.util.Map;

import io.jsd.training.practice.graph.AdjList;

public class AdjacencyListBuilder {

	public static AdjacencyListBuilder initAdjList() {
		return new AdjacencyListBuilder();
	}
	
	private AdjList<Integer> graph;
	
	private AdjacencyListBuilder(){
		this.graph = new AdjList<>();
	}
	
	public AdjList<Integer> build(){
		return this.graph;
	}
	
	public AdjacencyListBuilder addVertex(Integer number){
		this.graph.addVertex(number);
		return this;
	}
	
	public AdjacencyListBuilder addEdge(Integer from, Integer to){
		this.graph.addEdge(from, to);
		return this;
	}

}
