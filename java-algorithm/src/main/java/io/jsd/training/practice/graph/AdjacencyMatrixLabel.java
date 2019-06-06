package io.jsd.training.practice.graph;

// graphes �tiquet�s
public class AdjacencyMatrixLabel<T> {

	private final int size; // les sommets sont 0,...,n-1
	private final T[][] matrix;

	@SuppressWarnings("unchecked")
	public AdjacencyMatrixLabel(int size) {
		this.size = size;
		this.matrix = (T[][]) new Object[size][size];
	}

	public int getSize() {
		return this.size;
	}

	public boolean hasEdge(int x, int y) {
		return this.matrix[x][y] != null;
	}

	public T getLabel(int x, int y) {
		return this.matrix[x][y];
	}

	public void addEdge(int x, int y, T label) {
		this.matrix[x][y] = label;
	}

	public void removeEdge(int x, int y) {
		this.matrix[x][y] = null;
	}

}
