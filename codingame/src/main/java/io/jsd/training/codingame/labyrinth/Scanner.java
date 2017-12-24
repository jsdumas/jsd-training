package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;

import java.util.LinkedList;
import java.util.Queue;

public class Scanner {

	public LabyrinthMap scanLabyrinth(Cell currentPosition, Labyrinth labyrinth) {
		LabyrinthMap labyrinthMap = new LabyrinthMap();
		Queue<Cell> queue = new LinkedList<Cell>();
		currentPosition.scanCell();
		queue.add(currentPosition);
		while (!queue.isEmpty()) {
			Cell actualCell = queue.remove();
			if(actualCell.getCellType().equals(START_CELL)) {
				labyrinthMap.setStartCell(actualCell);
			}
			if(actualCell.getCellType().equals(COMMAND_ROOM)) {
				labyrinthMap.setCommandRoom(actualCell);
			}
			labyrinthMap.addCell(actualCell);
			actualCell.addNeighbours(labyrinthMap, labyrinth);
			for (Cell neighbour : actualCell.getNeighbours()) {
				if (!neighbour.isScanned()) {
					neighbour.scanCell();
					queue.add(neighbour);
				}
			}
		}
		return labyrinthMap;
	}

}
