package io.jsd.training.java.algorithm.practice.graph;

// graphes par matrices d'adjacence

public class AdjMatrix {

	private final int size; // les sommets sont 0,...,n-1
	private final boolean[][] m;

	public AdjMatrix(int size) {
		this.size = size;
		this.m = new boolean[size][size];
	}

	public int getSize() {
		return this.size;
	}

	public boolean hasEdge(int x, int y) {
		return this.m[x][y];
	}

	public void addEdge(int x, int y) {
		this.m[x][y] = true;
		// this.m[y][x] = true; // pour un graphe non orient�
	}

	public void removeEdge(int x, int y) {
		this.m[x][y] = false;
		// this.m[y][x] = false; // pour un graphe non orient�
	}

	// Floyd-Warshall
	public void transitiveClosure() {
		for (int v = 0; v < this.size; v++)
			for (int p = 0; p < this.size; p++)
				if (this.m[p][v])
					for (int s = 0; s < this.size; s++)
						if (this.m[v][s])
							addEdge(p, s);
	}

}
