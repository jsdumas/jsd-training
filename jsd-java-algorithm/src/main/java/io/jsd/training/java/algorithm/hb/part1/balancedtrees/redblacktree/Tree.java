package io.jsd.training.java.algorithm.hb.part1.balancedtrees.redblacktree;

public interface Tree {
    public Node getMax();
    public Node getMin();
    public void insert(int data);
    public void remove(int value);
    public void traverseGraph();
}
