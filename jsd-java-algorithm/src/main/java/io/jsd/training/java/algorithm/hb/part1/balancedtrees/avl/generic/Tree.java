package io.jsd.training.java.algorithm.hb.part1.balancedtrees.avl.generic;

public interface Tree<T> {
	public void insert(T data);
	public void traverse();
	public void delete(T data);
}
