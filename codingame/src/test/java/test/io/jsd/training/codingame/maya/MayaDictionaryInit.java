package test.io.jsd.training.codingame.maya;

import io.jsd.training.codingame.maya.MayaNumber;
import io.jsd.training.codingame.maya.MayaNumberConverter;
import io.jsd.training.codingame.maya.MayaNumberDictionary;

public abstract class MayaDictionaryInit {

	private static final int LINE_NUMBER = 4;

	protected static final int HEIGHT = 4;
	protected static final int WIDTH = 4;
	protected static final Long FOUR_THOUSAND_EIGHT_HUNDRED_AND_FIVE = 4805L;
	protected static final Long DEBUG = 238878720L;
	protected static final Long ZERO = 0L;
	
	protected static final MayaNumberDictionary MAYA_DICTIONNARY = new DictionnaryBuilder(WIDTH, HEIGHT).with(Dialect.PATTERN_1).with(
			Dialect.PATTERN_2).with(Dialect.PATTERN_3).with(Dialect.PATTERN_4).build();
	protected static final MayaNumber MAYA_NUMBER_ONE = new MayaNumberBuilder(LINE_NUMBER).width(Number.LINE_ONE_O_THREE_POINTS).width(Number.LINE_POINT).width(
			Number.LINE_POINT).width(Number.LINE_POINT).build();
	protected static final MayaNumber MAYA_NUMBER_TWELVE_ZERO_FIVE = new MayaNumberBuilder(LINE_NUMBER)//
			.width(Number.LINE_TWO_O_TWO_POINTS).width(Number.LINE_DASH).width(Number.LINE_DASH).width(Number.LINE_POINT)//
			.width(Number.LINE_ONE_POINT_TWO_O_ONE_POINT).width(Number.LINE_ONE_O_TWO_POINTS_ONE_O).width(Number.LINE_ONE_POINT_TWO_O_ONE_POINT).width(Number.LINE_POINT)//
			.width(Number.LINE_POINT).width(Number.LINE_DASH).width(Number.LINE_POINT).width(Number.LINE_POINT)//
			.build();
	protected static final MayaNumberConverter MAYA_NUMBER_CONVERTER = new MayaNumberConverter(MAYA_DICTIONNARY);
	
	
	protected static final MayaNumber MAYA_NUMBER_FIFTEEN_HEIGHT_TWEVE_SIXTEEN = new MayaNumberBuilder(LINE_NUMBER)//
			.width(Number.LINE_POINT).width(Number.LINE_DASH).width(Number.LINE_DASH).width(Number.LINE_DASH)//
			.width(Number.LINE_THREE_O_ONE_POINT).width(Number.LINE_DASH).width(Number.LINE_POINT).width(Number.LINE_POINT)//
			.width(Number.LINE_TWO_O_TWO_POINTS).width(Number.LINE_DASH).width(Number.LINE_DASH).width(Number.LINE_POINT)//
			.width(Number.LINE_ONE_O_THREE_POINTS).width(Number.LINE_DASH).width(Number.LINE_DASH).width(Number.LINE_DASH)//
			.build();
	
	protected static final MayaNumber MAYA_NUMBER_FIFTEEN_HEIGHT_TWEVE_SIXTEEN_ZERO = new MayaNumberBuilder(LINE_NUMBER)//
			.width(Number.LINE_POINT).width(Number.LINE_DASH).width(Number.LINE_DASH).width(Number.LINE_DASH)//
			.width(Number.LINE_THREE_O_ONE_POINT).width(Number.LINE_DASH).width(Number.LINE_POINT).width(Number.LINE_POINT)//
			.width(Number.LINE_TWO_O_TWO_POINTS).width(Number.LINE_DASH).width(Number.LINE_DASH).width(Number.LINE_POINT)//
			.width(Number.LINE_ONE_O_THREE_POINTS).width(Number.LINE_DASH).width(Number.LINE_DASH).width(Number.LINE_DASH)//
			.width(Number.LINE_ONE_POINT_TWO_O_ONE_POINT).width(Number.LINE_ONE_O_TWO_POINTS_ONE_O).width(Number.LINE_ONE_POINT_TWO_O_ONE_POINT).width(Number.LINE_POINT)//
			.build();
	
	protected static final MayaNumber MAYA_ZERO = new MayaNumberBuilder(LINE_NUMBER)//
			.width(Number.LINE_ONE_POINT_TWO_O_ONE_POINT).width(Number.LINE_ONE_O_TWO_POINTS_ONE_O).width(Number.LINE_ONE_POINT_TWO_O_ONE_POINT).width(Number.LINE_POINT)//
			.build();
}


