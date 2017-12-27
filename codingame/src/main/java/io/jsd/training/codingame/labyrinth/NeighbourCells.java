package io.jsd.training.codingame.labyrinth;

public class NeighbourCells {
	
	private final Neighbour leftNeighbour;
	private final Neighbour upperNeighbour;
	private final Neighbour rightNeighbour;
	private final Neighbour bottomNeighbour;
	private Cell currentCell;
	
	public NeighbourCells(Cell currentCell, Labyrinth labyrinth) {
		this.currentCell = currentCell;
		leftNeighbour = new LeftNeighbour(currentCell, labyrinth);
		upperNeighbour = new UpperNeighbour(currentCell, labyrinth);
		rightNeighbour = new RightNeighbour(currentCell, labyrinth);
		bottomNeighbour = new BottomNeighbour(currentCell, labyrinth);
	}
	
	public void addToCurentCell(Cell currentCell, LabyrinthMap labyrinthMap, Labyrinth labyrinth) {
		leftNeighbour.addToMap( labyrinthMap );
		rightNeighbour.addToMap( labyrinthMap );
		upperNeighbour.addToMap( labyrinthMap);
		bottomNeighbour.addToMap( labyrinthMap);
	}
	
}
