package io.jsd.training.codingame.labyrinth;

public class Parent {

	private final Direction from;
	private final Cell parent;

	public Parent(Direction from, Cell parent) {
		this.parent = parent;
		this.from = from;
	}

	public Direction getFrom() {
		return this.from;
	}

	public Cell getCell() {
		return this.parent;
	}

}
