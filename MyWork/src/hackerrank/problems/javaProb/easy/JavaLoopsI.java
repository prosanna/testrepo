/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * <pre>
 * <b>Task Details:</b>
 * </pre>
 * 
 * <p>
 * Given an integer, N , print its first 10 multiples. Each multiple N * i
 * (where 1<=i<=10) should be printed on a new line in the form: N x i = result.
 * </p>
 * 
 * 
 * @author prosannam
 *
 */
public class JavaLoopsI {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int N = scanner.nextInt();
		scanner.close();

		if (belongToGivenRange(2, 20, N)) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(N + " x " + i + " = " + N * i);
			}
		}

	}

	/**
	 * Check whether a given number belongs to a given range.
	 * 
	 * @param start
	 * @param end
	 * @param number
	 * @return
	 */
	private static boolean belongToGivenRange(int start, int end, int number) {

		return start <= number && number <= end;

	}

}
