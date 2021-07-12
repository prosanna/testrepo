/**
 * Test your knowledge of using if-else conditional statements to automate decision-making processes.
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * @author prosanna
 *
 */
public class JavaIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();

		if (isEven(number) && belongToGivenRange(1, 100, number)) {
			if (belongToGivenRange(2, 5, number)) {
				System.out.println("Not Weird");
			} else if (belongToGivenRange(6, 20, number)) {
				System.out.println("Weird");
			} else if (number > 20) {
				System.out.println("Not Weird");
			}

		} else {
			System.out.println("Weird");
		}

	}

	/**
	 * Check whether number is even or odd.
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isEven(int number) {

		return number % 2 == 0;

	}

	/**
	 * Check whether a given number belongs to a given range.
	 * 
	 * @param start
	 * @param end
	 * @param number
	 * @return
	 */
	public static boolean belongToGivenRange(int start, int end, int number) {

		return start <= number && number <= end;

	}

}
