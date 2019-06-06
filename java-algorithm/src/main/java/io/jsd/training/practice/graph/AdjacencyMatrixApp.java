package io.jsd.training.practice.graph;

public class AdjacencyMatrixApp {

	public static void main(String[] args) {
		AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(6);
		adjacencyMatrix.addEdge(1, 3);
		adjacencyMatrix.addEdge(3, 5);
		assert (adjacencyMatrix.hasEdge(1, 3));
		adjacencyMatrix.removeEdge(1, 3);
		assert (!adjacencyMatrix.hasEdge(1, 3));
		assert (!adjacencyMatrix.hasEdge(3, 1));
		assert (adjacencyMatrix.hasEdge(3, 5));

		AdjacencyMatrixLabel<String> adjacencyMatrixLabel = new AdjacencyMatrixLabel<>(6);
		adjacencyMatrixLabel.addEdge(1, 3, "foo");
		adjacencyMatrixLabel.addEdge(3, 5, "bar");
		assert (adjacencyMatrixLabel.hasEdge(1, 3));
		adjacencyMatrixLabel.removeEdge(1, 3);
		assert (!adjacencyMatrixLabel.hasEdge(1, 3));
		assert (!adjacencyMatrixLabel.hasEdge(3, 1));
		assert (adjacencyMatrixLabel.hasEdge(3, 5));

		System.out.println("TestAdjMatrix OK");

	}

}
