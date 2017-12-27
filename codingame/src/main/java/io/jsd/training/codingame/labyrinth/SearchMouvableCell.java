package io.jsd.training.codingame.labyrinth;

public class SearchMouvableCell implements SearchCell {

	private Labyrinth labyrinth;
	private final Neighbour leftNeighbour;
	private final Neighbour upperNeighbour;
	private final Neighbour rightNeighbour;
	private final Neighbour bottomNeighbour;

	public SearchMouvableCell(Cell currentCell, Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
		this.leftNeighbour = new LeftNeighbour(currentCell, labyrinth);
		this.upperNeighbour = new UpperNeighbour(currentCell, labyrinth);
		this.rightNeighbour = new RightNeighbour(currentCell, labyrinth);
		this.bottomNeighbour = new BottomNeighbour(currentCell, labyrinth);
	}

	public Direction getCell() {
		if (leftNeighbour.isMouvable(labyrinth)) {
			return Direction.LEFT;
		}
		if (upperNeighbour.isMouvable(labyrinth)) {
			return Direction.UP;
		}
		if (rightNeighbour.isMouvable(labyrinth)) {
			return Direction.RIGHT;
		}
		if (bottomNeighbour.isMouvable(labyrinth)) {
			return Direction.DOWN;
		}
		return null;
	}

}
