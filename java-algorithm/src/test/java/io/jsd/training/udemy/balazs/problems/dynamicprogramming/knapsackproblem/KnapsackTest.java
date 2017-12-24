package io.jsd.training.udemy.balazs.problems.dynamicprogramming.knapsackproblem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import io.jsd.training.udemy.balazs.problems.dynamicprogramming.knapsackproblem.Knapsack;

public class KnapsackTest {

	private static final int NUM_OF_ITEMS = 3;
	private static final int CAPACITY_OF_KNAPSACK = 5;
	private static final int[] WEIGHT_OF_ITEMS = { 0, 4, 2, 3 };
	private static final int[] PROFIT_OF_ITEMS = { 0, 10, 4, 7 };
	private static final Knapsack KNAPSACK = new Knapsack(NUM_OF_ITEMS, CAPACITY_OF_KNAPSACK, WEIGHT_OF_ITEMS, PROFIT_OF_ITEMS);
	private static final int BEST_BENEFIT_RESULT = 11;

	@Test
	public void shouldFindElevenAsBestBenefit() {
		assertThat(KNAPSACK.calculBestBenefit(), is(BEST_BENEFIT_RESULT));
	}

	@Test
	public void shouldFindThreeAndTwoAsIdItemsToTakeInKnapsack() {
		KNAPSACK.calculBestBenefit();
		assertThat(KNAPSACK.showBestItemToTake(), contains(3, 2));
	}
}
