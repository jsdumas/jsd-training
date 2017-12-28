package io.jsd.training.codingame.labyrinth;

public class FindCommandRoom implements Mission{

	private final Kirk kirk;
	private Direction direction;

	public FindCommandRoom(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public void throwMission(Labyrinth labyrinth) {
		kirk.scanLabyrinth(labyrinth);
		setDirection(labyrinth);
	}

	private void setDirection(Labyrinth labyrinth) {
		SearchCell mouvable = new SearchMouvableCell(kirk.getPosition(), labyrinth);
		direction =  mouvable.getCell();
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

}
