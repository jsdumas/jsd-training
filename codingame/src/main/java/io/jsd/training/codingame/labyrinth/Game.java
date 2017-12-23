package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;

public class Game {

	private Labyrinth labyrinth;
	private final Alarm alarm;

	public Game(Labyrinth labyrinth, Alarm alarm) {
		this.labyrinth = labyrinth;
		this.alarm = alarm;
	}

	public void isKirkGetInCommandRoom(Kirk kirk) {
		String cellType = labyrinth.getCellType(kirk.getPosition());
		if(cellType.equals(COMMAND_ROOM.getCode())) {
			alarm.sartCount();
		}
	}

}
