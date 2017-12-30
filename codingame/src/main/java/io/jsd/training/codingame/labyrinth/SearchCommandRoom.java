package io.jsd.training.codingame.labyrinth;

public class SearchCommandRoom implements SearchCell {

	private final Neighbour leftNeighbour;
	private final Neighbour upperNeighbour;
	private final Neighbour rightNeighbour;
	private final Neighbour bottomNeighbour;

	public SearchCommandRoom(Cell currentCell, Labyrinth labyrinth) {
		this.leftNeighbour = new LeftNeighbour(currentCell, labyrinth);
		this.upperNeighbour = new UpperNeighbour(currentCell, labyrinth);
		this.rightNeighbour = new RightNeighbour(currentCell, labyrinth);
		this.bottomNeighbour = new BottomNeighbour(currentCell, labyrinth);
	}

	@Override
	public Direction getCell() {
		if (leftNeighbour.isCommandRoom()) {
			return Direction.LEFT;
		}
		if (upperNeighbour.isCommandRoom()) {
			return Direction.UP;
		}
		if (rightNeighbour.isCommandRoom()) {
			return Direction.RIGHT;
		}
		if (bottomNeighbour.isCommandRoom()) {
			return Direction.DOWN;
		}
		return null;
	}

}
