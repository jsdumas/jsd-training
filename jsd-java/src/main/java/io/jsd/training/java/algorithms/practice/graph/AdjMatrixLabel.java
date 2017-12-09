package io.jsd.training.java.algorithms.practice.graph;

// graphes �tiquet�s
public class AdjMatrixLabel<L> {

	private final int size; // les sommets sont 0,...,n-1
	private final L[][] m;

	@SuppressWarnings("unchecked")
	public AdjMatrixLabel(int n) {
		this.size = n;
		this.m = (L[][]) new Object[n][n];
	}

	public int getSize() {
		return this.size;
	}

	public boolean hasEdge(int x, int y) {
		return this.m[x][y] != null;
	}

	public L getLabel(int x, int y) {
		return this.m[x][y];
	}

	public void addEdge(int x, L label, int y) {
		this.m[x][y] = label;
	}

	public void removeEdge(int x, int y) {
		this.m[x][y] = null;
	}

}
