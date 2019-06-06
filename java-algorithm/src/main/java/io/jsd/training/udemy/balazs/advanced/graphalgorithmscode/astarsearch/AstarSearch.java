package io.jsd.training.udemy.balazs.advanced.graphalgorithmscode.astarsearch;

import static java.lang.Math.abs;
import static java.util.Collections.reverse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class AstarSearch {
	
	private final Node sourceNode;
	private final Node goalNode;
	private final Set<Node> exploredNodes;
	private final PriorityQueue<Node> unexploredNodesQueue;
	private final List<Node> pathList;
	
	public AstarSearch(Node sourceNode, Node goalNode) {
		this.sourceNode = sourceNode;
		this.goalNode = goalNode;
		this.exploredNodes = new HashSet<>();
		this.unexploredNodesQueue = new PriorityQueue<>();
		this.pathList = new ArrayList<>();
	}

	public void executeAStarSearch() {
		sourceNode.setgScore(0);
		unexploredNodesQueue.add(sourceNode);
		boolean found = false;
		while ( !unexploredNodesQueue.isEmpty() && !found ) {
			Node currentNode = unexploredNodesQueue.poll();
			exploredNodes.add(currentNode);
			if (currentNode.getValue().equals(goalNode.getValue())) {
				found = true;
			}
			for (Edge edge : currentNode.getEdges()) {
				Node childNode = edge.getTargetNode();
				double tempGScore = currentNode.getgScore() + edge.getCost();
				double tempFScore = tempGScore + heuristic(childNode, goalNode);
				if( exploredNodes.contains(childNode) && (tempFScore >= childNode.getfScore()) ) {
					continue;
				} else if ( !unexploredNodesQueue.contains(childNode) || (tempFScore < childNode.getfScore()) ) {
					childNode.setParentNode(currentNode);
					childNode.setgScore(tempGScore);
					childNode.setfScore(tempFScore);
					if (unexploredNodesQueue.contains(childNode)) {
						unexploredNodesQueue.remove(childNode);
					}
					unexploredNodesQueue.add(childNode);
				}
			}
		}
	}
	
	public List<Node> printPath(Node targetNode) {
		for (Node node = targetNode; node != null; node = node.getParentNode()) {
			pathList.add(node);
		}
		reverse(pathList);
		return pathList;
	}
	
	// Manhattan heuristic/distance !!!
	public double heuristic(Node node1, Node node2){
		return abs(node1.getX() - node2.getX()) + abs(node2.getY() - node2.getY());
	}
}
