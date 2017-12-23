package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;

public class GoBackToStartCell implements Mission {

	private final Kirk kirk;

	public GoBackToStartCell(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public boolean isMissionSuccessed() {
		if(kirk.getCellTypeOfCurrentPosition().equals(START_CELL)){
			return true;
		}
		return false;
	}

}
