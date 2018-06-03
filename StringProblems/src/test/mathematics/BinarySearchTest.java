package mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mathematics.BinarySearch;

class BinarySearchTest {

	int[] input = { 2, 4, 6, 8, 10, 12, 14, 16 };

	@Test
	void testBinSearchToBeTrue() {
        assertTrue( BinarySearch.checkElement(input, 2) != -1 );
	}
	
	@Test
	void testBinSearchToBeFalse() {
        assertFalse( BinarySearch.checkElement(input, 3) != -1 );
	}
}
