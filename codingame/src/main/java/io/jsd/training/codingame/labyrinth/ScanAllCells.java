package io.jsd.training.codingame.labyrinth;

public class ScanAllCells implements Mission{

	private final Kirk kirk;
	private Direction direction;

	public ScanAllCells(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public void throwMission(Labyrinth labyrinth) {
		MapScanner mapScanner = new MapScanner(labyrinth, kirk.getCurrentCell());
		mapScanner.scanLabyrinth();
		LabyrinthMap labyrinthMap = mapScanner.getLabyrinthMap();
		kirk.setLabyrinthMap(labyrinthMap);
		MapExplorer	mapExplorer = new MapExplorer(kirk.getCurrentCell(), labyrinthMap);
		direction =  mapExplorer.getCell();
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

}
