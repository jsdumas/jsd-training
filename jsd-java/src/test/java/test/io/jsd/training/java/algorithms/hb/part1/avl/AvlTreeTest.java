package test.io.jsd.training.java.algorithms.hb.part1.avl;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import io.jsd.training.java.algorithms.hb.part1.balancedtrees.avl.AvlTree;
import io.jsd.training.java.algorithms.hb.part1.balancedtrees.avl.Tree;

public class AvlTreeTest {

	@Test
	public void shouldReturn10_15_5_6() {
		Tree avl = initAvlTree();
		assertThat(avl.toString(), equals("10,15,5,6"));
	}

	@Test
	public void shouldReturn10_5_6() {
		Tree avl = initAvlTree();
		avl.delete(15);
		assertThat(avl.toString(), equals("10,5,6"));
	}

	private Tree initAvlTree() {
		Tree avl = new AvlTree();
		avl.insert(10);
		avl.insert(15);
		avl.insert(5);
		avl.insert(6);
		avl.traverse();
		return avl;
	}

}
