package io.jsd.training.codingame.labyrinth;


import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MapScanner {
	
	private final Queue<Cell> queue;
	
	public MapScanner() {
		queue = new LinkedList<Cell>();
	}

	public void scanLabyrinth(Cell currentPosition, Labyrinth labyrinth, LabyrinthMap labyrinthMap) {
		currentPosition.scanCell();
		queue.add(currentPosition);
		while (!queue.isEmpty()) {
			Cell currentCell = queue.remove();
			addStartCellAndCommandRoom(currentCell, labyrinthMap);
			labyrinthMap.addCell(currentCell);
			NeighbourCells neighbourCells = new NeighbourCells(currentCell, labyrinth);
			neighbourCells.addToCurentCell(currentCell, labyrinthMap, labyrinth);
			Map<Direction, Cell> neighbours = currentCell.getNeighbours();
			for (Map.Entry<Direction, Cell> neighbour: neighbours.entrySet()) {
				if (!neighbour.getValue().isScanned()) {
					neighbour.getValue().scanCell();
					queue.add(neighbour.getValue());
				}
			}

		}
	}

	private void addStartCellAndCommandRoom(Cell cell, LabyrinthMap labyrinthMap) {
		if (cell.getCellType().equals(CellType.START_CELL)) {
			labyrinthMap.setStartCell(cell);
		}
		if (cell.getCellType().equals(CellType.COMMAND_ROOM)) {
			labyrinthMap.setCommandRoom(cell);
		}
	}
	
}
