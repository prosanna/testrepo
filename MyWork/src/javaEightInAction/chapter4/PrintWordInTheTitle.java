/**
 * 
 */
package javaEightInAction.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * <p>
 * Stream can be consumed only once.
 * 
 * @author prosanna
 *
 */
public class PrintWordInTheTitle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> title = Arrays.asList("Java8", "In", "Action");
		Stream<String> s = title.stream();
		s.forEach(System.out::println);
		s.forEach(System.out::println);// Will throw exception : "stream has already been operated upon or closed"

	}

}
