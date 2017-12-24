package io.jsd.training.practice.array.resizablearray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import io.jsd.training.practice.array.resizablearray.ResizableArray;

public class ResizableArrayTest {

	private final static ResizableArray RESIZABLE_ARRAY = new ResizableArray(3);

	@Test
	public void test() {
		shouldGetRightSize(3);
		shouldGetRightcontent("(3)[0, 0, 0]");
		shouldGetRightItemValue(1, 0);

		RESIZABLE_ARRAY.setItemsValue(1, 42);
		shouldGetRightItemValue(1, 42);

		RESIZABLE_ARRAY.setSize(7);
		shouldGetRightSize(7);
		shouldGetRightItemValue(1, 42);
		shouldGetRightcontent("(7)[0, 42, 0, 0, 0, 0, 0]");

		RESIZABLE_ARRAY.setItemsValue(3, 17);
		shouldGetRightcontent("(7)[0, 42, 0, 17, 0, 0, 0]");

		RESIZABLE_ARRAY.setSize(4);
		shouldGetRightSize(4);
		shouldGetRightcontent("(7)[0, 42, 0, 17]");

		RESIZABLE_ARRAY.setSize(8);
		shouldGetRightSize(8);
		shouldGetRightcontent("(14)[0, 42, 0, 17, 0, 0, 0, 0]");

		RESIZABLE_ARRAY.setItemsValue(7, 28);
		shouldGetRightcontent("(14)[0, 42, 0, 17, 0, 0, 0, 28]");

		RESIZABLE_ARRAY.appendNewTableau(new int[] { 1, 2, 3 });
		shouldGetRightSize(11);
		shouldGetRightcontent("(14)[0, 42, 0, 17, 0, 0, 0, 28, 1, 2, 3]");

		RESIZABLE_ARRAY.appendNewTableau(new int[] {});
		shouldGetRightSize(11);

		RESIZABLE_ARRAY.appendNewTableau(new int[] { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 });
		shouldGetRightSize(21);
		shouldGetRightcontent("(28)[0, 42, 0, 17, 0, 0, 0, 28, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]");
	}

	private void shouldGetRightSize(int size) {
		assertThat(RESIZABLE_ARRAY.getSize(), is(size));
	}

	private void shouldGetRightcontent(String content) {
		assertThat(RESIZABLE_ARRAY.toString(), is(content));
	}

	private void shouldGetRightItemValue(int index, int value) {
		assertThat(RESIZABLE_ARRAY.getItemsValue(index), is(value));
	}

}
