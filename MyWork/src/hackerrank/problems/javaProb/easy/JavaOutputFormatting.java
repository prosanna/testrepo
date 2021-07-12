/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Java's System.out.printf function can be used to print formatted output. The
 * purpose of this exercise is to test your understanding of formatting output
 * using printf.
 * 
 * @author prosannam
 *
 */
public class JavaOutputFormatting {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * <pre>
	 * <b>Input Format:</b>
	 * </pre>
	 * 
	 * Every line of input will contain a String followed by an integer. Each String
	 * will have a maximum of alphabetic characters, and each integer will be in the
	 * inclusive range from to .
	 * 
	 * <pre>
	 * <b>Output Format:</b>
	 * </pre>
	 * 
	 * In each line of output there should be two columns: The first column contains
	 * the String and is left justified using exactly characters. The second column
	 * contains the integer, expressed in exactly digits; if the original input has
	 * less than three digits, you must pad your output's leading digits with
	 * zeroes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = scanner.next();
			int x = scanner.nextInt();

			if (validateStrLength(s1) && belongToGivenRange(0, 999, x)) {
				System.out.printf("%-15s%03d%n", s1, x);
			}

		}
		System.out.println("================================");

	}

	/**
	 * Validate the String length
	 * 
	 * @param str
	 * @return
	 */
	private static boolean validateStrLength(String str) {
		return Pattern.matches("[a-zA-Z]{0,10}", str);

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
