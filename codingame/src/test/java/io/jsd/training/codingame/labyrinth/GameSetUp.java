package io.jsd.training.codingame.labyrinth;

public abstract class GameSetUp {
	
	protected final Kirk kirk = new Kirk();
	protected final KirkSituation kirkSituation = kirk.getKirksituation();
	
	protected final static String LINE_0 = "????????";
	protected final static String LINE_1 = "?#####??";
	protected final static String LINE_2 = "?##T.C??";
	protected final static String LINE_3 = "?#####??";
	protected final static String LINE_4 = "????????";

	protected final static int ROWS = 5;
	protected final static int COLUMNS = 8;
	protected final static int ALARM_COUNT = 7;

	protected final String[][] grid = new String[ROWS][COLUMNS];
	protected final Alarm alarm = new Alarm(ALARM_COUNT);

	protected Labyrinth labyrinth;
	protected Game game;

}
