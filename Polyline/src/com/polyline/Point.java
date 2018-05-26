package com.polyline;

public final class Point {
	private final float x;
	private final float y;

	/**
	 * Set point coordinates
	 * 
	 * @param x float
	 * @param y float
	 */
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Set x coordinate
	 * 
	 * @return
	 */
	public float getX() {
		return x;
	}

	/**
	 * Set y coordinate
	 * 
	 * @return
	 */
	public float getY() {
		return y;
	}
}