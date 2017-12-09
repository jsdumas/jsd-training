package io.jsd.training.java.algorithms.hb.problems.other.closestpairofpoints;

import java.util.Comparator;

public class XSorter implements Comparator<Point>{

	@Override
	public int compare(Point point, Point otherPoint) {
		return Double.compare(point.getX(), otherPoint.getX());
	}
}
