/**
 * Read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below
 * 
 * <pre>Output Format
 * There are three lines of output:
 *  On the first line, print String: followed by the unaltered String read from stdin.
 *  On the second line, print Double: followed by the unaltered double read from stdin.
 *  On the third line, print Int: followed by the unaltered integer read from stdin.
 *  To make the problem easier, a portion of the code is already provided in the editor.
 *  
 *  Note: If you use the nextLine() method immediately following the nextInt() method,
 *  recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still
 *  queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).</pre>
 *   
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * @author prosannam
 *
 */
public class JavaStdinAndStdoutII {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * Note: If you use the nextLine() method immediately following the nextInt()
	 * method, recall that nextInt() reads integer tokens; because of this, the last
	 * newline character for that line of integer input is still queued in the input
	 * buffer and the next nextLine() will be reading the remainder of the integer
	 * line (which is empty).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i = scanner.nextInt();
		double d = scanner.nextDouble();
		scanner.nextLine();
		String str = scanner.nextLine();
		scanner.close();

		System.out.println("String: " + str);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

	}

}
