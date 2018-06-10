package it.mathematics;

/**
 * Given an array of non negative integers and a number x, 
 * find a pair in array whose product is closest to x.
 * 
 * Examples:
 * Input : arr[] = [2, 3, 5, 9]
 * 
 * x = 47
 * 
 * Output : {5, 9}
 * Input : arr[] = [2, 3, 5, 9]
 * 
 * x = 8
 * 
 * Output : {2, 5}
 * 
 */
public class ClosestProductPair {
	/**
	 * Prints the pair with product closest to x
	 * 
	 * @param arr
	 * @param n
	 * @param x
	 * 
	 * @return a list of integer or a list with -1
	 */
	public static int[] printClosest(int arr[], int n, int x)
	{
	    // Initialize left and right indexes and difference between pair product and x
	    int l = 0;
	    int r = n - 1;
	    int diff = Integer.MAX_VALUE;
	    int res_l = 0;
	    int res_r = 0;
	 
	    // While there are elements between l and r
	    while (r > l) {
 
	        // Check if this pair is closer than the closest pair so far.
	        if ( Math.abs(arr[l] * arr[r] - x) < diff ) {
	            res_l = l;
	            res_r = r;
	            diff = Math.abs(arr[l] * arr[r] - x);
	        }
 
	        // If this pair has more product, move to smaller values.
	        if (arr[l] * arr[r] > x) {
	        	r--;
	        } else {
	        	// Move to larger values
	        	l++;
	        }
	        
	    }
	 
	    // Check indexes
	    if (res_l != 0 && res_r != 0) {
	    	int[] list = { arr[res_l], arr[res_r] };
		    return list;  
	    }
	    
	    // Return a list with a negative integer
	    int[] list = { -1 };
	    return list;
	}
	
}
