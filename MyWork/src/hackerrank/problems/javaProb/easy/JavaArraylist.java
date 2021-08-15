/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prosanna
 *
 */
public class JavaArraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<>();

		iList.add(1);
		iList.add(30);
		iList.add(74);
		iList.add(77);
		iList.add(80);

		try {
			System.out.println(iList.get(4));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ERROR!");
		}

	}

}
