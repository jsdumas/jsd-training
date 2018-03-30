package io.jsd.training.udemy.balazs.problems.dynamicprogramming.knapsackproblem;

public class App {

	// (items) //
	// - | 0 | 1 | 2 | 3 | 4- | 5 --------------(weight)
	// 0 | 0 | 0 | 0 | 0 | 0- | 0 --------------(value)
	// 1 | 0 | 0 | 0 | 0 | 10 | 10 -------------(value)
	// 2 | 0 | 0 | 4 | 4 | 10 | 10 -------------(value)
	// 3 | 0 | 0 | 4 | 7 | 10 | 11 ->(7+4)------(value)

	public static void main(String[] args) {

		int numOfItems = 3;
		int capacityOfKnapsack = 5;

		// int[] weightOfItems = {4,2,3};
		// int[] profitOfItems = {10,4,7};

		int[] weightOfItems = new int[numOfItems + 1];
		weightOfItems[1] = 4;
		weightOfItems[2] = 2;
		weightOfItems[3] = 3;

		int[] profitOfItems = new int[numOfItems + 1];
		profitOfItems[1] = 10;
		profitOfItems[2] = 4;
		profitOfItems[3] = 7;

		Knapsack knapsack = new Knapsack(numOfItems, capacityOfKnapsack, weightOfItems, profitOfItems);
		knapsack.calculBestBenefit();
		knapsack.showBestItemToTake();
	}
}
