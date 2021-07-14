/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * <b>Static initialization blocks</b>
 * <p>
 * Static initialization blocks are executed when the class is loaded, and you
 * can initialize static variables in those blocks. It's time to test your
 * knowledge of Static initialization blocks.
 * <p>
 * You are given a class Solution with a main method. Complete the given code so
 * that it outputs the area of a parallelogram with breadth and height . You
 * should read the variables from the standard input.
 * <p>
 * If B<=0 or H<=0 , the output should be "java.lang.Exception: Breadth and
 * height must be positive" without quotes.
 * 
 * @author prosanna
 * @see <a href=
 *      "https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html">https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html</a>
 *
 */
public class JavaStaticInitializerBlock {

	static int B, H;
	static boolean flag = true;
	static {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		scanner.close();
		try {
			if (!isPositive(B) || !isPositive(H)) {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

	/**
	 * Check whether an integer is positive or not.
	 * 
	 * @param i
	 * @return
	 */
	private static boolean isPositive(int i) {
		return i > 0;
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
