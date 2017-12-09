package io.jsd.training.codingame.telephonenumbers;

public class Node {

	private final int value;
	private Node leftNode;
	private Node middleNode;
	private Node rightNode;

	public Node(int value) {
		this.value = value;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getMiddleNode() {
		return middleNode;
	}

	public void setMiddleNode(Node middleNode) {
		this.middleNode = middleNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public int getValue() {
		return value;
	}

}
