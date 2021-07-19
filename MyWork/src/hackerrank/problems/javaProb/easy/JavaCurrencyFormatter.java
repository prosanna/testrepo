/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * <p>
 * Given a double-precision number, , denoting an amount of money, use the
 * NumberFormat class' getCurrencyInstance method to convert into the US,
 * Indian, Chinese, and French currency formats. Then print the formatted values
 * as follows:
 * <p>
 * <b>US:</b> formattedPayment
 * <p>
 * <b>India:</b> formattedPayment
 * <p>
 * <b>China:</b> formattedPayment
 * <p>
 * <b>France:</b> formattedPayment
 * 
 * @author prosannam
 * 
 * @see <a href=
 *      "https://en.wikipedia.org/wiki/Double-precision_floating-point_format">https://en.wikipedia.org/wiki/Double-precision_floating-point_format</a>
 *      <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html">https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html</a>
 *      <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-">https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-</a>
 *      <p>
 *      <b>Locale</b>
 *      <p>
 *      <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html">https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html</a>
 *      <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#Locale-java.lang.String-java.lang.String-">https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#Locale-java.lang.String-java.lang.String-</a>
 * 
 *
 */
public class JavaCurrencyFormatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double p = scanner.nextDouble();
		scanner.close();

		
		System.out.println("US: "+NumberFormat.getCurrencyInstance(Locale.US).format(p));
		System.out.println("India: "+NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(p));
		System.out.println("China: "+NumberFormat.getCurrencyInstance(Locale.CHINA).format(p));
		System.out.println("France: "+NumberFormat.getCurrencyInstance(Locale.FRANCE).format(p));

	}

}
