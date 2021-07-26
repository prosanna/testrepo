/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * <b>Valid Username Regular Expression</b>
 * <p>
 * You are updating the username policy on your company's internal networking
 * platform. According to the policy, a username is considered valid if all the
 * following constraints are satisfied:
 * <ul>
 * <li>The username consists of 8 to 30 characters inclusive. If the username
 * consists of less than 8 or greater than 30 characters, then it is an invalid
 * username.</li>
 * 
 * <li>The username can only contain alphanumeric characters and underscores
 * (_). Alphanumeric characters describe the character set consisting of
 * lowercase characters [a-z], uppercase characters [A-Z], and digits
 * [0-9].</li>
 * <li>The first character of the username must be an alphabetic character,
 * i.e., either lowercase character [a-z] or uppercase character [A-Z].</li>
 * </ul>
 * 
 * @author prosanna
 * 
 * @see <a href=
 *      "https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29">https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29</a>
 *
 *
 */
public class ValidUsernameRegularExpression {

	private static List<String> userList = new ArrayList<String>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());

		while (n > 0) {
			String string = s.nextLine();
			userList.add(string);
			n--;
		}
		s.close();

		for (String string : userList) {
			System.out.println(validateUserName(string) ? "Valid" : "Invalid");
		}

	}

	/**
	 * Function to validate Username
	 * <p>
	 * Example //String s = "A_22fdfgdgdfgdfg_F";
	 * 
	 * @param s
	 * @return
	 */
	private static boolean validateUserName(String s) {
		/**
		 * we should specify the length constraint. As the valid username consists of 8 to 30
		 * characters inclusive, i.e., if we fix the first alphabetic character, then
		 * following characters count should be between 7 to 29 inclusive, so our final
		 * regular expression is as below
		 */
		return Pattern.matches("^[\\p{Alpha}][\\w_]{7,29}", s);

	}

	/**
	 * TODO
	 * 
	 * @param s
	 * @param p
	 * @return
	 */
	private static boolean filterUserName(String s, Predicate<String> p) {
		return p.test(s);

	}

}
