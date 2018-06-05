package it.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

import it.arrays.QuickSort;

public class QuickSortTest {

	int[] unsorted = { 6, 5, 3, 1, 8, 7, 2, 4 };

	@Test
	public void testSortInputToString() {
		assertEquals(Arrays.toString(unsorted), "[6, 5, 3, 1, 8, 7, 2, 4]");
	}

	@Test
	public void testSort() {
		QuickSort algorithm = new QuickSort();
		algorithm.sort(unsorted);

		assertEquals(Arrays.toString(unsorted), "[1, 2, 3, 4, 5, 6, 7, 8]");
	}

}
