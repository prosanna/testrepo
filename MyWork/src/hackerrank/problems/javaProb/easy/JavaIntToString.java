/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * given an integer n , you have to convert it into a string.
 * 
 * @author prosanna
 *
 */
public class JavaIntToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoNotTerminate.forbidExit();

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			
			String s = String.valueOf(n);			

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}

}
