package io.jsd.training.codingame.labyrinth;

public class ShortestPath {

	private final Direction from;
	private final Cell parent;

	public ShortestPath(Direction from, Cell parent) {
		this.parent = parent;
		this.from = from;
	}

	public Direction getFrom() {
		return this.from;
	}

	public Cell getParent() {
		return this.parent;
	}

}
