package io.jsd.training.java.algorithms.practice.sorting;

public abstract class Sorting {

	protected long start = 0;
	protected long end = 0;

	protected void swap(int[] array, int currentIndice) {
		int tmp = array[currentIndice - 1];
		array[currentIndice - 1] = array[currentIndice];
		array[currentIndice] = tmp;
	}

	protected void swap(int[] array, int currentIndice, int nextIndice) {
		int tmp = array[currentIndice];
		array[currentIndice] = array[nextIndice];
		array[nextIndice] = tmp;
	}

	public String getTimeExec() {
		return "Algorithm takes time to finish: " + (end - start) + "ms";
	}

}
