package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.UNKOWN_CELL;
import static io.jsd.training.codingame.labyrinth.CellType.WALL;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Scanner {

	public Set<Cell> scanLabyrinth(Cell currentPosition, Labyrinth labyrinth) {
		Set<Cell> map = new HashSet<Cell>();
		Queue<Cell> queue = new LinkedList<Cell>();
		currentPosition.scanCell();
		queue.add(currentPosition);
		while (!queue.isEmpty()) {
			Cell actualCell = queue.remove();
//			addScannedCells(map, actualCell);
			map.add(actualCell);
			actualCell.addNeighbours(map, labyrinth);
			for (Cell neighbour : actualCell.getNeighbours()) {
				if (!neighbour.isScanned()) {
					neighbour.scanCell();
					queue.add(neighbour);
				}
			}
		}
		return map;
	}

	private void addScannedCells(Set<Cell> cells, Cell cell) {
		if (cell.getCellType().equals(WALL) || cell.getCellType().equals(UNKOWN_CELL)) {
			return;
		}
		cells.add(cell);
	}

}
