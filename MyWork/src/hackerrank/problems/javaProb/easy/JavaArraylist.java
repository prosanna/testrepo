/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author prosanna
 *
 */
public class JavaArraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int noOfLines = scan.nextInt();
		List[] l = new ArrayList[noOfLines];

		for (int j = 0; j < l.length; j++) {
			int noOfDigits = scan.nextInt();
			List l2 = new ArrayList();
			// l2.add(j + 1);
			for (int k = 0; k < noOfDigits; k++) {
				l2.add(scan.nextInt());
			}

			l[j] = l2;
		}

		int noOfQueries = scan.nextInt();

		for (int i = 1; i <= noOfQueries; i++) {
			int x, y;
			x = scan.nextInt();
			y = scan.nextInt();

			try {
				System.out.println(l[x - 1].get(y - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}

		}

		Arrays.asList(l).stream().forEach(System.out::println);

		/*
		 * List<Integer> iList = new ArrayList<>();
		 * 
		 * iList.add(1); iList.add(30); iList.add(74); iList.add(77); iList.add(80);
		 * 
		 * try { System.out.println(iList.get(4)); } catch (IndexOutOfBoundsException e)
		 * { System.out.println("ERROR!"); }
		 */

	}

}
