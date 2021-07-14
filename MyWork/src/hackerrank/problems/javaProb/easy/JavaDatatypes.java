/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * <b>Java Datatype</b>
 * <p>
 * Java has 8 primitive data types; char, boolean, byte, short, int, long,
 * float, and double. For this exercise, we'll work with the primitives used to
 * hold integer values (byte, short, int, and long)
 * </p>
 * 
 * @see <a href=
 *      "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html</a>
 * 
 * @author prosanna
 *
 */
public class JavaDatatypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			try {

				long x = scanner.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
					System.out.println("* byte");
				if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
					System.out.println("* short");
				if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
					System.out.println("* int");
				}
				if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
					System.out.println("* long");
				}

			} catch (Exception e) {
				System.out.println(scanner.next() + " can't be fitted anywhere.");
				
			}
		}

	}

}
