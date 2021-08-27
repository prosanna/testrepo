/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * <b>Java List</b>
 * <p>
 * Perform INSERT/DELETE on a list from a given index.
 * 
 * @author prosanna
 *
 */
public class JavaList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner st = new Scanner(System.in);
		LinkedList<Integer> LL = new LinkedList<Integer>();
		int n = st.nextInt();
		for (int i = 0; i < n; i++) {
			int p = st.nextInt();
			LL.add(p);
		}
		int q = st.nextInt();
		while (q-- > 0) {
			st.nextLine();
			String s = st.nextLine();
			if (s.equals("Insert")) {
				int index = st.nextInt();
				int num = st.nextInt();
				LL.add(index, num);
			} else {
				int num = st.nextInt();
				LL.remove(num);
			}
		}

		LL.forEach(p -> System.out.print(p.toString() + " "));
		System.out.println("\n");
	}

	/**
	 * TODO
	 */
	public static void alternativeSol() {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Integer> numList = new LinkedList<Integer>();
		// Second line input
		for (int i = 0; i < N; i++) {
			numList.add(scan.nextInt());
		}
		// Third line input
		Map<String, List<Integer>> qryMap = new LinkedHashMap<>();
		int numQry = scan.nextInt();
		for (int i = 0; i < numQry; i++) {
			String query = scan.next();
			List<Integer> iQryL = new ArrayList<Integer>();
			int listLength = query.equals("Insert") ? 2 : 1;
			for (int j = 0; j < listLength; j++) {
				iQryL.add(scan.nextInt());
			}
			qryMap.put(query, iQryL);
		}
		scan.close();

		/* int index = query.equals("Insert")? */

		// List<Integer> numList = Arrays.asList(11, 22, 33, 44);
		for (Map.Entry<String, List<Integer>> entry : qryMap.entrySet()) {
			List<Integer> tmpL = entry.getValue();
			if (entry.getKey().equals("Insert")) {

				numList.add(tmpL.get(0), tmpL.get(1));
			} else {
				numList.remove(tmpL.get(0).intValue());
			}
		}

		numList.forEach(p -> System.out.print(p.toString() + " "));
		/* numList.forEach(System.out::print); */

	}

}
