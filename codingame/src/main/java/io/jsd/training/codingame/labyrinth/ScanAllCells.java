package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

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
		TreeSet<ShortestPath> paths = new TreeSet<ShortestPath>();
		for (Cell destination : kirk.getUnknownCells()) {
			Astar astar = new Astar(kirk.getCurrentCell(), destination, cellsToAvoid);
			ShortestPath shortestPath = astar.getShortestPath(true);
			if (!shortestPath.isEmpty()) {
				paths.add(shortestPath);
			}
		}
//		if (paths.isEmpty()) {
//			return new Stack<Direction>();
//		}
		ShortestPath path = paths.first();
		return path.getPath();
	}

}
