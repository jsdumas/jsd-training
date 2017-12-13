package io.jsd.training.java.algorithm.hb.part1.binarysearchtree;

public interface Tree<T> {
	public void traversal();
	public void insert(T data);
	public void delete(T data);
	public T getMaxValue();
	public T getMinValue();
}
