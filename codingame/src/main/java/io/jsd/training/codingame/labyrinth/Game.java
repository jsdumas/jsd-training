package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;

public class Game {

	private Labyrinth labyrinth;

	public Game(Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
	}

	public void isKirkGetInCommandRoom(Kirk kirk) {
		String cellType = labyrinth.getCellType(kirk.getPosition());
		if(cellType.equals(COMMAND_ROOM.getCode())) {
			labyrinth.alarmActivation();
		}
	}

}
