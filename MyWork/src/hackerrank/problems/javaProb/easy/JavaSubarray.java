/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <b>Java Subarray</b>
 * <p>
 * A subarray of an -element array is an array composed from a contiguous block
 * of the original array's elements. For example, if
 * <code>array = [1,2,3]</code>, then the subarrays are
 * <code>[1],[2],[3],[1,2],[2,3] and [1,2,3]</code>. Something like
 * <code>[1,3]</code> would not be a subarray as it's not a contiguous
 * subsection of the original array.
 * 
 * @author prosanna
 *
 */
public class JavaSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		int numNegativeSubarrays = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {

				int sum = 0;

				for (int k = i; k <= j; k++) {
					sum = sum + a[k];
				}

				if (sum < 0) {
					numNegativeSubarrays++;
				}
			}
		}

		System.out.println(numNegativeSubarrays);

	}

	/**
	 * TODO Alternative approach with lambda.
	 */
	public static void numNegativeSubarrays(int[] a) {

		int numNegativeSubarrays = Arrays.stream(a).sum();
		System.out.println(numNegativeSubarrays);
	}

}
