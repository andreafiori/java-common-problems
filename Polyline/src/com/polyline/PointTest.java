package com.polyline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void testGetCoordinates() {
		Point point = new Point(1, 2);
		
		assertEquals(point.getX(), 1);
		assertEquals(point.getY(), 2);
	}

}
