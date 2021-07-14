/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * @author prosanna
 *
 */
public class JavaEndOfFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		while (scanner.hasNext()) {
			
			System.out.println(++counter +" "+ scanner.nextLine());
		}
		scanner.close();

	}

}
