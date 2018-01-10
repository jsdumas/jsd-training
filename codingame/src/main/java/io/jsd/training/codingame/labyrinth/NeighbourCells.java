package io.jsd.training.codingame.labyrinth;

public class NeighbourCells {

	private final Neighbour leftNeighbour;
	private final Neighbour upperNeighbour;
	private final Neighbour rightNeighbour;
	private final Neighbour bottomNeighbour;
	private final LabyrinthMap labyrinthMap;
	private final Cell currentCell;

	public NeighbourCells(Cell currentCell, Labyrinth labyrinth, LabyrinthMap labyrinthMap) {
		this.currentCell = currentCell;
		this.labyrinthMap = labyrinthMap;
		this.leftNeighbour = new LeftNeighbour(currentCell, labyrinth);
		this.upperNeighbour = new UpperNeighbour(currentCell, labyrinth);
		this.rightNeighbour = new RightNeighbour(currentCell, labyrinth);
		this.bottomNeighbour = new BottomNeighbour(currentCell, labyrinth);
	}

	private void addToMap() {
		labyrinthMap.addNeighbourCell(leftNeighbour);
		labyrinthMap.addNeighbourCell(rightNeighbour);
		labyrinthMap.addNeighbourCell(upperNeighbour);
		labyrinthMap.addNeighbourCell(bottomNeighbour);
	}

	public void addToCurrentCell() {
		addToMap();
		currentCell.addNeighbour(Direction.LEFT, labyrinthMap.getNeighbourCell(leftNeighbour));
		currentCell.addNeighbour(Direction.UP, labyrinthMap.getNeighbourCell(upperNeighbour));
		currentCell.addNeighbour(Direction.RIGHT, labyrinthMap.getNeighbourCell(rightNeighbour));
		currentCell.addNeighbour(Direction.DOWN, labyrinthMap.getNeighbourCell(bottomNeighbour));
	}

}
