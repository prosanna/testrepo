/**
 * 
 */
package javaEightInAction.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * First stream example
 * 
 * @author prosanna
 *
 */
public class FirstStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// @formatter:off
		List<Dish> menu = Arrays.asList(new Dish("dish1", 300), 
											new Dish("dish2", 200), 
											new Dish("dish3", 1000),
											new Dish("dish4", 800));
// @formatter:on

		// Before (Java 7 implementation):
		java7Impl(menu);
		// After (Java 8 implementation):
		List<String> menuNameList = Java8UtilityForFirstStreamExample.java8Impl(menu);
		System.out.println();
		System.out.println("From Java 8 Impl:");
		for (String string : menuNameList) {
			System.out.println(string);
		}

	}

	/**
	 * <b>Before (java 7 implementation):</b>
	 * 
	 * @param menu
	 */
	public static void java7Impl(List<Dish> menu) {
		// Filter the elements using an accumulator.
		List<Dish> lowCaloricDishes = new ArrayList<>();
		for (Dish dish : menu) {
			if (dish.getCalories() < 400) {
				lowCaloricDishes.add(dish);
			}
		}

		// Sort the dishes with an anonymous class.
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {

			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});

		//Process the sorted list to select the names of dishes.
		List<String> lowCaloricDishesName = new ArrayList<>();
		for (Dish dish : lowCaloricDishes) {
			lowCaloricDishesName.add(dish.getDishName());
		}
		System.out.println("From Java 7 Impl:");
		for (String string : lowCaloricDishesName) {
			System.out.println(string);
		}
	}

}
