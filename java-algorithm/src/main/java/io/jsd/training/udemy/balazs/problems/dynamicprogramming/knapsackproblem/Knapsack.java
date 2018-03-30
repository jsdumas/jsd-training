package io.jsd.training.udemy.balazs.problems.dynamicprogramming.knapsackproblem;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {

	private final int numOfItems;
	private final int capacityOfKnapsack;
	private final int[][] knapsackTable;
	private int totalBenefit;
	private final int[] weights;
	private final int[] values;

	public Knapsack(int numOfItems, int capacityOfKnapsack, int[] weights, int[] values) {
		this.numOfItems = numOfItems;
		this.capacityOfKnapsack = capacityOfKnapsack;
		this.weights = weights;
		this.values = values;
		this.knapsackTable = new int[numOfItems + 1][capacityOfKnapsack + 1];
	}

	public int calculBestBenefit() {
		// time complexity: O(N*W)
		// first loop on number of items
		for (int itemId = 1; itemId < numOfItems + 1; itemId++) {
			for (int weight = 1; weight < capacityOfKnapsack + 1; weight++) {

				// set the value of previous item
				int notTakingItem = knapsackTable[itemId - 1][weight]; // not taking item i
				int takingItem = 0;

				// if weight of current item is lower than current weight of loop
				if (weights[itemId] <= weight) {
					// value of current item + value of precedent item if current weight - weight of
					// current item is present in array
					takingItem = values[itemId] + knapsackTable[itemId - 1][weight - weights[itemId]];
				}

				knapsackTable[itemId][weight] = Math.max(notTakingItem, takingItem);
			}
		}
		totalBenefit = knapsackTable[numOfItems][capacityOfKnapsack];
		return totalBenefit;
	}

	public List<Integer> showBestItemToTake() {
		List<Integer> idItemsToTake = new ArrayList<>();
		System.out.println("Total benefit: " + totalBenefit);

		// array backwards reading
		for (int itemId = numOfItems, weight = capacityOfKnapsack; itemId > 0; itemId--) {
			// if current value is not 0
			// and if current value is lower than value of previous item
			// then we take this item in knap sack
			if (knapsackTable[itemId][weight] != 0
					&& knapsackTable[itemId][weight] != knapsackTable[itemId - 1][weight]) {
				System.out.println("We take item: #" + itemId);
				idItemsToTake.add(itemId);
				weight = weight - weights[itemId];
			}
		}

		return idItemsToTake;
	}
}
