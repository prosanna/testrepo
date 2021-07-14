/**
 * 
 */
package hackerrank.problems.javaProb.easy;

/**
 * We use the integers a, b, and n to create the following series: (a + 2^0 .
 * b)(a + 2^0 . b + 2^1 . b),.....,(a + 2^0 .b + 2^1 . b + 2^n-1 . b)
 * 
 * @author prosannam
 *
 */
public class JavaLoopsII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 2;
		int b = 0;

		System.out.printf("value : %d%n", power(a, b));
		/* System.out.printf("value : %d%n", (int) Math.pow(a, b)); */

	}

	/**
	 * Calculate the power.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int power(int base, int exponent) {

		if (exponent == 0)
			return 1;
		int result = base;
		for (int i = 1; i < exponent; i++) {
			result = result * base;
		}

		return result;
	}

}
