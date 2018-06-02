package arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class QuickSortTest {

	int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
	
	@Test
	void testSortInputToString() {
		assertEquals(Arrays.toString(unsorted), "[6, 5, 3, 1, 8, 7, 2, 4]");
	}
	
	@Test
	void testSort() {
		QuickSort algorithm = new QuickSort();
		algorithm.sort(unsorted);
		
		assertEquals(Arrays.toString(unsorted), "[1, 2, 3, 4, 5, 6, 7, 8]");
	}

}
