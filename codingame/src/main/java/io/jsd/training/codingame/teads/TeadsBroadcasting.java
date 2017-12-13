package io.jsd.training.codingame.teads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TeadsBroadcasting {

	private Map<Integer, Vertex> graph;

	public TeadsBroadcasting() {
		this.graph = new HashMap<>();
	}

	public void initGraph(int idFrom, int idTo) {
		Vertex vertexFrom = graph.computeIfAbsent(idFrom, key -> new Vertex(key));
		Vertex vertexTo = graph.computeIfAbsent(idTo, key -> new Vertex(key));
		vertexFrom.addAdjacentVertex(vertexTo);
		vertexTo.addAdjacentVertex(vertexFrom);
	}

	public int getShortestHourNumber() {
		int minimumHourBroadcasting = 0;
		while (graph.size() > 1) {
    		removeLeaves(graph);
    		minimumHourBroadcasting++;
    	}
    	return minimumHourBroadcasting;
	}
	
	 private static void removeLeaves(Map<Integer, Vertex> graph) {
	    	Set<Vertex> leaves = graph.values().stream().filter(Vertex::isLeaf).collect(Collectors.toSet());
	    	leaves.stream().forEach(leaf -> {
	    		graph.remove(leaf.getId());
	    		leaf.removeFromAdjacentVertices();
			});
	    }

}
