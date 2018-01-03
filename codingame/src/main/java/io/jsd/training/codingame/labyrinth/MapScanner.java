package io.jsd.training.codingame.labyrinth;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MapScanner {

	private final Queue<Cell> queue;
	private final Labyrinth labyrinth;
	private final Cell currentPosition;
	private LabyrinthMap labyrinthMap;

	public MapScanner(Labyrinth labyrinth, Cell currentPosition) {
		this.currentPosition = currentPosition;
		queue = new LinkedList<Cell>();
		this.labyrinth = labyrinth;
	}

	public void scanLabyrinth() {
		this.labyrinthMap = new LabyrinthMap();
		currentPosition.scanCell();
		queue.add(currentPosition);
		while (!queue.isEmpty()) {
			Cell currentCell = queue.remove();
			addStartCellAndCommandRoom(currentCell, labyrinthMap);
			labyrinthMap.addCell(currentCell);

			NeighbourCells neighbourCells = new NeighbourCells(currentCell, labyrinth);
			neighbourCells.addToCurentCell(currentCell, labyrinthMap, labyrinth);

			Map<Direction, Cell> neighbours = currentCell.getNeighbours();
			for (Map.Entry<Direction, Cell> neighbour : neighbours.entrySet()) {
				Cell cell = neighbour.getValue();
				if (!cell.isScanned()) {
					cell.scanCell();
					queue.add(cell);
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

	public LabyrinthMap getLabyrinthMap() {
		return labyrinthMap;
	}

}
