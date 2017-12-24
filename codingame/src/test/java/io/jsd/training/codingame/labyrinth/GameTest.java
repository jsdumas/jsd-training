package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class GameTest extends GameSetUp{

	
	@Before
	public void initGrid() {
		grid[0] = LINE_0.split("");
		grid[1] = LINE_1.split("");
		grid[2] = LINE_2.split("");
		grid[3] = LINE_3.split("");
		grid[4] = LINE_4.split("");
		labyrinth = new Labyrinth(grid);
		game = new Game(labyrinth, alarm);
	}

		
	@Test
	public void whenKirkGetInCommandRoomThenCountAlarmStartAndFirstMissionIsFinished() {
		kirkSituation.newPosition(new Cell(2,5, COMMAND_ROOM));
		game.isKirkGetInCommandRoom(kirk);
		assertThat(alarm.isCountStarted(), is(true));
		assertThat(kirk.getMission() instanceof GoBackToStartCell, is(true));
	}
	
	@Test
	public void whenKirkScanLabyrinthThenHeGetsAMap() {
		kirkSituation.newPosition(new Cell(2,3, START_CELL));
		assertThat(kirk.scanLabyrinth(labyrinth).size(), Matchers.is(1));
	}

}
