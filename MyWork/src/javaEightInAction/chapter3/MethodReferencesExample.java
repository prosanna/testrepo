/**
 * 
 */
package javaEightInAction.chapter3;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;

import javaEightInAction.Apple;

/**
 * <b>Method References</b>
 * <p>
 * Method references let you reuse existing method definitions and pass them
 * just like lambdas.
 * 
 * 
 * @author prosanna
 * @see <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html</a>
 *
 */
public class MethodReferencesExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// @formatter:off
		List<Apple> appleList = Arrays.asList(new Apple("green", 90), 
				new Apple("red", 1000),
				new Apple("green", 900),
				new Apple("green", 600),
				new Apple("red", 600)); 
// @formatter:on
		appleList.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
		
		for (Apple apple : appleList) {
			System.out.println(apple.getColor()+" "+apple.getWeight());
		}

	}

}
