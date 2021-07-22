/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 * 
 * 
 * @author prosanna
 *
 */
public class JavaStringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		scanner.close();

		System.out.println(isPalindrome(str) ? "Yes" : "No");

	}

	/**
	 * Palindrome check
	 * 
	 * @param s1
	 * @param s2
	 */
	private static boolean isPalindrome(String s1) {
		String r = "";
		for (int i = s1.length(); i > 0; i--) {
			r = r.concat(s1.substring(i - 1, i));
		}

		/* System.out.println(r); */

		// return s1.contentEquals(r);
		return s1.equals(r);

	}

}
