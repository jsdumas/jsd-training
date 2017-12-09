package io.jsd.training.java.algorithms.chapitres.chap4;

public class TestRectangle2 {

	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(0, 10, 0, 10);
		Rectangle2 r2 = new Rectangle2(5, 20, 7, 13);
		Rectangle2 r3 = r1.intersection(r2);
		System.out.println("R�sultat de l'intersection");
		System.out.print("xmin : " + r3.getXmin() + " xmax : " + r3.getXmax() + " ymin : " + r3.getYmin() + " ymax : " + r3.getYmax());
	}
}
