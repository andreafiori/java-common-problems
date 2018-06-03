package arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MatrixMultiplierTest {

	@Test
	void testProductThrowsException() throws IllegalArgumentException {
		int[][] aMatrix = {
			{1,2,3},
			{4,5,6}
		};
		
		int [][] bMatrix = {
			{ 7, 8 },
			{ 9, 10 },
			{ 11, 12 },
		};
		
		MatrixMultiplier.product(aMatrix, bMatrix);
	}

	@Test
	void testProduct() {
		int[][] aMatrix = {
			{ 1, 2 },
			{ 3, 4 }
		};
		
		int [][] bMatrix = {
			{ 5, 6 },
			{ 7, 8 },
		};
		
		int[][] expectedMatrix = {
			{ 19, 22 },
			{ 43, 50 }
		};

		int[][] resultMatrix = MatrixMultiplier.product(aMatrix, bMatrix);

		assertTrue( Arrays.deepEquals(resultMatrix, expectedMatrix) );
	}

}
