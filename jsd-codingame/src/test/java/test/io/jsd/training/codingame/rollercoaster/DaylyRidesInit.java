package test.io.jsd.training.codingame.rollercoaster;

import io.jsd.training.codingame.rollercoaster.DaylyRides;
import io.jsd.training.codingame.rollercoaster.GroupOfRiders;
import io.jsd.training.codingame.rollercoaster.RollerCoaster;
import io.jsd.training.codingame.rollercoaster.RollerCoasterQueue;

public abstract class DaylyRidesInit {

	private static final int MAX_PLACE_NUMBER_IS_ONE = 1;
	private static final int MAX_PLACE_NUMBER_IS_THREE = 3;
	private static final int MAX_PLACE_NUMBER_IS_FIVE = 5;
	private static final int MAX_PLACE_NUMBER_IS_THIRTY = 30;
	private static final int MAX_PLACE_NUMBER_TEN_MILLION = 10000000;

	private static final int RIDE_NUMBER_BY_DAY_IS_ONE = 1;
	private static final int RIDE_NUMBER_BY_DAY_IS_THREE = 3;
	private static final int RIDE_NUMBER_BY_DAY_IS_NINE_MILLION = 9000000;

	protected static final int ONE_PERSON = 1;
	protected static final int TWO_PERSONS = 2;
	protected static final int THREE_PERSONS = 3;
	protected static final int FIVE_PERSONS = 5;

	private static final int ID_ONE = 0;
	private static final int ID_TWO = 1;
	private static final int ID_THREE = 2;
	private static final int ID_FOR = 3;

	protected static final long ONE = 1;
	protected static final long SEVEN = 7;
	protected static final long FIFTEEN = 15;
	protected static final long SIXTY = 60;
	protected static final long BIG_GAIN = 89744892565569L;

	// Roller Coaster Queue Init
	private static final RollerCoasterQueue ROLLER_COASTER_QUEUE_OF_ONE_GROUP_OF_ONE_PERSON = new RollerCoasterQueueBuilder()//
			.with(new GroupOfRiders(ID_ONE, ONE_PERSON))//
			.build();

	private static final RollerCoasterQueue ROLLER_COASTER_QUEUE_OF_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS = new RollerCoasterQueueBuilder()
			.with(new GroupOfRiders(ID_ONE, THREE_PERSONS))//
			.with(new GroupOfRiders(ID_TWO, ONE_PERSON))//
			.with(new GroupOfRiders(ID_THREE, ONE_PERSON))//
			.with(new GroupOfRiders(ID_FOR, TWO_PERSONS))//
			.build();

	private static final RollerCoasterQueue ROLLER_COASTER_QUEUE_OF_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS = new RollerCoasterQueueBuilder()
			.with(new GroupOfRiders(ID_ONE, TWO_PERSONS))//
			.with(new GroupOfRiders(ID_TWO, THREE_PERSONS))//
			.with(new GroupOfRiders(ID_THREE, FIVE_PERSONS))//
			.with(new GroupOfRiders(ID_FOR, THREE_PERSONS))//
			.build();
	
	private static final RollerCoasterQueue ROLLER_COASTER_QUEUE_OF_FOUR_GROUPS_OF_FIVE_FIVE_FIVE_FIVE_PERSONS = new RollerCoasterQueueBuilder()
			.with(new GroupOfRiders(ID_ONE, FIVE_PERSONS))//
			.with(new GroupOfRiders(ID_TWO, FIVE_PERSONS))//
			.with(new GroupOfRiders(ID_THREE, FIVE_PERSONS))//
			.with(new GroupOfRiders(ID_FOR, FIVE_PERSONS))//
			.build();

	private static final RollerCoasterQueue ROLLER_COASTER_QUEUE_OF_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS = new RollerCoasterQueueBuilder()
			.withManyPeople().build();

	// Roller Coaster Init
	protected static final RollerCoaster ROLLER_COASTER_FOR_FOUR_GROUPS_OF_FIVE_FIVE_FIVE_FIVE_PERSONS //
	= new RollerCoaster(MAX_PLACE_NUMBER_IS_THIRTY, RIDE_NUMBER_BY_DAY_IS_THREE,
			ROLLER_COASTER_QUEUE_OF_FOUR_GROUPS_OF_FIVE_FIVE_FIVE_FIVE_PERSONS);
	
	protected static final RollerCoaster ROLLER_COASTER_FOR_ONE_GROUP_OF_ONE_PERSON //
			= new RollerCoaster(MAX_PLACE_NUMBER_IS_ONE, RIDE_NUMBER_BY_DAY_IS_ONE, ROLLER_COASTER_QUEUE_OF_ONE_GROUP_OF_ONE_PERSON);

	protected static final RollerCoaster ROLLER_COASTER_FOR_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS //
			= new RollerCoaster(MAX_PLACE_NUMBER_IS_THREE, RIDE_NUMBER_BY_DAY_IS_THREE,
					ROLLER_COASTER_QUEUE_OF_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS);

	protected static final RollerCoaster ROLLER_COASTER_FOR_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS //
			= new RollerCoaster(MAX_PLACE_NUMBER_IS_FIVE, RIDE_NUMBER_BY_DAY_IS_THREE,
					ROLLER_COASTER_QUEUE_OF_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS);

	protected static final RollerCoaster ROLLER_COASTER_FOR_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS //
			= new RollerCoaster(MAX_PLACE_NUMBER_TEN_MILLION, RIDE_NUMBER_BY_DAY_IS_NINE_MILLION,
					ROLLER_COASTER_QUEUE_OF_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS);

	// Dayly Rides Init
	protected static final DaylyRides DAYLY_RIDES_WITH_CAPACITY_GREATER_THAN_NUMBER_OF_RIDERS //
	= new DaylyRides(ROLLER_COASTER_FOR_FOUR_GROUPS_OF_FIVE_FIVE_FIVE_FIVE_PERSONS);
	protected static final DaylyRides DAYLY_RIDES_WITH_ONE_GROUP_OF_ONE_PERSON //
			= new DaylyRides(ROLLER_COASTER_FOR_ONE_GROUP_OF_ONE_PERSON);

	protected static final DaylyRides DAYLY_RIDES_WITH_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS //
			= new DaylyRides(ROLLER_COASTER_FOR_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS);

	protected static final DaylyRides DAYLY_RIDES_WITH_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS //
			= new DaylyRides(ROLLER_COASTER_FOR_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS);

	protected static final DaylyRides DAYLY_RIDES_WITH_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS //
			= new DaylyRides(ROLLER_COASTER_FOR_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS);
}
