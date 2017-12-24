package io.jsd.training.practice.array.stack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import io.jsd.training.practice.array.stack.Stack;

public class StackTest {

	@Test
	public void test() {
		Stack stack = new Stack();
		assertThat(stack.isEmpty(), is(true));
		stack.push(1);
		assertThat(stack.isEmpty(), is(false));
		stack.push(2);
		MatcherAssert.assertThat(stack.top(), equalTo(2));
		stack.push(3);
		MatcherAssert.assertThat(stack.top(), equalTo(3));
		MatcherAssert.assertThat(stack.pop(), equalTo(3));
		MatcherAssert.assertThat(stack.top(), equalTo(2));
		MatcherAssert.assertThat(stack.pop(), equalTo(2));
		MatcherAssert.assertThat(stack.top(), equalTo(1));
		MatcherAssert.assertThat(stack.pop(), equalTo(1));
		assertThat(stack.isEmpty(), is(true));
		stack.push(1);
		try {
			stack.swap();
			assert false;
		} catch (IllegalArgumentException e) {
		}
		;
		stack.push(2);
		stack.swap();
		MatcherAssert.assertThat(stack.top(), equalTo(1));
		stack.pop();
		MatcherAssert.assertThat(stack.top(), equalTo(2));

		stack.clear();
		MatcherAssert.assertThat(stack.size(), equalTo(0));

		stack.push(1);
		try {
			swap(stack);
			assert false;
		} catch (IllegalArgumentException e) {
		}
		;
		stack.push(2);
		swap(stack);
		MatcherAssert.assertThat(stack.top(), equalTo(1));
		stack.pop();
		MatcherAssert.assertThat(stack.top(), equalTo(2));

		System.out.println("TestStack OK");
	}

	private void swap(Stack stack) {
		if (stack.size() <= 1)
			throw new IllegalArgumentException();
		int x = stack.pop();
		int y = stack.pop();
		stack.push(x);
		stack.push(y);
	}

}
