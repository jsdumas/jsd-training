package io.jsd.training.practice.graph;

// graphes par matrices d'adjacence

public class AdjacencyMatrix {

	private final int size; // les sommets sont 0,...,n-1
	private final boolean[][] matrix;

	public AdjacencyMatrix(int size) {
		this.size = size;
		this.matrix = new boolean[size][size];
	}

	public int getSize() {
		return this.size;
	}

	public boolean hasEdge(int x, int y) {
		return this.matrix[x][y];
	}

	public void addEdge(int x, int y) {
		this.matrix[x][y] = true;
		// this.m[y][x] = true; // pour un graphe non orient�
	}

	public void removeEdge(int x, int y) {
		this.matrix[x][y] = false;
		// this.m[y][x] = false; // pour un graphe non orient�
	}

	// Floyd-Warshall
	public void transitiveClosure() {
		for (int i = 0; i < this.size; i++)
			for (int j = 0; j < this.size; j++)
				if (this.matrix[j][i])
					for (int k = 0; k < this.size; k++)
						if (this.matrix[i][k])
							addEdge(j, k);
	}

}
