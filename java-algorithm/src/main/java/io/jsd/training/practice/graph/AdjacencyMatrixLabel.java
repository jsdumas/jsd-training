package io.jsd.training.practice.graph;

// graphes �tiquet�s
public class AdjacencyMatrixLabel<T> {

	private final int size; // les sommets sont 0,...,n-1
	private final T[][] m;

	@SuppressWarnings("unchecked")
	public AdjacencyMatrixLabel(int n) {
		this.size = n;
		this.m = (T[][]) new Object[n][n];
	}

	public int getSize() {
		return this.size;
	}

	public boolean hasEdge(int x, int y) {
		return this.m[x][y] != null;
	}

	public T getLabel(int x, int y) {
		return this.m[x][y];
	}

	public void addEdge(int x, T label, int y) {
		this.m[x][y] = label;
	}

	public void removeEdge(int x, int y) {
		this.m[x][y] = null;
	}

}
