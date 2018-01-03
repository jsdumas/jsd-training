package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MapExplorer {

	private final Set<CellType> cellsToAvoid;
	private Cell currentCell;
	private LabyrinthMap labyrinthMap;

	public MapExplorer(Cell currentCell, LabyrinthMap labyrinthMap) {
		this.currentCell = currentCell;
		this.labyrinthMap = labyrinthMap;
		this.cellsToAvoid = new HashSet<>();
		cellsToAvoid.add(CellType.COMMAND_ROOM);
		cellsToAvoid.add(CellType.WALL);
	}

	public Direction getCell() {
		for(Cell destination : labyrinthMap.getUnknownCells()) {
			Astar astar = new Astar(currentCell, destination, cellsToAvoid);
			Stack<Direction> directions = astar.getShortestPath();
			if(!directions.isEmpty()) {
				return directions.pop();
			}
		}
		return null;
	}

}
