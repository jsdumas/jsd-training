package io.jsd.training.algorithms.hb.part1.balancedtrees.redblacktree;

public interface Tree {
    public Node getMax();
    public Node getMin();
    public void insert(int data);
    public void remove(int value);
    public void traverseGraph();
}
