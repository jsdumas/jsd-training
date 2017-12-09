package io.jsd.training.algorithms.hb.problems.dynamicprogramming.knapsackproblem;

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
		for (int itemId = 1; itemId < numOfItems + 1; itemId++) {
			for (int weight = 1; weight < capacityOfKnapsack + 1; weight++) {

				int notTakingItem = knapsackTable[itemId - 1][weight]; // not taking item i
				int takingItem = 0;

				if (weights[itemId] <= weight) {
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
		for (int n = numOfItems, w = capacityOfKnapsack; n > 0; n--) {
			if (knapsackTable[n][w] != 0 && knapsackTable[n][w] != knapsackTable[n - 1][w]) {
				System.out.println("We take item: #" + n);
				idItemsToTake.add(n);
				w = w - weights[n];
			}
		}
		return idItemsToTake;
	}
}
