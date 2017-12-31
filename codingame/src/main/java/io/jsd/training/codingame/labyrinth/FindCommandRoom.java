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
//		SearchCell mouvable = new SearchCommandRoom(kirk.getCurrentCell(), labyrinth);
//		if(mouvable.getCell()==null) {
		SearchCell	mouvable = new SearchMouvableCell(kirk.getPreviousCell(), kirk.getCurrentCell(), labyrinth);
//		}
		direction =  mouvable.getCell();
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

}
