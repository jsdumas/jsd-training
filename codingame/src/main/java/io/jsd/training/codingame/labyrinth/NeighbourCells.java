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

	public void addToMapThenAddToCurrentCell() {
		addToMap(leftNeighbour);
		addToMap(rightNeighbour);
		addToMap(upperNeighbour);
		addToMap(bottomNeighbour);
		currentCell.putNeighbour(Direction.LEFT, labyrinthMap.getCell(leftNeighbour.getIdCell()));
		currentCell.putNeighbour(Direction.UP, labyrinthMap.getCell(upperNeighbour.getIdCell()));
		currentCell.putNeighbour(Direction.RIGHT, labyrinthMap.getCell(rightNeighbour.getIdCell()));
		currentCell.putNeighbour(Direction.DOWN, labyrinthMap.getCell(bottomNeighbour.getIdCell()));
	}

	private void addToMap(Neighbour neighbour) {
		if (!labyrinthMap.contains(neighbour.getCell())) {
			labyrinthMap.addCell(neighbour.getCell());
		}
	}

}
