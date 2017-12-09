package io.jsd.training.java.algorithms.practice.array.stack;

import java.util.NoSuchElementException;

import io.jsd.training.java.algorithms.practice.array.resizablearray.ResizableArray;

// Structure de pile
public class Stack implements IStack {

	private final ResizableArray resizableArray;

	public Stack() {
		this.resizableArray = new ResizableArray(0);
	}

	@Override
	public boolean isEmpty() {
		return this.resizableArray.getSize() == 0;
	}

	@Override
	public int size() {
		return this.resizableArray.getSize();
	}

	@Override
	public void clear() {
		this.resizableArray.setSize(0);
	}

	@Override
	public void push(int value) {
		int arrayLength = this.resizableArray.getSize();
		this.resizableArray.setSize(arrayLength + 1);
		this.resizableArray.setItemsValue(arrayLength, value);
	}

	@Override
	public int pop() {
		int arrayLength = this.resizableArray.getSize();
		if (arrayLength == 0)
			throw new NoSuchElementException();
		int value = this.resizableArray.getItemsValue(arrayLength - 1);
		this.resizableArray.setSize(arrayLength - 1);
		return value;
	}

	@Override
	public int top() {
		int arrayLength = this.resizableArray.getSize();
		if (arrayLength == 0)
			throw new NoSuchElementException();
		return this.resizableArray.getItemsValue(arrayLength - 1);
	}

	@Override
	public void swap() {
		int arrayLength = this.resizableArray.getSize();
		if (arrayLength <= 1)
			throw new IllegalArgumentException();
		int tmpValue = this.resizableArray.getItemsValue(arrayLength - 1);
		this.resizableArray.setItemsValue(arrayLength - 1, this.resizableArray.getItemsValue(arrayLength - 2));
		this.resizableArray.setItemsValue(arrayLength - 2, tmpValue);
	}

}