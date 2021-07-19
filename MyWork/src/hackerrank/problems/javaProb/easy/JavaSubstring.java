/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * @author prosannam
 *
 */
public class JavaSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int si = scanner.nextInt();
		int ei = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(str.substring(si, ei));

	}

}
