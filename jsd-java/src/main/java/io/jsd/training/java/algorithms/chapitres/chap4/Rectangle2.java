package io.jsd.training.java.algorithms.chapitres.chap4;

public class Rectangle2 {
	float xmin, xmax, ymin, ymax;

	public Rectangle2(float xmin, float xmax, float ymin, float ymax) {
		this.xmin = xmin;
		this.xmax = xmax;
		this.ymin = ymin;
		this.ymax = ymax;
	}

	public float getXmin() {
		return xmin;
	}

	public float getXmax() {
		return xmax;
	}

	public float getYmin() {
		return ymin;
	}

	public float getYmax() {
		return ymax;
	}

	public void setXmin(float xmin) {
		this.xmin = xmin;
	}

	public void setXmax(float xmax) {
		this.xmax = xmax;
	}

	public void setYmin(float ymin) {
		this.ymin = ymin;
	}

	public void setYmax(float ymax) {
		this.ymax = ymax;
	}

	public Rectangle2 intersection(Rectangle2 rect) {
		float newXmin, newXmax, newYmin, newYmax;
		if ((xmax < rect.getXmin()) || (xmin > rect.getXmax()) || (ymax < rect.getYmin()) || (ymin > rect.getYmax()))
			return new Rectangle2(0, 0, 0, 0);
		newXmin = Math.max(xmin, rect.getXmin());
		newXmax = Math.min(xmax, rect.getXmax());
		newYmin = Math.max(ymin, rect.getYmin());
		newYmax = Math.min(ymax, rect.getYmax());
		return new Rectangle2(newXmin, newXmax, newYmin, newYmax);
	}
}
