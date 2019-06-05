package io.jsd.training.practice.graph;

import static io.jsd.training.practice.graph.AdjListBuilder.initAdjList;
import static org.hamcrest.Matchers.is;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import io.jsd.training.practice.graph.AdjList;

public class AdjListTest {

	private final static AdjList<Integer> GRAPH = initAdjList()//
			.addVertex(1)//
			.addVertex(3)//
			.addVertex(5)//
			.addEdge(1, 3)//
			.addEdge(3,	5)//
			.addEdge(5, 3)//
			.addEdge(1, 5)//
			.build();

	@Before
	@Test
	public void shoudHaveHedge_1_3() {
		MatcherAssert.assertThat(GRAPH.hasEdge(1, 3), is(true));
	}

	@Test
	public void shoudNotHaveRemovedHedge_1_5() {
		GRAPH.removeEdge(1, 5);
		MatcherAssert.assertThat(GRAPH.hasEdge(1, 5), is(false));
	}

	@Test
	public void shoudNotHaveUnknownHedge_3_1() {
		MatcherAssert.assertThat(GRAPH.hasEdge(3, 1), is(false));
	}

}
