package io.jsd.training.udemy.balazs.part1.binaryheaps.heap.runtime;

import io.jsd.training.udemy.balazs.part1.binaryheaps.heap.Heap;

public class App {
	public static void main(String[] args) {
		
		Heap heap = new Heap(10);
		
		heap.insert(10);
		heap.insert(100);
		heap.insert(-10);
		
		heap.heapsort();
		
		System.out.println();
		System.out.println(heap.getMax());
		
	}
}
