package math;

public class ReverseNumber {
	/**
	 * Reverse a number in Java using iteration
	 * 
	 * @param number
	 * @return reverse of number
	 */
	public static int reverse(int number) {
		int reverse = 0;
		int remainder = 0;
		do {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		} while (number > 0);

		return reverse;
	}
}
