package io.jsd.training.codingame.labyrinth;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public abstract class LabyrinthScanner {

	public void breadthFirstSearch(Labyrinth labyrinth, LabyrinthMap labyrinthMap, Cell currentPosition) {
		labyrinthMap.removeAllCellsCollections();
		Queue<Cell> queue = new LinkedList<Cell>();
		currentPosition.scanCell();
		queue.add(currentPosition);
		while (!queue.isEmpty()) {
			Cell currentCell = queue.remove();
			labyrinthMap.addCell(currentCell);
			setNeighbours(labyrinth, labyrinthMap, currentCell);
			Map<Direction, Cell> neighbours = currentCell.getNeighboursMap();
			for (Map.Entry<Direction, Cell> neighbour : neighbours.entrySet()) {
				Cell cell = neighbour.getValue();
				if (cell != null && !cell.isScanned()) {
					cell.scanCell();
					queue.add(cell);
				}
			}

		}
	}

	private void setNeighbours(Labyrinth labyrinth, LabyrinthMap labyrinthMap, Cell currentCell) {
		NeighbourCells neighbourCells = new NeighbourCells(currentCell, labyrinth, labyrinthMap);
		neighbourCells.addToMap();
		neighbourCells.addToCurrentCell();
	}

}
