package io.jsd.training.codingame.labyrinth;

import java.util.Stack;

import io.jsd.training.codingame.labyrinth.bean.Direction;

public class ShortestPath implements Comparable<ShortestPath> {

	private final Stack<Direction> pathList;

	public ShortestPath() {
		this.pathList = new Stack<Direction>();
	}

	public void add(Direction fromParent) {
		this.pathList.add(fromParent);
	}

	public boolean isEmpty() {
		return this.pathList.isEmpty();
	}

	public Stack<Direction> getPath() {
		return pathList;
	}

	public int getSize() {
		return pathList.size();
	}

	@Override
	public int compareTo(ShortestPath other) {
		if (this.getSize() < other.getSize()) {
			return -1;
		}
		if (this.getSize() < other.getSize()) {
			return 0;
		}
		return 1;
	}

}
