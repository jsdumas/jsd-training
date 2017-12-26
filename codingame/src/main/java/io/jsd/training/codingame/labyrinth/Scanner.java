package io.jsd.training.codingame.labyrinth;


import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Scanner {

	public LabyrinthMap scanLabyrinth(Cell currentPosition, Labyrinth labyrinth) {
		LabyrinthMap labyrinthMap = new LabyrinthMap();
		Queue<Cell> queue = new LinkedList<Cell>();
		currentPosition.scanCell();
		queue.add(currentPosition);
		while (!queue.isEmpty()) {
			Cell actualCell = queue.remove();
			if (actualCell.getCellType().equals(CellType.START_CELL)) {
				labyrinthMap.setStartCell(actualCell);
			}
			if (actualCell.getCellType().equals(CellType.COMMAND_ROOM)) {
				labyrinthMap.setCommandRoom(actualCell);
			}
			labyrinthMap.addCell(actualCell);
			actualCell.addNeighbours(labyrinthMap, labyrinth);

			Map<Direction, Cell> neighbours = actualCell.getNeighbours();
			for (Map.Entry<Direction, Cell> neighbour: neighbours.entrySet()) {
				if (!neighbour.getValue().isScanned()) {
					neighbour.getValue().scanCell();
					queue.add(neighbour.getValue());
				}
			}

		}
		return labyrinthMap;
	}

}
