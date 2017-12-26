package io.jsd.training.codingame.labyrinth;

public class FindCommandRoom implements Mission {
	
	private final Kirk kirk;

	public FindCommandRoom(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public boolean isMissionSuccessed() {
		if(kirk.knowsCommandRoomPosition()) {
			return true;
		}
		return false;
	}

}
