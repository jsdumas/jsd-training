 package io.jsd.training.udemy.balazs.advanced.graphalgorithmscode.arbitragedetection;

import static java.lang.Integer.MAX_VALUE;

import java.util.ArrayList;
import java.util.List;

public class BellmanFord {

	private List<Vertex> vertices;
	private List<Edge> edges;
	private List<Vertex> cycles;

	public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertices = vertexList;
		this.edges = edgeList;
		this.cycles = new ArrayList<>();
	}

	public void bellmanFord(Vertex sourceVertex) {
		sourceVertex.setMinDistance(0);
		for (Vertex vertex : vertices) {
			for (Edge edge : edges) {
				if (edge.getStartVertex().getMinDistance() == MAX_VALUE) {
					continue;
				}
				double newDistance = edge.getStartVertex().getMinDistance() + edge.getWeight();
				if (newDistance < edge.getTargetVertex().getMinDistance()) {
					edge.getTargetVertex().setMinDistance(newDistance);
					edge.getTargetVertex().setPreviousVertex(edge.getStartVertex());
				}
			}
		}

		for (Edge edge : edges) {
			if (edge.getStartVertex().getMinDistance() != MAX_VALUE) {
				if ( hasCycle(edge) ) {				
					Vertex vertex = edge.getStartVertex();
					while( !vertex.equals(edge.getTargetVertex())){
						this.cycles.add(vertex);
						vertex = vertex.getPreviousVertex();
					}
					this.cycles.add(edge.getTargetVertex());
					return;
				}
			}
		}
	}
	
	private boolean hasCycle(Edge edge){
		return edge.getTargetVertex().getMinDistance() > edge.getStartVertex().getMinDistance() + edge.getWeight();
	}
	
	public void printCycle(){
		if( this.cycles != null ){
			for(Vertex vertex : this.cycles){
				System.out.println(vertex);
			}
		}else{
			System.out.println("No arbitrage opportunity...");
		}
	}
}
