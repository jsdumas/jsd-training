package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class GetInCommandRoom implements Mission {

	private final Kirk kirk;
	private final Set<CellType> cellsToAvoid;

	public GetInCommandRoom(Kirk kirk) {
		this.kirk = kirk;
		this.cellsToAvoid = new HashSet<CellType>();
		cellsToAvoid.add(CellType.WALL);
	}

	@Override
	public Stack<Direction> throwMission(Labyrinth labyrinth) {
		if (!kirk.isCommandRoomPositionKnown()) {
			return new Stack<Direction>();
		}
		Astar astar = new Astar(kirk.getCurrentCell(), kirk.getCommandRoom(), cellsToAvoid);
		astar.setShortestPath();
		return astar.getShortestPath(false);
	}

}
