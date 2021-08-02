/**
 * 
 */
package hackerrank.problems.javaProb.easy.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <b>Java BigInteger</b>
 * <p>
 * In this problem, you have to add and multiply huge numbers! These numbers are
 * so big that you can't contain them in any ordinary data types like a long
 * integer.
 * 
 * @author prosanna
 * 
 * @see
 *      <p>
 *      A local variable must be initialized with a default value when declared
 *      in lambda expression or enclosing scope.
 *      <p>
 *      <code>public static int a, b = 0;//Initialize with Zero before declaring in lambda.
 *      <p>
 *      perform add = (a, b) -> System.out.println(a + b);		
 *      </code>
 *
 */
public class JavaBigInteger {

	public static BigInteger bigInt = BigInteger.ZERO;

	/**
	 * a local variable must be initialized with a default value when declared in
	 * lambda expression or enclosing scope.
	 */
	// public static BigInteger a, b = BigInteger.ZERO;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		scan.close();

		BigInteger a = new BigInteger(str1);
		BigInteger b = new BigInteger(str2);

		perform add = () -> {
			System.out.println(a.add(b));
		};

		add.action();

		perform mul = () -> {
			System.out.println(a.multiply(b));
		};

		mul.action();

	}

}

@FunctionalInterface
interface perform {
	void action();

}
