package test.io.jsd.training.java.algorithms.practice.graph;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import io.jsd.training.java.algorithms.practice.graph.AdjList;

public class AdjListTest {

	private final static AdjList<Integer> GRAPH = new AdjListBuilder().withVertex(1).withVertex(3).withVertex(5).withEdge(1, 3).withEdge(3,
			5).withEdge(5, 3).withEdge(1, 5).build();

	@Before
	@Test
	public void shoudHaveHedge_1_3() {
		MatcherAssert.assertThat(GRAPH.hasEdge(1, 3), Matchers.is(true));
	}

	@Test
	public void shoudNotHaveRemovedHedge_1_5() {
		GRAPH.removeEdge(1, 5);
		MatcherAssert.assertThat(GRAPH.hasEdge(1, 5), Matchers.is(false));
	}

	@Test
	public void shoudNotHaveUnknownHedge_3_1() {
		MatcherAssert.assertThat(GRAPH.hasEdge(3, 1), Matchers.is(false));
	}

}
