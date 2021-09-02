/**
 * 
 */
package hackerrank.problems.javaProb.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

/**
 * <b>Java Dequeue</b>
 * <p>
 * In computer science, a double-ended queue (dequeue, often abbreviated to
 * deque, pronounced deck) is an abstract data type that generalizes a queue,
 * for which elements can be added to or removed from either the front (head) or
 * back (tail).
 * 
 * Deque interfaces can be implemented using various types of collections such
 * as LinkedList or ArrayDeque classes. For example, deque can be declared as:
 * <p>
 * <code>
 * Deque deque = new LinkedList<>();
 * or
 * Deque deque = new ArrayDeque<>();
 * </code>
 * 
 * @author prosanna
 * @see <a href=
 *      "https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html">https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html</a>
 *
 */
public class JavaDequeue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		int n = scan.nextInt();
		int m = scan.nextInt();
		int ans = 0, distinct = 0;

		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			deque.addLast(num);
			if (hashmap.get(num) == null)
				hashmap.put(num, 0);

			hashmap.put(num, hashmap.get(num) + 1);

			if (hashmap.get(num) == 1)
				distinct++;

			if (deque.size() == m + 1) {
				int ele = deque.removeFirst();
				hashmap.put(ele, hashmap.get(ele) - 1);
				if (hashmap.get(ele) == 0)
					distinct--;
			}
			if (deque.size() == m) {
				if (distinct > ans)
					ans = distinct;
			}

		}
		System.out.println(ans);
		scan.close();

	}

}
