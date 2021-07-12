/**
 * read input from stdin (standard input) and write output to stdout (standard output).
 */
package hackerrank.problems.javaProb.easy;

import java.util.Scanner;

/**
 * One popular way to read input from stdin is by using the Scanner class and
 * specifying the Input Stream as System.in. 
 * 
 * Alternatively, we can use the BufferedReader class.
 * 
 * @author prosanna
 *
 */
public class JavaStdinAndStdoutI {

	/**
	 * Task :  read  integers from stdin and then print them to stdout.
	 * Each integer must be printed on a new line.
	 * @param args
	 */
	public static void main(String[] args) {

		//scannerExample();
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void scannerExample(){
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.next();
		int myInt = scanner.nextInt();
		scanner.close();
		
		System.out.println("myString is: " + myString);
		System.out.println("myInt is: " + myInt);
	}

}
