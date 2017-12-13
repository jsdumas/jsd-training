package io.jsd.training.java.algorithm.hb.part2.sorting.sort.quicksort;

public class App {

    public static void main(String[] args) {

        int[] nums = { 6,5,4,3 };
        Quicksort quicksort = new Quicksort(nums);
        quicksort.sort();
        quicksort.showArray();
    }
}
