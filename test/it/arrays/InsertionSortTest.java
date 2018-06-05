package it.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

	int[] unsorted = { 32, 23, 45, 87, 92, 31, 19 };

	@Test
	public void testInsertionSort() {
		InsertionSort.sort(unsorted);

		assertEquals(Arrays.toString(unsorted), "[19, 23, 31, 32, 45, 87, 92]");
	}

}
