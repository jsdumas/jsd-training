package io.jsd.training.codingame.labyrinth;

public class GetInCommandRoom implements Mission {
	
	private final Kirk kirk;
	private Direction direction;
	
	public GetInCommandRoom(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public void throwMission(Labyrinth labyrinth) {
		SearchCell searchCommandRoom = new SearchCommandRoom(kirk.getPosition(), labyrinth);
		direction = searchCommandRoom.getCell();
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

}
