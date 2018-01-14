package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import io.jsd.training.codingame.labyrinth.bean.CellType;
import io.jsd.training.codingame.labyrinth.bean.Direction;

public class GoBackToStartCell implements Mission {

	private final LabyrinthMap labyrinthMap;
	private final Set<CellType> cellsToAvoid;

	public GoBackToStartCell(LabyrinthMap labyrinthMap) {
		this.labyrinthMap = labyrinthMap;
		this.cellsToAvoid = new HashSet<CellType>();
		this.cellsToAvoid.add(CellType.WALL);
		this.cellsToAvoid.add(CellType.UNKOWN_CELL);
	}

	@Override
	public Stack<Direction> throwMission() {
		Astar astar = new Astar(labyrinthMap.getCurrentPosition(), labyrinthMap.getStartCell(), cellsToAvoid);
		ShortestPath shortestPath = astar.getShortestPath();
		return shortestPath.getPath();
	}

}
