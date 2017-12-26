package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class FindCommandRoomTest extends GameSetUp{
	
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
	public void whenAllCellsAreNotScannedThenFirstMissionIsNotFinished() {
		kirk.newPosition(new Cell(0,0, START_CELL));
		kirk.scanLabyrinth(labyrinth, alarm);
		assertThat(kirk.getMission() instanceof FindCommandRoom, is(true));
		assertThat(kirk.knowsCommandRoomPosition(), is(true));
	}
	
//	@Test
//	public void whenAllCellsAreScannedThenFirstMissionIsFinished() {
//		kirkSituation.newPosition(new Cell(0,0, START_CELL));
//		Mission mission = new ScanAllCells (kirk);
//		assertThat(mission.isMissionSuccessed(), is(true));
//	}
}
