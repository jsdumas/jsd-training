package io.jsd.training.codingame.labyrinth;

public interface Neighbour {

	public static final int LEFT_LIMIT = 0;
	public static final int UPPER_LIMIT = 0;

	boolean isInMap();

	boolean isMouvable(Labyrinth labyrinth);

	boolean isCommandRoom();

	CellType getCellType();

	Cell getCell();

	Integer getIdCell();

}
