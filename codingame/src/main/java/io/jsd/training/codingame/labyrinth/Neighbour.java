package io.jsd.training.codingame.labyrinth;

public interface Neighbour {
	
	public static final int LEFT_LIMIT = 0;
	public static final int UPPER_LIMIT = 0;
	
	boolean isExist();
	boolean isMouvable(Cell previousCell, Labyrinth labyrinth);
	boolean isCommandRoom();
	void addToMap(LabyrinthMap labyrinthMap);
	CellType getCellType();
	Cell getCell();
	Cell getNeighbour();

}

