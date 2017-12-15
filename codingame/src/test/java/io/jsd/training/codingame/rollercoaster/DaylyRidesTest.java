package io.jsd.training.codingame.rollercoaster;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/** @link DaylyRides **/
public class DaylyRidesTest extends DaylyRidesInit {
	
	@Test
	public void whenCapacityIsGreaterThanNumberOfRidersThenGainEqualsNumberOfRidersMultiplyNumberOfRidersInTheDay() {
		MatcherAssert.assertThat(DAYLY_RIDES_WITH_CAPACITY_GREATER_THAN_NUMBER_OF_RIDERS.getGain(), Matchers.is(SIXTY));
	}

	@Test
	public void whenOneRideIsFinishedWhithOneGroupOfOnePersonThenCalculOfGainIsOne() {
		MatcherAssert.assertThat(DAYLY_RIDES_WITH_ONE_GROUP_OF_ONE_PERSON.getGain(), Matchers.is(ONE));
	}

	@Test
	public void whenThreeRideAreFinishedWhithFourGroupsOfThreeAndOneAndOneAndTwoPersonsThenCalculOfGainIsSeven() {
		MatcherAssert.assertThat(DAYLY_RIDES_WITH_FOUR_GROUPS_OF_THREE_ONE_ONE_TWO_PERSONS.getGain(), Matchers.is(SEVEN));
	}

	@Test
	public void whenThreeRideAreFinishedWhithFourGroupsOfTwoAndThreeAndFiveAndThreePersonsThenCalculOfGainIsFifteen() {
		MatcherAssert.assertThat(DAYLY_RIDES_WITH_FOUR_GROUPS_OF_TWO_THREE_FIVE_THREE_PERSONS.getGain(), Matchers.is(FIFTEEN));
	}

	@Test
	public void whenNineMillonRidesAreFinishedWhithOneThousandGroupsThenCalculOfGainIsEightyNineThousandSevenHundredFortyFourBillionEightHundredNinetyTwoMillionfiveHundredSixtyFiveThousandFiveHundredSixtyNine() {
		MatcherAssert.assertThat(DAYLY_RIDES_WITH_ONE_THOUSAND_GROUPS_OF_MANY_PERSONS.getGain(), Matchers.is(BIG_GAIN));
	}

}
