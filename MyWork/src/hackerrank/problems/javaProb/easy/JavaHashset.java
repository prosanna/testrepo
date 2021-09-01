/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <b>Java Hashset</b>
 * <p>
 * In computer science, a set is an abstract data type that can store certain
 * values, without any particular order, and no repeated values(Wikipedia).
 * {1,2,3} is an example of a set, but {1,2,2} is not a set.
 * 
 * @author prosanna
 *
 */
public class JavaHashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = scan.next();
            pair_right[i] = scan.next();
        }
        
        HashSet<String> myhash = new HashSet<String>();
        for (int i = 0; i < t; i++) {
        	myhash.add(pair_left[i]+"#"+pair_right[i]);
        	System.out.println(myhash.size());
        	
		}

	}

}
