package io.jsd.training.typing;

import static io.jsd.training.typing.EnumSetTest.Days.FRIDAY;
import static io.jsd.training.typing.EnumSetTest.Days.MONDAY;
import static io.jsd.training.typing.EnumSetTest.Days.SATURDAY;
import static io.jsd.training.typing.EnumSetTest.Days.SUNDAY;
import static io.jsd.training.typing.EnumSetTest.Days.THURSDAY;
import static io.jsd.training.typing.EnumSetTest.Days.TUESDAY;
import static io.jsd.training.typing.EnumSetTest.Days.WEDNESDAY;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class EnumSetTest {

	enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	private final Set<Days> setOfTwoDays = EnumSet.of(TUESDAY, WEDNESDAY);
	private final Set<Days> setOfAllDays = EnumSet.allOf(Days.class);
	private final Set<Days> setOfNoneDays = EnumSet.noneOf(Days.class);

	@Test
	public void whenEnumSetOfTuesdayAndWednesdayThenSetContainsOnlyTuesdayAndWednesday() {
		Iterator<Days> iter = setOfTwoDays.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		assertThat(setOfTwoDays.contains(SUNDAY), is(false));
		assertThat(setOfTwoDays.contains(MONDAY), is(false));
		assertThat(setOfTwoDays.contains(TUESDAY), is(true));
		assertThat(setOfTwoDays.contains(WEDNESDAY), is(true));
		assertThat(setOfTwoDays.contains(THURSDAY), is(false));
		assertThat(setOfTwoDays.contains(FRIDAY), is(false));
		assertThat(setOfTwoDays.contains(SATURDAY), is(false));
	}

	@Test
	public void whenEnumSetAllOfDaysThenSetContainsAllOfDays() {
		System.out.println("Week Days:" + setOfAllDays);
		assertThat(setOfAllDays, contains(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY));
	}
	
	@Test
	public void whenEnumSetofNoneDaysThenSetContainsNoneofDays() {
		System.out.println("Week Days:" + setOfNoneDays);
		assertThat(setOfNoneDays.isEmpty(), is(true));
	}

}
