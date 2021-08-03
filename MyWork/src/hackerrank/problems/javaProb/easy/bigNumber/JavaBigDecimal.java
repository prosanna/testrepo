/**
 * 
 */
package hackerrank.problems.javaProb.easy.bigNumber;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * <b>Java BigDecimal</b>
 * <p>
 * Java's BigDecimal class can handle arbitrary-precision signed decimal
 * numbers. Let's test your knowledge of them! Given an array, s , of n real
 * number strings, sort them in descending order — but wait, there's more! Each
 * number must be printed in the exact same format as it was read from stdin,
 * meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers
 * represent numerically equivalent values (e.g.,.1==0.1 ), then they must be
 * listed in the same order as they were received as input).
 * 
 * @author prosanna
 *
 */
public class JavaBigDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numberOfInput = scan.nextInt();
		String[] str = new String[numberOfInput + 2];

		for (int i = 0; i < numberOfInput; i++) {
			str[i] = scan.next();
		}
		scan.close();		
		
		for (int i = 0; i < numberOfInput; i++) {
			BigDecimal max = new BigDecimal(str[i]);
			int idx = i;
			for (int j = i+1; j < numberOfInput; j++) {
				BigDecimal curr = new BigDecimal(str[j]);
				if (curr.compareTo(max)==1) {
					max = curr;
					idx=j;
				}
			}
			
			String temp = str[i];
            str[i] = str[idx];
            str[idx] = temp;
		}

		for (int i = 0; i < numberOfInput; i++) {
			System.out.println(str[i]);
		}

		

	}

	@FunctionalInterface
	interface compareAction {
		int action();
	}

}
