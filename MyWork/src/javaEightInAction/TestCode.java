/**
 * 
 */
package javaEightInAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Prosanna
 *
 */
public class TestCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");

		List<Apple> appleList = Arrays.asList(new Apple("green", 90), 
												new Apple("red", 1000),
												new Apple("green", 900),
												new Apple("green", 600));

		//List<Apple> sortedApple = filterApple(appleList, TestCode::isHeavyApple);
		
		//List<Apple> sortedApple = filterApple(appleList, (Apple a) -> "green".equals(a.getColor()));
		
		List<Apple> sortedApple = filterApple(appleList, (Apple a) -> a.getWeight()<100);
		
		
		for (Apple apple : sortedApple) {
			System.out.println(apple.getColor() + " " + apple.getWeight());
		}

	}

	public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;

	}

	/*
	 * private static boolean isHeavyApple(Apple apple) { return apple.getWeight() >
	 * 150;
	 * 
	 * }
	 * 
	 * private static boolean isGreenApple(Apple apple) { return
	 * "green".equals(apple.getColor());
	 * 
	 * }
	 */

}
