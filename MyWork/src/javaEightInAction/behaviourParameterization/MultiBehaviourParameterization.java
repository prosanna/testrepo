/**
 * 
 */
package javaEightInAction.behaviourParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javaEightInAction.Apple;

/**
 * @author prosanna
 *
 */
public class MultiBehaviourParameterization {

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

		System.out.println("Pretty Print Apple Quiz : ");
		prettyPrintApple(appleList, (Apple a) -> a.getWeight() > 150 ? "heavy" : "light");
		prettyPrintApple(appleList, (Apple a) -> "green".equals(a.getColor()) ? "Yea it's Green" : a.getColor());

	}

	/**
	 * Filter Apple List asper the Behavior
	 * 
	 * @param inventory
	 * @param p
	 * @return
	 */
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {

		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}

		}

		return result;

	}

	/**
	 * Pretty Print Apple method that can be parameterized with multiple ways to
	 * generate a string output.
	 * 
	 * @param inventory
	 * @param f
	 */
	public static void prettyPrintApple(List<Apple> inventory, AppleFormatter f) {
		for (Apple apple : inventory) {
			String output = f.accept(apple);
			System.out.println(output);
		}

	}

	/**
	 * 
	 * @author prosanna
	 *
	 */
	@FunctionalInterface
	interface ApplePredicate {
		boolean test(Apple apple);
	}

	/**
	 * Apple formatter functional interface.
	 * 
	 * @author prosanna
	 *
	 */
	@FunctionalInterface
	interface AppleFormatter {
		String accept(Apple a);
	}

}
