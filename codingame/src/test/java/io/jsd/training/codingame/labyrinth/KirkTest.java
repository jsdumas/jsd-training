package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.bean.CellType.COMMAND_ROOM;
import static io.jsd.training.codingame.labyrinth.bean.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import io.jsd.training.codingame.labyrinth.bean.Direction;
import io.jsd.training.codingame.labyrinth.bean.Labyrinth;

public class KirkTest extends GameSetUp {

	@Before
	public void initGrid() {
		gridWithStraightAheadLine[0] = LINE_7_CHARPS.split("");
		gridWithStraightAheadLine[1] = LINE_CHARP_T_3_EMPTY_C_CHARP.split("");
		gridWithStraightAheadLine[2] = LINE_7_CHARPS.split("");
		labyrinthWithStraightAheadLine = new Labyrinth(gridWithStraightAheadLine);

		gridWithTwoEmptyCells[0] = LINE_5_QUESTIONS.split("");
		gridWithTwoEmptyCells[1] = LINE_1_CHARP_1_EMPTY_3_CHARPS.split("");
		gridWithTwoEmptyCells[2] = LINE_1_CHARP_1_EMPTY_1_T_2_CHARPS.split("");
		gridWithTwoEmptyCells[3] = LINE_5_CHARPS.split("");
		labyrinthWithTwoEmptyCells = new Labyrinth(gridWithTwoEmptyCells);

		gridWithLeftEmptyCell[0] = LINE_5_QUESTIONS.split("");
		gridWithLeftEmptyCell[1] = LINE_1_QUESTION_1_EMPTY__1_T_2_QUESTIONS.split("");
		gridWithLeftEmptyCell[2] = LINE_5_QUESTIONS.split("");
		labyrinthWithLeftEmptyCell = new Labyrinth(gridWithLeftEmptyCell);

		grid[0] = LINE_5_CHARPS.split("");
		grid[1] = LINE_1_CHARP_1_T_1_EMPTY_1_COMMAND_1_CHARP.split("");
		grid[2] = LINE_5_CHARPS.split("");
		labyrinth = new Labyrinth(grid);

		gridInLine[0] = LINE_7_CHARPS.split("");
		gridInLine[1] = LINE_5.split("");
		gridInLine[2] = LINE_7_CHARPS.split("");
		labyrinthInLine = new Labyrinth(gridInLine);

		gridInLineWithCommandRoom[0] = LINE_7_CHARPS.split("");
		gridInLineWithCommandRoom[1] = LINE_6.split("");
		gridInLineWithCommandRoom[2] = LINE_7_CHARPS.split("");
		labyrinthInLineWithCommandRoom = new Labyrinth(gridInLineWithCommandRoom);

		unknownGrid[0] = LINE_5_QUESTIONS.split("");
		unknownGrid[1] = LINE_2_QUESTIONS_1_T_2_QUESTIONS.split("");
		unknownGrid[2] = LINE_5_QUESTIONS.split("");
		unknownLabyrinth = new Labyrinth(unknownGrid);
	}

	@Test
	public void whenThen() {
		labyrinthMapWithStraightAheadLine.newPosition(new Cell(1, 5, COMMAND_ROOM));
		// kirkSituation.setStartCell(new Cell(1, 5, STa));
		kirkStraightAheadLine.throwMission(labyrinthWithStraightAheadLine);
		assertThat(kirkStraightAheadLine.getPath().size(), Matchers.is(4));
		assertThat(kirkStraightAheadLine.getPath().pop(), Matchers.equalTo(Direction.LEFT));
		assertThat(kirkStraightAheadLine.getPath().pop(), Matchers.equalTo(Direction.LEFT));
		assertThat(kirkStraightAheadLine.getPath().pop(), Matchers.equalTo(Direction.LEFT));
		assertThat(kirkStraightAheadLine.getPath().pop(), Matchers.equalTo(Direction.LEFT));
	}

	@Test
	public void whenKirkShouldMoveTwiceForScanningCellThenHeMovesTwice() {
		labyrinthMapWithTwoEmptyCells.newPosition(new Cell(2, 2, START_CELL));
		kirkTwoEmptyCells.throwMission(labyrinthWithTwoEmptyCells);
		assertThat(kirkTwoEmptyCells.getPath().size(), Matchers.is(2));
		assertThat(kirkTwoEmptyCells.getPath().pop(), Matchers.equalTo(Direction.LEFT));
		assertThat(kirkTwoEmptyCells.getPath().pop(), Matchers.equalTo(Direction.UP));
	}

