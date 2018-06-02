package arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

	int[] unsorted = { 32, 23, 45, 87, 92, 31, 19 };

	@Test
	void testUnsortedAsString() {
		assertEquals(Arrays.toString(unsorted), "[32, 23, 45, 87, 92, 31, 19]");
	}
	
	@Test
	void testInsertionSort() {
		InsertionSort.sort(unsorted);

		assertEquals(Arrays.toString(unsorted), "[19, 23, 31, 32, 45, 87, 92]");
	}

}
