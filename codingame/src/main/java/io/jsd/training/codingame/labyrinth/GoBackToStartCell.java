package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GoBackToStartCell implements Mission {

	private final Kirk kirk;

	public GoBackToStartCell(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public Stack<Direction> throwMission(Labyrinth labyrinth) {
		if (!kirk.isCommandRoomPositionKnown()) {
			return new Stack<Direction>();
		}
		Set<CellType> cellsToAvoid = new HashSet<CellType>();
		cellsToAvoid.add(CellType.WALL);
		Astar astar = new Astar(kirk.getCurrentCell(), kirk.getStartCell(), cellsToAvoid);
		astar.getShortestPath();
		return astar.scanUnknownCell();
	}

}
