/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <b>Anagrams</b>
 * <p>
 * Two strings, a and b , are called anagrams if they contain all the same
 * characters in the same frequencies. For this challenge, the test is not
 * case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC,
 * and CtA.
 * 
 * @author prosanna
 *
 */
public class JavaAnagrams {

	private static int[] frequency = new int[26];

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		scanner.close();

		System.out.println(isAnagram(str1, str2));

	}

	/**
	 * Anagram check
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static boolean isAnagram(String a, String b) {

		char[] c1 = a.toLowerCase().replaceAll("[\\s]", a).toCharArray();
		char[] c2 = b.toLowerCase().replaceAll("[\\s]", b).toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		return Arrays.equals(c1, c2);

	}
	
	/**
	 * Alternative approach
	 * @param a
	 * @param b
	 * @return
	 */
	static boolean isAnagramAlter(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		for (char c : a.toCharArray()) {
			frequency[(int) c - 97]++;
		}
		for (char c : b.toCharArray()) {
			frequency[(int) c - 97]--;
		}

		boolean anagrams = true;
		for (int i : frequency) {
			if (i != 0) {
				anagrams = false;
				break;
			}
		}
		return anagrams;
	}

}
