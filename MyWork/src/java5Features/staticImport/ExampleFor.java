/**
 * 
 */
package java5Features.staticImport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <b>For loop 1 vs loop 2</b>>
 * 
 * @author prosannam
 *
 */
public class ExampleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();// Array list use RandomAccess marker interface
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);

		// for loop 1 example
		/*
		 * for (int i = 0; i < l.size(); i++) { System.out.println(l.get(i));
		 * l.remove(i); }
		 */

		int j = 0;
		/*
		 * for (Iterator iterator = l.iterator(); iterator.hasNext();) { Integer integer
		 * = (Integer) iterator.next(); System.out.println(integer);
		 * 
		 * iterator.remove();
		 * 
		 * l.remove(j); // will java.util.ConcurrentModificationException due it is
		 * changing the structure of the list. j++;
		 * 
		 * }
		 */

		/**
		 * Adv:
		 * 1 casting is not required
		 * 2 Simplified readable version of Iterator.
		 */
		for (Integer integer : l) {
			System.out.println(integer);
			l.remove(j);// java.util.ConcurrentModificationException
		}

	}

}
