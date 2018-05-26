package com.polyline;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args String[]
	 */
	public static void main(String[] args) {
		Polyline polyline = new Polyline( new ArrayList<Point>() );
		polyline.add( new Point(1, 2) );
		polyline.add( new Point(3, 4) );

		System.out.println("There are " + polyline.size() + " points on the polyline");
		System.out.println("First point with x:" + polyline.getPoint(0).getX() + " and y:" + polyline.getPoint(0).getY() );
		System.out.println("Second point with x:" + polyline.getPoint(1).getX() + " and y:" + polyline.getPoint(1).getY() );
	}

}
