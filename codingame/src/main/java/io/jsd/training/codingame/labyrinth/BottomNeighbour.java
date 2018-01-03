package io.jsd.training.codingame.labyrinth;

public class BottomNeighbour implements Neighbour {
	
	private final int x;
	private final int y;
	private final Cell bottomNeighbour;
	private final Cell cell;
	private Labyrinth labyrinth;

	public BottomNeighbour(Cell cell, Labyrinth labyrinth) {
		this.cell = cell;
		this.labyrinth = labyrinth;
		this.x=cell.getX()+1;
		this.y=cell.getY();
		if(isExist()) {
			this.bottomNeighbour = new Cell(x, y, labyrinth.getCellType(x, y));
		} else {
			bottomNeighbour=null ;
		}
	}

	@Override
	public boolean isExist() {
		return x < labyrinth.getLength();
	}

	@Override
	public void addToMap(LabyrinthMap labyrinthMap) {
		if (isExist()) {
			if (!labyrinthMap.contains(bottomNeighbour)) {
				labyrinthMap.addCell(bottomNeighbour);
				cell.putNeighbour(Direction.UP, bottomNeighbour);
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
