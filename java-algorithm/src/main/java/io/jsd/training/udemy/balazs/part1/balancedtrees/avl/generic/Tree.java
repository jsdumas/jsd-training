package io.jsd.training.udemy.balazs.part1.balancedtrees.avl.generic;

public interface Tree<T> {
	public void insert(T data);
	public void traverse();
	public void delete(T data);
}
