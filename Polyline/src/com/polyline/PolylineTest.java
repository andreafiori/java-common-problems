package com.polyline;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PolylineTest {
	
	private Polyline polyline;

	@BeforeEach
	void setUp() {
		this.polyline = new Polyline( new ArrayList<Point>() );
	}
	
	@AfterEach
	void tearDown() {
		this.polyline = null;
	}
	
	@Test
	void testAdd() {
		polyline.add( new Point(1, 2) );
		
		assertTrue( polyline.getPoint(0) instanceof Point);
	}

	@Test
	void testSizeWithNoPoints() {
		assertEquals(polyline.size(), 0);
	}
	
	@Test
	void testSize() {
		polyline.add( new Point(1, 2) );
		
		assertEquals(polyline.size(), 1);
	}
	
	@Test
	void testGetPoints() {
		polyline.add( new Point(1, 2) );
		
		assertEquals( polyline.getPoints().size(), 1);
	}
}
