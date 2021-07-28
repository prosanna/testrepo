/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <b>Java Primality Test</b>
 * <p>
 * A prime number is a natural number greater than whose only positive divisors
 * are and itself. For example, the first six prime numbers are 2, 3, 5, 7, 11,
 * and 13.
 * <p>
 * Given a large integer, n use the Java BigInteger class
 * 
 * @author prosanna
 * 
 * @see <a href=
 *      "https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29">https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29</a>
 *
 */
public class JavaPrimalityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger n = new BigInteger(s.nextLine());
		s.close();
		System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");

	}

}
