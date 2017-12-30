package io.jsd.training.codingame.labyrinth;

public class SearchMouvableCell implements SearchCell {

	private Labyrinth labyrinth;
	private final Neighbour leftNeighbour;
	private final Neighbour upperNeighbour;
	private final Neighbour rightNeighbour;
	private final Neighbour bottomNeighbour;
	private final Cell previousCell;

	public SearchMouvableCell(Cell previousCell, Cell currentCell, Labyrinth labyrinth) {
		this.previousCell = previousCell;
		this.labyrinth = labyrinth;
		this.leftNeighbour = new LeftNeighbour(currentCell, labyrinth);
		this.upperNeighbour = new UpperNeighbour(currentCell, labyrinth);
		this.rightNeighbour = new RightNeighbour(currentCell, labyrinth);
		this.bottomNeighbour = new BottomNeighbour(currentCell, labyrinth);
	}

	@Override
	public Direction getCell() {
		if (leftNeighbour.isMouvable(previousCell, labyrinth)) {
			return Direction.LEFT;
		}
		if (upperNeighbour.isMouvable(previousCell, labyrinth)) {
			return Direction.UP;
		}
		if (rightNeighbour.isMouvable(previousCell, labyrinth)) {
			return Direction.RIGHT;
		}
		if (bottomNeighbour.isMouvable(previousCell, labyrinth)) {
			return Direction.DOWN;
		}
		return null;
	}

}
