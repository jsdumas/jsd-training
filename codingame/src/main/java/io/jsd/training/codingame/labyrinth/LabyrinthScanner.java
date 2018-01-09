package io.jsd.training.codingame.labyrinth;

import java.util.LinkedList;
import java.util.List;
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
			List<Edge> edges = currentCell.getNeighbours();
			for (Edge edge : edges) {
				Cell cell = edge.getNeighbourCell();
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
