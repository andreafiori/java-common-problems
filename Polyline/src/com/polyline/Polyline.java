package com.polyline;

import java.util.ArrayList;

public final class Polyline {

	private ArrayList<Point> points;

	/**
	 * Set an initial list of points
	 * 
	 * @param points
	 */
 	public Polyline(ArrayList<Point> points) {
 		this.points = points;
	}

	/**
	 * Add a point to the line
	 * 
	 * @param point
	 * @return
	 */
	public ArrayList<Point> add(Point point) {
		points.add(point);

		return points;
	}

	/**
	 * Get the number of points of the list
	 * 
	 * @return the number of points
	 */
	public int size() {
		return points.size();
	}

	/**
	 * Get a Point by index
	 * 
	 * @param index number
	 * @return Point
	 */
	public Point getPoint(int index) {
		return points.get(index);
	}

	/**
	 * Get the list of points
	 * 
	 * @return the list of points
	 */
	public ArrayList<Point> getPoints() {
		return points;
	}
}