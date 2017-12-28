package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class KirkTest extends GameSetUp{
	
	@Before
	public void initGrid() {
		grid[0] = LINE_0.split("");
		grid[1] = LINE_1.split("");
		grid[2] = LINE_2.split("");
		grid[3] = LINE_3.split("");
		grid[4] = LINE_4.split("");
		labyrinth = new Labyrinth(grid);
	}
	

	@Test
	public void whenKirkCanOnlyMouveOnRightThenHeShouldMouveOnRight() {
		kirkSituation.newPosition(new Cell(2,3, START_CELL));
		 kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.getDirection(alarm), equalTo(Direction.RIGHT));
	}
	
	@Test
	public void whenKirkIsOnXEqual0ThenHisXPositionIs0() {
		kirkSituation.newPosition(new Cell(0,0, START_CELL));
		assertThat(kirk.getX(), equalTo(0));
	}
	
	@Test
	public void whenKirkIsOnYEqual0ThenHisYPositionIs0() {
		kirkSituation.newPosition(new Cell(0,0, START_CELL));
		assertThat(kirk.getY(), equalTo(0));
	}
	
	@Test
	public void whenKirkStartThenHisJetPackEnergyIs1200() {
		kirkSituation.newPosition(new Cell(0,0, START_CELL));
		assertThat(kirk.getJetPackEnergy(), equalTo(1200));
	}
	
	@Test
	public void WhenKirkStartToPlayThenHisFirstMissionIsToFindCommandRoom() {
		kirkSituation.newPosition(new Cell(0,0, START_CELL));
		assertThat(kirk.getMission() instanceof FindCommandRoom, is(true));
	}
	
	@Test
	public void whenKirkScanLabyrinthThenLabyrinthmapDisplayAllKnownCells() {
		kirk.newPosition(new Cell(2,3, START_CELL));
		kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.getSizeOfLabyrinthMap(), is(40));
	}
	
	@Test
	public void whenKirkScanLabyrinthThenHeKnowsHisCurrentPosition() {
		kirk.newPosition(new Cell(2,3, START_CELL));
		kirk.throwMission(labyrinth, alarm);
		LabyrinthMap labyrinthMap = kirk.getLabyrinthMap();
		assertThat(labyrinthMap.getStartCell(), equalTo(new Cell(2,3, START_CELL)));
	}
	
	@Test
	public void whenKirkScanLabyrinthAndFindCommandRoomThenHeKnowsCurrentRoomPosition() {
		kirk.newPosition(new Cell(2,3, START_CELL));
		kirk.throwMission(labyrinth, alarm);
		LabyrinthMap labyrinthMap = kirk.getLabyrinthMap();
		assertThat(labyrinthMap.getCommandRoom(), equalTo(new Cell(2,5, COMMAND_ROOM)));
	}
	
	@Test
	public void whenKirkScansLabyrinthAndFindCommandRoomThenFirstMissionIsCompleted() {
		kirk.newPosition(new Cell(2,3, START_CELL));
		kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.knowsCommandRoomPosition(), is(true));
	}
	
	@Test
	public void whenKirkKnowsCommandRoomPositionAndGetItThenHeFocusesOnThirdMission() {
		kirk.newPosition(new Cell(2,5, COMMAND_ROOM));
		kirk.throwMission(labyrinth, alarm);
		kirk.getDirection(alarm);
		assertThat(kirk.getMission() instanceof GoBackToStartCell, is(true));
	}
	
	@Test
	public void whenKirkGetInCommandRoomThenCountAlarmStart() {
		kirk.newPosition(new Cell(2,5, COMMAND_ROOM));
		kirk.throwMission(labyrinth, alarm);
		assertThat(alarm.isCountStarted(), is(true));
	}
	
	@Test
	public void whenKirkGetInCommandRoomThenHeFocusesOnThirdMission() {
		kirk.newPosition(new Cell(2,5, COMMAND_ROOM));
		kirk.throwMission(labyrinth, alarm);
		assertThat(kirk.getMission() instanceof GoBackToStartCell, is(true));
	}
	
}
