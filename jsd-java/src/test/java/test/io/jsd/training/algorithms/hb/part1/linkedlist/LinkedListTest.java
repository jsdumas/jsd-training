package test.io.jsd.training.algorithms.hb.part1.linkedlist;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import io.jsd.training.algorithms.hb.part1.linkedlist.LinkedList;
import io.jsd.training.algorithms.hb.part1.linkedlist.List;

public class LinkedListTest {

	@Test
	public void shouldReturn1234() {
		List<Integer> myLinkedList = initList();
		// Because of a List is a LIFO datastructure, list is ordered from the last item pushed to the first one
		assertThat(myLinkedList.traverseListToString(), is("4 3 2 1 "));
	}

	@Test
	public void shouldReturn123() {
		List<Integer> myLinkedList = initList();
		myLinkedList.remove(1);
		assertThat(myLinkedList.traverseListToString(), is("4 3 2 "));
	}

	private List<Integer> initList() {
		List<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.insert(1);
		myLinkedList.insert(2);
		myLinkedList.insert(3);
		myLinkedList.insert(4);
		return myLinkedList;
	}

}
