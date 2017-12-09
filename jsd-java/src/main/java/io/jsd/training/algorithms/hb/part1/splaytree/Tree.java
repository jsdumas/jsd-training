package io.jsd.training.algorithms.hb.part1.splaytree;

public interface Tree<T extends Comparable<T>> {
	public void insert(T data);
	public Node<T> find(T data);
	public T getMin();
	public T getMax();
	public void inOrderTraversal();
}
