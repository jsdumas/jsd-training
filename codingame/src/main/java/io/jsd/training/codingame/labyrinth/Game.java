package io.jsd.training.codingame.labyrinth;

public class Game {

	private Labyrinth labyrinth;

	public Game(Labyrinth labyrinth) {
		this.labyrinth = labyrinth;
	}

	public void isKirkGetInCommandRoom(Kirk kirk) {
		String cellType = labyrinth.getCellType(kirk.getPosition());
		if(cellType.equals(CellType.COMMAND_ROOM.getCode())) {
			labyrinth.alarmActivation();
		}
	}

}
