package io.jsd.training.codingame.labyrinth;

public class RightNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private Cell cell;
	private Labyrinth labyrinth;

	public RightNeighbour(Cell cell, Labyrinth labyrinth) {
		this.cell = cell;
		this.labyrinth = labyrinth;
		x=cell.getX()+1;
		y=cell.getY();
	}

	@Override
	public boolean isExist() {
		return x < labyrinth.getLength();
	}

	@Override
	public void addToMap(LabyrinthMap labyrinthMap) {
		if (isExist()) {
			Cell rightNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
			if (!labyrinthMap.contains(rightNeighbour)) {
				labyrinthMap.addCell(rightNeighbour);
				cell.putNeighbour(Direction.LEFT, rightNeighbour);
			}
		}
	}

	@Override
	public boolean isMouvable(Labyrinth labyrinth) {
		if(isExist() && getCellType().equals(CellType.EMPTY_SPACE))
			return true;
		return false;
	}

	@Override
	public CellType getCellType() {
		return labyrinth.getCellType(x, y);
	}

	@Override
	public boolean isCommandRoom() {
		return getCellType().equals(CellType.COMMAND_ROOM);
	}

}
