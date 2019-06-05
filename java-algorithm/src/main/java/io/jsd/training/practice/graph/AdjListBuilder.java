package io.jsd.training.practice.graph;

import java.util.LinkedList;
import java.util.Map;

import io.jsd.training.practice.graph.AdjList;

public class AdjListBuilder {
	
	public static AdjListBuilder initAdjList() {
		return new AdjListBuilder();
	}
	
	private AdjList<Integer> graph;
	
	private AdjListBuilder(){
		this.graph = new AdjList<>();
	}
	
	public AdjList<Integer> build(){
		return this.graph;
	}
	
	public AdjListBuilder addVertex(Integer number){
		this.graph.addVertex(number);
		return this;
	}
	
	public AdjListBuilder addEdge(Integer from, Integer to){
		this.graph.addEdge(from, to);
		return this;
	}

}
