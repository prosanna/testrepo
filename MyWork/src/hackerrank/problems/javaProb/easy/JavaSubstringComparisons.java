/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author prosannam
 *
 */
public class JavaSubstringComparisons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int k = scanner.nextInt();
		scanner.close();
		
		System.out.print(getSmallestAndLargest(s, k));

	}
	
	/**
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String[] subStr = new String[s.length()-k+1];
        
        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our array
        	subStr[i] =  s.substring(i, i + k);	
        }
        
        Arrays.sort(subStr);
        smallest = subStr[0];
        largest = subStr[subStr.length-1];
        
        return smallest + "\n" + largest;
    }
	
	private String Alternativemetho(String s, int k) {
        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;
        
        for (int i = 1; i <= s.length() - k; i++) {
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);
            	
            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            
            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        
        return smallest + "\n" + largest;

	}

}
