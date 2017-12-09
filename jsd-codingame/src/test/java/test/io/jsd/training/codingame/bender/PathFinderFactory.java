package test.io.jsd.training.codingame.bender;

import static test.io.jsd.training.codingame.bender.Line.LINE_OF_CHARPS;

import io.jsd.training.codingame.bender.Bender;
import io.jsd.training.codingame.bender.BenderBuilder;
import io.jsd.training.codingame.bender.MemorisePath;

public class PathFinderFactory {

	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_TIME_OUT = new BenderBuilder(3, 6).withLine(1, Line.LINE_OF_CHARPS.getLine())
			.withLine(0, Line.AT_AND_THREE_SPACES.getLine()).withLine(1, Line.LINE_OF_CHARPS.getLine()).build();
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_START = new BenderBuilder(2, 6).withLine(0, Line.AT_AND_THREE_SPACES.getLine())
			.withLine(1, Line.LINE_OF_DOLLARDS.getLine()).build();
	private static final Bender BENDER_WALK_TO_EAST_FROM_START = new BenderBuilder(3, 6).withLine(0, LINE_OF_CHARPS.getLine()).withLine(1,
			Line.AT_AND_TWO_SPACES_AND_DOLLARD.getLine()).withLine(2, LINE_OF_CHARPS.getLine()).build();
	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_CHARP = new BenderBuilder(3, 6).withLine(0, LINE_OF_CHARPS.getLine()).withLine(
			1, Line.AT_AND_THREE_CHARPS.getLine()).withLine(2, LINE_OF_CHARPS.getLine()).build();
	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_X = new BenderBuilder(3, 6).withLine(0, LINE_OF_CHARPS.getLine()).withLine(1,
			Line.AT_AND_THREE_X.getLine()).withLine(2, Line.LINE_OF_CHARPS.getLine()).build();
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_S_MODIFIER = new BenderBuilder(3, 6).withLine(0, Line.AT_AND_THREE_SPACES
			.getLine()).withLine(1, Line.LINE_OF_S.getLine()).withLine(2, Line.LINE_OF_DOLLARDS.getLine()).build();
	private static final Bender BENDER_WALK_TO_EAST_FROM_E_MODIFIER = new BenderBuilder(3, 6).withLine(0, Line.AT_AND_THREE_SPACES
			.getLine()).withLine(1, Line.E_AND_ONE_DOLLARD.getLine()).withLine(2, Line.LINE_OF_DOLLARDS.getLine()).build();
	private static final Bender BENDER_WALK_TO_NORTH_FROM_N_MODIFIER = new BenderBuilder(2, 6).withLine(0, Line.AT_AND_DOLLARD.getLine())
			.withLine(1, Line.E_AND_ONE_NORTH_TWO_SPACES.getLine()).build();
	private static final Bender BENDER_WALK_TO_WEST_FROM_W_MODIFIER = new BenderBuilder(2, 6).withLine(0,
			Line.ONE_SPACE_AND_AT_AND_TWO_SPACES.getLine()).withLine(1, Line.DOLLARD_AND_THREE_W.getLine()).build();

	private static final Bender BENDER_WALK_TO_WEST_FROM_INVERSOR = new BenderBuilder(3, 6).withLine(0, Line.ONE_SPACE_AND_AT_AND_TWO_SPACES
			.getLine()).withLine(1, Line.DOLLARD_AND_ONE_I_AND_TWO_X.getLine()).withLine(2, LINE_OF_CHARPS.getLine()).build();
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_BIER = new BenderBuilder(5, 6).withLine(0, LINE_OF_CHARPS.getLine()).withLine(1,
			Line.AT_AND_THREE_SPACES.getLine()).withLine(2, Line.LINE_OF_B.getLine()).withLine(3, Line.LINE_OF_X.getLine()).withLine(4,
					Line.LINE_OF_DOLLARDS.getLine()).build();
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_T = new BenderBuilder(5, 6).withLine(0, Line.AT_AND_THREE_SPACES.getLine())
			.withLine(1, Line.ONE_T_AND_THREE_X.getLine()).withLine(2, Line.LINE_OF_X.getLine()).withLine(3, Line.ONE_T_AND_THREE_X
					.getLine()).withLine(4, Line.LINE_OF_DOLLARDS.getLine()).build();
	private static final Bender BENDER_WALK_TO_EAST_INLINE_FROM_START = new BenderBuilder(3, 6).withLine(0, LINE_OF_CHARPS.getLine())
			.withLine(1, Line.AT_TWO_SPACES_AND_DOLLARD.getLine()).withLine(2, LINE_OF_CHARPS.getLine()).build();
	//

	public MemorisePath getPath(Path path) {
		MemorisePath memorisePath;
		switch (path) {
			case LOOP_BECAUSE_OF_TIME_OUT:
				memorisePath = BENDER_LOOP_WALK_BECAUSE_OF_TIME_OUT.getMemorisePath();
				break;
			case TO_SOUTH_FROM_START:
				memorisePath = BENDER_WALK_TO_SOUTH_FROM_START.getMemorisePath();
				break;
			case TO_EAST_FROM_START:
				memorisePath = BENDER_WALK_TO_EAST_FROM_START.getMemorisePath();
				break;
			case LOOP_BECAUSE_OF_CHARP:
				memorisePath = BENDER_LOOP_WALK_BECAUSE_OF_CHARP.getMemorisePath();
				break;
			case LOOP_BECAUSE_OF_X:
				memorisePath = BENDER_LOOP_WALK_BECAUSE_OF_X.getMemorisePath();
				break;
			case TO_SOUTH_FROM_S_MODIFIER:
				memorisePath = BENDER_WALK_TO_SOUTH_FROM_S_MODIFIER.getMemorisePath();
				break;
			case TO_EAST_FROM_E_MODIFIER:
				memorisePath = BENDER_WALK_TO_EAST_FROM_E_MODIFIER.getMemorisePath();
				break;
			case TO_NORTH_FROM_N_MODIFIER:
				memorisePath = BENDER_WALK_TO_NORTH_FROM_N_MODIFIER.getMemorisePath();
				break;
			case TO_WEST_FROM_W_MODIFIER:
				memorisePath = BENDER_WALK_TO_WEST_FROM_W_MODIFIER.getMemorisePath();
				break;
			case TO_WEST_FROM_INVERSOR:
				memorisePath = BENDER_WALK_TO_WEST_FROM_INVERSOR.getMemorisePath();
				break;
			case TO_SOUTH_FROM_BIER:
				memorisePath = BENDER_WALK_TO_SOUTH_FROM_BIER.getMemorisePath();
				break;
			case TO_SOUTH_FROM_T:
				memorisePath = BENDER_WALK_TO_SOUTH_FROM_T.getMemorisePath();
				break;
			case TO_EAST_INLINE_FROM_START:
				memorisePath = BENDER_WALK_TO_EAST_INLINE_FROM_START.getMemorisePath();
				break;
			default:
				memorisePath = null;
				break;
		}

		return memorisePath;
	}

}
