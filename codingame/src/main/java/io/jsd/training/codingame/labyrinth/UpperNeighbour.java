package io.jsd.training.codingame.labyrinth;

public class UpperNeighbour implements Neighbour {

	private final int x;
	private final int y;
	private final Cell upperNeighbour;
	private final Cell cell;
	private Labyrinth labyrinth;

	public UpperNeighbour(Cell cell, Labyrinth labyrinth) {
		this.cell = cell;
		this.labyrinth = labyrinth;
		this.x = cell.getX() - 1;
		this.y = cell.getY();
		if (isExist()) {
			this.upperNeighbour = new Cell(x, (y), labyrinth.getCellType(x, y));
		} else {
			this.upperNeighbour = null;
		}
	}

	@Override
	public boolean isExist() {
		return x >= UPPER_LIMIT;
	}

	@Override
	public void addToMap(LabyrinthMap labyrinthMap) {
		if (isExist()) {
			if (!labyrinthMap.contains(upperNeighbour)) {
				labyrinthMap.addCell(upperNeighbour);
				cell.putNeighbour(Direction.DOWN, upperNeighbour);
			}
		}
	}

	@Override
	public boolean isMouvable(Cell previousCell, Labyrinth labyrinth) {
		boolean isPreviousCell=false;
		if(previousCell!=null) {
			isPreviousCell=previousCell.equals(upperNeighbour);
		}
		if (isExist() && getCellType().equals(CellType.EMPTY_SPACE) && !isPreviousCell)
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
