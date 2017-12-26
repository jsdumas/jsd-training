package io.jsd.training.codingame.labyrinth;

public class FindCommandRoom implements Mission {

	private final Kirk kirk;
	private Direction direction;

	public FindCommandRoom(Kirk kirk) {
		this.kirk = kirk;
	}

	@Override
	public void throwMission(Labyrinth labyrinth, Alarm alarm) {
		kirk.scanLabyrinth(labyrinth);
		if (kirk.knowsCommandRoomPosition()) {
			kirk.firstMissionFinished();
			kirk.throwMission(labyrinth, alarm);
		}
		setDirection(labyrinth);
	}

	private void setDirection(Labyrinth labyrinth) {
		direction =  null;
		Cell currentCell = kirk.getPosition();
		if (currentCell.isLeftCellMouvable(labyrinth)) {
			direction = Direction.LEFT;
		} else if (currentCell.isUpperCellMouvable(labyrinth)) {
			direction = Direction.UP;
		} else if (currentCell.isRightCellMouvable(labyrinth)) {
			direction = Direction.RIGHT;
		} else if (currentCell.isBottomCellMouvable(labyrinth)) {
			direction = Direction.DOWN;
		}
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

}
