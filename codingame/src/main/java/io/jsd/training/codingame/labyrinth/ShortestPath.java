package io.jsd.training.codingame.labyrinth;

public class ShortestPath {

	private final Direction from;
	private final Cell parent;

	public ShortestPath(Direction from, Cell parent) {
		this.parent = parent;
		this.from = from;
//		if (from.equals(Direction.DOWN))
//			this.from = Direction.UP;
//		else if (from.equals(Direction.LEFT))
//			this.from = Direction.RIGHT;
//		else if (from.equals(Direction.RIGHT))
//			this.from = Direction.LEFT;
//		else
//			this.from = Direction.DOWN;
	}

	public Direction getFrom() {
		return this.from;
	}

	public Cell getParent() {
		return this.parent;
	}

}
