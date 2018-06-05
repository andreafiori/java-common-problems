package it.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

import it.arrays.BubbleSort;

public class BubbleSortTest {

	@Test
	public void testFirstSort() {
		int[] sorted = BubbleSort.sort(new int[] { 20, 12, 45, 19, 91, 55 });

		assertEquals( Arrays.toString(sorted), "[12, 19, 20, 45, 55, 91]");
	}

	@Test
	public void testSortWithNegativeNumber() {
		int[] sorted = BubbleSort.sort(new int[] { -1, 0, 1 });
		
		assertEquals( Arrays.toString(sorted), "[-1, 0, 1]");
	}

	@Test
	public void testSortWith2NegativeNumbers() {
		int[] sorted = BubbleSort.sort(new int[] { -3, -9, -2, -1 });
		
		assertEquals( Arrays.toString(sorted), "[-9, -3, -2, -1]");
	}
	
	@Test
	public void testSortImproved() {
		String[] unsorted = {"Ada", "C++", "Lisp", "Java", "Scala"};
		String[] sorted = BubbleSort.sortImproved(unsorted);
		
		assertEquals( Arrays.toString(sorted), "[Ada, C++, Java, Lisp, Scala]");
	}
}
