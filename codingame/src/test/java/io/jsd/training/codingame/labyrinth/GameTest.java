package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class GameTest extends KirkSetUp{

	private final static String LINE_0 = "?????????";
	private final static String LINE_1 = "?#######?";
	private final static String LINE_2 = "?#T...C#?";
	private final static String LINE_3 = "?#######?";
	private final static String LINE_4 = "?????????";

	private final static int ROWS = 5;
	private final static int COLUMNS = 9;
	private final static int ALARM_COUNT = 7;

	private final String[][] grid = new String[ROWS][COLUMNS];
	private final Alarm alarm = new Alarm(ALARM_COUNT);

	private Labyrinth labyrinth;
	private Game game;
	
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
	public void whenInitLabyrinthWithAlarmAt7ThenLabyrinthRowsIs7() {
		assertThat(alarm.getCount(), is(ALARM_COUNT));
	}

	@Test
	public void whenInitLabyrinthWith5RowsThenLabyrinthRowsIs5() {
		assertThat(labyrinth.getGrid().length, is(ROWS));
	}

	@Test
	public void whenInitLabyrinthWith9ColumnsThenLabyrinthColumnsIs9() {
		assertThat(labyrinth.getGrid()[0].length, is(COLUMNS));
	}
	
	@Test
	public void whenKirkGetInCommandRoomThenCountAlarmStart() {
		kirkSituation.newPosition(new Position(2,6, COMMAND_ROOM));
		game.isKirkGetInCommandRoom(kirk);
		assertThat(alarm.isCountStarted(), is(true));
	}

}
