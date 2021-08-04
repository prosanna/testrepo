/**
 * 
 */
package javaEightInAction.behaviourParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javaEightInAction.Apple;

/**
 * <b>Abstraction Over List Type</b>
 * 
 * @author prosanna
 *
 */
public class AbstractionOverListType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");

		// @formatter:off
		List<Apple> appleList = Arrays.asList(new Apple("green", 90), 
												new Apple("red", 1000), 
												new Apple("green", 900),
												new Apple("green", 600));
		// @formatter:on

		List<Apple> weightyAppleList = filterApples(appleList, (Apple a) -> a.getWeight() > 150);
		for (Apple apple : weightyAppleList) {
			System.out.println("Weighty Apple : " + apple.getColor() + " " + apple.getWeight());
		}
		List<Apple> greenAppleList = filterApples(appleList, (Apple a) -> "green".equals(a.getColor()));

		for (Apple apple : greenAppleList) {
			System.out.println("Green Apple : " + apple.getColor() + " " + apple.getWeight());
		}

	}

	/**
	 * Abstract filter implementation.
	 * 
	 * @param <T>
	 * @param list
	 * @param p
	 * @return
	 */
	public static <T> List<T> filterApples(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

}
