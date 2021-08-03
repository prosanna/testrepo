/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * <b>Java 1D Array</b>
 * <p>
 * An array is a simple data structure used to store a collection of data in a
 * contiguous block of memory. Each element in the collection is accessed using
 * an index, and the elements are easy to find because they're stored
 * sequentially in memory. Because the collection of elements in an array is
 * stored as a big block of data, we typically use arrays when we know exactly
 * how many pieces of data we're going to have. For example, you might use an
 * array to store a list of student ID numbers, or the names of state capitals.
 * 
 * @author prosannam
 *
 */
public class Java1DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		int[] myArray = new int[i];

		for (int j = 0; j < i; j++) {
			myArray[j] = scan.nextInt();
		}

		scan.close();

		// Prints each sequential element in array a
		for (int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[j]);
		}

	}

}
