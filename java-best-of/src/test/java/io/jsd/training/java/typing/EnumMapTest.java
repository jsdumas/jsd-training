package io.jsd.training.java.typing;

import static io.jsd.training.java.typing.EnumMapTest.MealType.BREAKFAST;
import static io.jsd.training.java.typing.EnumMapTest.MealType.DINNER;
import static io.jsd.training.java.typing.EnumMapTest.MealType.LUNCH;
import static io.jsd.training.java.typing.EnumMapTest.MealType.SNACK;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import io.jsd.training.java.typing.EnumMapTest.MealType;

public class EnumMapTest {

	public enum MealType {
		BREAKFAST, LUNCH, SNACK, DINNER
	}

	private final Map<MealType, String> myMealMap = new EnumMap<MealType, String>(MealType.class);

	@Before
	public void setUp() {
		myMealMap.put(MealType.BREAKFAST, "Enjoy Milk and Eggs for breakfast!");
		myMealMap.put(MealType.LUNCH, "Enjoy Chicken, Rice and bread for Lunch!");
		myMealMap.put(MealType.SNACK, "How about an apple for the evening snack!");
		myMealMap.put(MealType.DINNER, "Keep the dinner light, lets have some salad!");
	}

	@Test
	public void whenEnumMapThenKeySetDisplayAllItemsInOrder() {
		assertThat(myMealMap.keySet(), contains(BREAKFAST, LUNCH, SNACK, DINNER));
	}

	@Test
	public void whenEnumMapThenGetLunchDisplayTheRightString() {
		assertThat(myMealMap.get(MealType.LUNCH), equalTo("Enjoy Chicken, Rice and bread for Lunch!"));
		assertThat(myMealMap.get(MealType.SNACK), equalTo("How about an apple for the evening snack!"));
		assertThat(myMealMap.get(MealType.DINNER), equalTo("Keep the dinner light, lets have some salad!"));
	}

	@Test
	public void whenEnumMapThenKeySetIterationGetEachItemOfEnum() {
		MealType mealType = BREAKFAST;
		// Iterate over enumMap
		for (MealType mt : myMealMap.keySet()) {
			mealType = mt;
			System.out.println(myMealMap.get(mt));
		}
		assertThat(mealType, equalTo(DINNER));
	}

	@Test
	public void whenEnumMapRemoveItemThenItManagesConcurrentModification() {
		// Does not throw Concurrent modification Exception in enumMap
		for (MealType mt : myMealMap.keySet()) {
			if (SNACK.equals(mt)) {
				myMealMap.remove(SNACK);
			}
		}
		assertThat(myMealMap.keySet(), contains(BREAKFAST, LUNCH, DINNER));
	}

	@Test
	public void whenEnumMapTenDisplayAllKeyValue() {
		assertThat(myMealMap, hasEntry(BREAKFAST, "Enjoy Milk and Eggs for breakfast!"));
		assertThat(myMealMap, hasEntry(LUNCH, "Enjoy Chicken, Rice and bread for Lunch!"));
		assertThat(myMealMap, hasEntry(SNACK, "How about an apple for the evening snack!"));
		assertThat(myMealMap, hasEntry(DINNER, "Keep the dinner light, lets have some salad!"));
	}

}
