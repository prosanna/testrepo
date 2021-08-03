/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * <b>Java 2D Array</b>
 * <p>
 * You are given a 6*6 2D array. An hourglass in an array is a portion shaped
 * like this:
 * <p>
 * <code>a b c</code>
 * <p>
 * <code>* d *</code>
 * <p>
 * <code>e f g</code>
 * 
 * @author prosannam
 *
 */
public class Java2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] myArray = new int[10][10];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				myArray[i][j] = scan.nextInt();
			}
		}

		scan.close();
		
		int maxi = -100000;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i <= 3 && j <= 3) {
					int sum = myArray[i][j] + myArray[i][j + 1] + myArray[i][j + 2] + (myArray[i + 1][j + 1])
							+ myArray[i + 2][j] + myArray[i + 2][j + 1] + myArray[i + 2][j + 2];
					if (sum > maxi)
						maxi = sum;
				}
			}
		}
		System.out.println(maxi);
		
		print2DArray(myArray);

	}

	/**
	 * Print a 2D Array.
	 * 
	 * @param myArray
	 */
	private static void print2DArray(int[][] myArray) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(myArray[i][j] + " ");
			}
		}
	}

}
