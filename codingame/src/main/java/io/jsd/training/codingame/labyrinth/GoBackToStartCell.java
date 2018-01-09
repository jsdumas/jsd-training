package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GoBackToStartCell implements Mission {

	private final Kirk kirk;
	private final Set<CellType> cellsToAvoid;

	public GoBackToStartCell(Kirk kirk) {
		this.kirk = kirk;
		this.cellsToAvoid = new HashSet<CellType>();
		this.cellsToAvoid.add(CellType.WALL);
		this.cellsToAvoid.add(CellType.UNKOWN_CELL);
	}

	@Override
	public Stack<Direction> throwMission(Labyrinth labyrinth) {
		Astar astar = new Astar(kirk.getCurrentCell(), kirk.getStartCell(), cellsToAvoid);
		ShortestPath shortestPath = astar.getShortestPath(false);
		return shortestPath.getPath();
	}

}
