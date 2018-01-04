package io.jsd.training.codingame.labyrinth;

public abstract class GameSetUp {

	protected final Kirk kirk = new Kirk();
	protected final KirkSituation kirkSituation = kirk.getKirksituation();

	protected final static String LINE_5_QUESTIONS = "?????";
	protected final static String LINE_2_QUESTIONS_1_T_2_QUESTIONS = "??T??";
	protected final static String LINE_1_QUESTION_1_EMPTY__1_T_2_QUESTIONS = "?.T??";
	protected final static String LINE_1_CHARP_1_EMPTY_3_CHARPS = "#.###";
	protected final static String LINE_1_CHARP_1_EMPTY_1_T_2_CHARPS = "#.T##";

	protected final static String LINE_5_CHARPS = "#####";
	protected final static String LINE_1_CHARP_1_T_1_EMPTY_1_COMMAND_1_CHARP = "#T.C#";

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
	
	protected final String[][] gridWithTwoEmptyCells = new String[4][5];
	protected Labyrinth labyrinthWithTwoEmptyCells;

	protected final Alarm alarm = new Alarm(ALARM_COUNT);
}
