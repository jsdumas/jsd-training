package io.jsd.training.codingame.labyrinth;

public class ShortestPath {

	private final Direction from;
	private final Cell parent;

	public ShortestPath(Direction from, Cell parent) {
		this.from = from;
		this.parent = parent;
	}

	public Direction getFrom() {
		return this.from;
	}

	public Cell getParent() {
		return this.parent;
	}

}