	@Test
	public void whenKirkCanOnlyMouveOnLeftThenHisPathContainsOneDirectionWhichIsLeft() {
		labyrinthMapWithLeftEmptyCell.newPosition(new Cell(1, 2, START_CELL));
		kirkLeftEmptyCell.throwMission(labyrinthWithLeftEmptyCell);
		assertThat(kirkLeftEmptyCell.getPath().size(), Matchers.is(1));
		assertThat(kirkLeftEmptyCell.getPath().pop(), Matchers.equalTo(Direction.LEFT));
	}

	@Test
	public void whenKirkdoesntKnowMapThenHeDoesntKnowWhereToGo() {
		// unknownLabyrinthMap.newPosition(new Cell(1, 2, START_CELL));
		// kirkUnknownLabyrinth.throwMission(unknownLabyrinth);
		// assertThat(kirkUnknownLabyrinth.getPath().isEmpty(), Matchers.is(true));
	}

	@Test
	public void whenKirkCanOnlyMouveOnRightThenHeShouldMouveOnRight() {
		labyrinthMap.newPosition(new Cell(1, 1, START_CELL));
		// kirk.throwMission(labyrinth, alarm);
		// assertThat(kirk.getPath(), equalTo(Direction.RIGHT));
	}

	@Test
	public void whenKirkIsOnXEqual1ThenHisXPositionIs1() {
		labyrinthMap.newPosition(new Cell(1, 1, START_CELL));
		// assertThat(kirk.getX(), equalTo(1));
	}

	@Test
	public void whenKirkIsOnYEqual1ThenHisYPositionIs1() {
		labyrinthMap.newPosition(new Cell(1, 1, START_CELL));
		// assertThat(kirk.getY(), equalTo(1));
	}

	@Test
	public void whenKirkStartToPlayThenHisFirstMissionIsToFindCommandRoom() {
		labyrinthMap.newPosition(new Cell(1, 1, START_CELL));
		assertThat(kirk.getMission() instanceof SearchCommandRoom, is(true));
	}

	@Test
	public void whenKirkScanLabyrinthThenLabyrinthmapDisplayAllKnownCells() {
		labyrinthMap.newPosition(new Cell(1, 1, START_CELL));
		// kirk.throwMission(labyrinth, alarm);
		// assertThat(kirk.getSizeOfLabyrinthMap(), is(15));
	}

	@Test
	public void whenKirkScanLabyrinthThenHeKnowsHisCurrentPosition() {
		// kirk.newPosition(new Cell(1, 1, START_CELL));
		// kirk.throwMission(labyrinth, alarm);
		// LabyrinthMap labyrinthMap = kirk.getLabyrinthMap();
		// assertThat(labyrinthMap.getStartCell(), equalTo(new Cell(1, 1, START_CELL)));
	}

	@Test
	public void whenKirkScanLabyrinthAndFindCommandRoomThenHeKnowsCurrentRoomPosition() {
		// kirk.newPosition(new Cell(1, 1, START_CELL));
		// kirk.throwMission(labyrinth, alarm);
		// LabyrinthMap labyrinthMap = kirk.getLabyrinthMap();
		// assertThat(labyrinthMap.getCommandRoom(), equalTo(new Cell(1, 3,
		// COMMAND_ROOM)));
	}

	@Test
	public void whenKirkFindCommandRoomThenHisSecondMissionIsToGetIn() {
		// kirkSituation.newPosition(new Cell(1, 1, START_CELL));
		// kirk.throwMission(labyrinth, alarm);
		// kirk.throwMission(labyrinth, alarm);
		// assertThat(kirk.getMission() instanceof GetInCommandRoom, is(true));
	}

	@Test
	public void whenKirkScansCommandRoomThenHeKnowsCommandRoomPosition() {
		// kirk.newPosition(new Cell(1, 1, START_CELL));
		// kirk.throwMission(labyrinth, alarm);
		// assertThat(kirk.knowsCommandRoomPosition(), is(true));
	}

	@Test
	public void whenKirkGetInCommandRoomThenHeCountAlarmStart() {
		// kirk.newPosition(new Cell(1, 3, CellType.COMMAND_ROOM));
		// kirk.throwMission(labyrinth, alarm);
		// assertThat(alarm.isCountStarted(), is(true));
	}

	@Test
	public void whenKirkGetInCommandRoomThenHisThirdMissionIsToGoBackToStartCell() {
		// kirk.newPosition(new Cell(1, 3, CellType.COMMAND_ROOM));
		// kirk.throwMission(labyrinth, alarm);
		// assertThat(kirk.getMission() instanceof GoBackToStartCell, is(true));
	}

	@Test
	public void whenKirkCanOnlyMouveOnRigthThenHeMouvesOnRight() {
		// kirk.newPosition(new Cell(1, 2, CellType.EMPTY_SPACE));
		// kirk.throwMission(labyrinthInLine, alarm);
		// assertThat(kirk.getDirection(), Matchers.equalTo(Direction.RIGHT));
	}

}
