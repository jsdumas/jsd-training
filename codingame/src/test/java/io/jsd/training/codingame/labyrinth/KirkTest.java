package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class KirkTest extends GameSetUp{
	
	@Before
	public void initGrid() {
		grid[0] = LINE_1.split("");
		grid[1] = LINE_2.split("");
		grid[2] = LINE_3.split("");
		labyrinth = new Labyrinth(grid);
		
		gridInLine[0] = LINE_OF_CHARP.split("");
		gridInLine[1] = LINE_5.split("");
		gridInLine[2] = LINE_OF_CHARP.split("");
		labyrinthInLine = new Labyrinth(gridInLine);
	}
	

	@Test
	public void whenKirkCanOnlyMouveOnRightThenHeShouldMouveOnRight() {
		kirkSituation.newPosition(new Cell(1,1, START_CELL));
		 kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.getDirection(), equalTo(Direction.RIGHT));
	}
	
	@Test
	public void whenKirkIsOnXEqual1ThenHisXPositionIs1() {
		kirkSituation.newPosition(new Cell(1,1, START_CELL));
		assertThat(kirk.getX(), equalTo(1));
	}
	
	@Test
	public void whenKirkIsOnYEqual1ThenHisYPositionIs1() {
		kirkSituation.newPosition(new Cell(1,1, START_CELL));
		assertThat(kirk.getY(), equalTo(1));
	}
	
	@Test
	public void whenKirkStartThenHisJetPackEnergyIs1200() {
		kirkSituation.newPosition(new Cell(1,1, START_CELL));
		assertThat(kirk.getJetPackEnergy(), equalTo(1200));
	}
	
	@Test
	public void whenKirkStartToPlayThenHisFirstMissionIsToFindCommandRoom() {
		kirkSituation.newPosition(new Cell(1,1, START_CELL));
		assertThat(kirk.getMission() instanceof FindCommandRoom, is(true));
	}
	
	@Test
	public void whenKirkScanLabyrinthThenLabyrinthmapDisplayAllKnownCells() {
		kirk.newPosition(new Cell(1,1, START_CELL));
		kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.getSizeOfLabyrinthMap(), is(15));
	}
	
	@Test
	public void whenKirkScanLabyrinthThenHeKnowsHisCurrentPosition() {
		kirk.newPosition(new Cell(1,1, START_CELL));
		kirk.throwMission(labyrinth, alarm);
		LabyrinthMap labyrinthMap = kirk.getLabyrinthMap();
		assertThat(labyrinthMap.getStartCell(), equalTo(new Cell(1,1, START_CELL)));
	}
	
	@Test
	public void whenKirkScanLabyrinthAndFindCommandRoomThenHeKnowsCurrentRoomPosition() {
		kirk.newPosition(new Cell(1,1, START_CELL));
		kirk.throwMission(labyrinth, alarm);
		LabyrinthMap labyrinthMap = kirk.getLabyrinthMap();
		assertThat(labyrinthMap.getCommandRoom(), equalTo(new Cell(1,3, COMMAND_ROOM)));
	}
	
	@Test
	public void whenKirkFindCommandRoomThenHisSecondMissionIsToGetIn() {
		kirkSituation.newPosition(new Cell(1,1, START_CELL));
		kirk.scanLabyrinth(labyrinth);
		kirk.throwMission(labyrinth, alarm);
		kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.getMission() instanceof GetInCommandRoom, is(true));
	}
	
	@Test
	public void whenKirkScansCommandRoomThenHeKnowsCommandRoomPosition() {
		kirk.newPosition(new Cell(1,1, START_CELL));
		kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.knowsCommandRoomPosition(), is(true));
	}
	
	@Test
	public void whenKirkGetInCommandRoomThenHeCountAlarmStart() {
		kirk.newPosition(new Cell(1,3, CellType.COMMAND_ROOM));
		kirk.scanLabyrinth(labyrinth);
		kirk.throwMission(labyrinth, alarm);
		assertThat(alarm.isCountStarted(), is(true));
	}
	
	@Test
	public void whenKirkGetInCommandRoomThenHisThirdMissionIsToGoBackToStartCell() {
		kirk.newPosition(new Cell(1,3, CellType.COMMAND_ROOM));
		kirk.scanLabyrinth(labyrinth);
		kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.getMission() instanceof GoBackToStartCell, is(true));
	}
	
	@Test
	public void whenKirkCanOnlyMouveOnRigthThenHeMouvesOnRight() {
		kirk.newPosition(new Cell(1,2, CellType.EMPTY_SPACE));
		kirk.throwMission(labyrinthInLine, alarm);
		assertThat(kirk.getDirection(), Matchers.equalTo(Direction.RIGHT));
	}
	
	@Test
	public void whenKirkCanMouveOnUnvisitedCellThenHeMouvesOnUnvisitedCell() {
		kirk.newPosition(new Cell(1,1, CellType.START_CELL));
		kirk.throwMission(labyrinthInLine, alarm);
		assertThat(kirk.getDirection(), Matchers.equalTo(Direction.RIGHT));
		kirk.newPosition(new Cell(1,2, CellType.EMPTY_SPACE));
		kirk.throwMission(labyrinthInLine, alarm);
		assertThat(kirk.getDirection(), Matchers.equalTo(Direction.RIGHT));
		kirk.newPosition(new Cell(1,3, CellType.EMPTY_SPACE));
		kirk.throwMission(labyrinthInLine, alarm);
		assertThat(kirk.getDirection(), Matchers.equalTo(Direction.RIGHT));
	}
	
}
