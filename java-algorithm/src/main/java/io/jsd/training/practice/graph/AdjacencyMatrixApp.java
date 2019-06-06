package io.jsd.training.practice.graph;

public class AdjacencyMatrixApp {

	public static void main(String[] args) {
		AdjacencyMatrix g = new AdjacencyMatrix(6);
		g.addEdge(1, 3);
		g.addEdge(3, 5);
		assert (g.hasEdge(1, 3));
		g.removeEdge(1, 3);
		assert (!g.hasEdge(1, 3));
		assert (!g.hasEdge(3, 1));
		assert (g.hasEdge(3, 5));

		AdjacencyMatrixLabel<String> gl = new AdjacencyMatrixLabel<>(6);
		gl.addEdge(1, "foo", 3);
		gl.addEdge(3, "bar", 5);
		assert (gl.hasEdge(1, 3));
		gl.removeEdge(1, 3);
		assert (!gl.hasEdge(1, 3));
		assert (!gl.hasEdge(3, 1));
		assert (gl.hasEdge(3, 5));

		System.out.println("TestAdjMatrix OK");

	}

}
