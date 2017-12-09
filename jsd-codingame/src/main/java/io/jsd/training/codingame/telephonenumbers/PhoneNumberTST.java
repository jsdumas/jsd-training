package io.jsd.training.codingame.telephonenumbers;

public class PhoneNumberTST {

	private Node rootNode;
	private int count = 0;

	public int getNodeNumber() {
		return count;
	}

	public void put(String phoneNumber) {
		String[] phoneNumberArray = phoneNumber.split("");
		rootNode = put(rootNode, phoneNumberArray, 0);
	}

	private Node put(Node node, String[] phoneNumberArray, int index) {
		int number = Integer.parseInt(phoneNumberArray[index]);
		Node currentNode = node;
		// Basic case
		if (currentNode == null) {
			currentNode = new Node(number);
			count++;
		}
		// While phone number is smaller than current node, it is put on the left side
		if (number < currentNode.getValue()) {
			currentNode.setLeftNode(put(currentNode.getLeftNode(), phoneNumberArray, index));
			// While phone number is bigger than current node, it is put on the right side
		} else if (number > currentNode.getValue()) {
			currentNode.setRightNode(put(currentNode.getRightNode(), phoneNumberArray, index));
			// If phone number is equal to current node, it is put on middle if this node is free
		} else if (index < phoneNumberArray.length - 1) {
			currentNode.setMiddleNode(put(currentNode.getMiddleNode(), phoneNumberArray, index + 1));
		}
		return currentNode;
	}
}
