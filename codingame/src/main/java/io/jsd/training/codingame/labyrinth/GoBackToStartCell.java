package io.jsd.training.codingame.labyrinth;

import java.util.Stack;

public class GoBackToStartCell implements Mission {

	private final Kirk kirk;
	private Stack<Direction> pathToStartCell;
	private Astar aStar;

	public GoBackToStartCell(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public void throwMission(Labyrinth labyrinth) {
		if (aStar == null && pathToStartCell==null) {
			aStar = new Astar();
			pathToStartCell = aStar.getShortestPath(kirk.getCommandRoom(), kirk.getStartCell());
		}
	}

	@Override
	public Direction getDirection() {
		return pathToStartCell.pop();
	}

}
