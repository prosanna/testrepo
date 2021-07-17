/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * You are given a date. You just need to write the method, getDay , which
 * returns the day on that date.
 * <p>
 * <b>Input Date Format</b>
 * <p>
 * A single line of input containing the space separated month, day and year,
 * respectively, in MM DD YYYY format.
 * 
 * @see <a href=
 *      "https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html">https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html</a>
 * 
 * @author prosannam
 *
 */
public class JavaDateAndTime {

	static List<String> days = Arrays.asList("SUNDAY", 
											"MONDAY", 
											"TUESDAY", 
											"WEDNESDAY", 
											"THURSDAY", 
											"FRIDAY",
											"SATURDAY");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();

		scanner.close();

		System.out.println(getDay(month, day, year));

	}

	/**
	 * This function returns the day of the week in capital letters.
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return string
	 */
	private static String getDay(int month, int day, int year) {

		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day); // as month is 0 base i.e. 0 for January

		int p = c.get(Calendar.DAY_OF_WEEK);
		String s = days.get(p - 1);
		return s;
	}

}
