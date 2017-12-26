package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;

public class GetInCommandRoom implements Mission {
	
	private final Kirk kirk;
	
	public GetInCommandRoom(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public boolean isMissionSuccessed() {
		if(kirk.getCellTypeOfCurrentPosition().equals(COMMAND_ROOM)){
			return true;
		}
		return false;
	}

}
