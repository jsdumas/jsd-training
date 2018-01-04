package io.jsd.training.codingame.labyrinth;

public abstract class GameSetUp {

	protected final Kirk kirk = new Kirk();
	protected final KirkSituation kirkSituation = kirk.getKirksituation();

	protected final static String ASTAR_UNKNOWN_LINE = "?????";
	protected final static String ASTAR_START_CELL_WITH_UKNOWN_CELL = "??T??";
	protected final static String ASTAR_LEFT_EMPTY_CELL = "?.T??";

	protected final static String LINE_5_CHARP = "#####";
	protected final static String LINE_2 = "#T.C#";

	protected final static String LINE_7_CHARP = "#######";
	protected final static String LINE_5 = "#T...?#";
	protected final static String LINE_6 = "#T...C#";

	protected final static int ALARM_COUNT = 7;

	protected final String[][] grid = new String[3][5];
	protected Labyrinth labyrinth;

	protected final String[][] gridInLine = new String[3][7];
	protected Labyrinth labyrinthInLine;

	protected final String[][] gridInLineWithCommandRoom = new String[3][7];
	protected Labyrinth labyrinthInLineWithCommandRoom;

	protected final String[][] unknownGrid = new String[3][5];
	protected Labyrinth unknownLabyrinth;

	protected final String[][] gridWithLeftEmptyCell = new String[3][5];
	protected Labyrinth labyrinthWithLeftEmptyCell;

	protected final Alarm alarm = new Alarm(ALARM_COUNT);
}
