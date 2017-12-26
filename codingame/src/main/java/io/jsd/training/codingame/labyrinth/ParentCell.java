package io.jsd.training.codingame.labyrinth;

public class ParentCell {

	private final Cell parentCell;
	private final Direction direction;

	public ParentCell(Direction direction, Cell parentCell) {
		this.direction = direction;
		this.parentCell = parentCell;
	}

	public Cell getParentCell() {
		return parentCell;
	}

	public Direction getFrom() {
		return direction;
	}

}
