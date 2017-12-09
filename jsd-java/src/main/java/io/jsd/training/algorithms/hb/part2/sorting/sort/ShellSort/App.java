package io.jsd.training.algorithms.hb.part2.sorting.sort.ShellSort;

public class App {

    public static void main(String[] args) {

        int[] nums = { -4,4,2,0,-2 };
        ShellSort shellSort = new ShellSort(nums);
        shellSort.shellSort();
        shellSort.showArray();

    }
}
