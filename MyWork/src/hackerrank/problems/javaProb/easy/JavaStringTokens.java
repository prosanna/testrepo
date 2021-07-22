/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * <b>String Tokens</b>
 * <p>
 * Given a string, s , matching the regular expression [A-Za-z !,?._'@]+, split
 * the string into tokens. We define a token to be one or more consecutive
 * English alphabetic letters. Then, print the number of tokens, followed by
 * each token on a new line.
 * 
 * @author prosanna
 * @see <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-">https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-</a>
 *      <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html</a>
 */
public class JavaStringTokens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		if (s.isEmpty()) {
			System.out.println(0);
		} else {
			s = s.replaceAll("[^\\p{Alpha}+]", " ").trim();

			if (s.isEmpty()) {
				System.out.println(0);
			} else {
				String[] a = s.split("\\p{Space}+");
				System.out.println(a.length);
				for (String string : a) {
					System.out.println(string);
				}
			}
		}

		scanner.close();

	}

}
