package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ScanAllCells implements Mission {

	private final Kirk kirk;
	private final Set<CellType> cellsToAvoid;

	public ScanAllCells(Kirk kirk) {
		this.kirk = kirk;
		this.cellsToAvoid = new HashSet<CellType>();
		cellsToAvoid.add(CellType.COMMAND_ROOM);
		cellsToAvoid.add(CellType.UNKOWN_CELL);
		cellsToAvoid.add(CellType.WALL);
	}

	@Override
	public Stack<Direction> throwMission(Labyrinth labyrinth) {

		MapScanner mapScanner = new MapScanner(labyrinth, kirk.getCurrentCell());
		mapScanner.scanLabyrinth();
		LabyrinthMap labyrinthMap = mapScanner.getLabyrinthMap();
		kirk.setLabyrinthMap(labyrinthMap);

		for (Cell destination : labyrinthMap.getUnknownCells()) {
			Astar astar = new Astar(kirk.getCurrentCell(), destination, cellsToAvoid);
			astar.setShortestPath();
			Stack<Direction> directions = astar.getShortestPath(true);
			if (!directions.isEmpty()) {
				return directions;
			}
		}
		return new Stack<Direction>();
	}

}
