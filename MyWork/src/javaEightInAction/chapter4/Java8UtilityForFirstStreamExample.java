/**
 * 
 */
package javaEightInAction.chapter4;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.List;

/**
 * <b>After (Java 8 implementation):</b>
 * <p>
 * Java 7 Impl we use a "garbage variable" , lowCaloricDishes. It's only purpose
 * is to act as an intermediate throwaway container. In java 8 this
 * implementation detail is pushed into the library where it belong.
 * 
 * @author prosanna
 *
 */
public class Java8UtilityForFirstStreamExample {

	/**
	 * 
	 * @param menu
	 */
	public static List<String> java8Impl(List<Dish> menu) {
		// @formatter:off
		List<String> lowCaloricDishesName = 
				menu.stream()
					.filter(d -> d.getCalories() < 400) // Select Dishes that are below 400 calories.
					.sorted(comparing(Dish::getCalories)) // Sort them by calories.
					.map(Dish::getDishName) // Extract the names of these dishes. 
					.collect(toList()); // Store all the names in a list.
		return lowCaloricDishesName; 
// @formatter:on

	}

	/**
	 * Java 8 implementation using multicore architecture.
	 * 
	 * @param menu
	 * @return
	 */
	public static List<String> java8ParallelProcessingImpl(List<Dish> menu) {
		// @formatter:off
		List<String> lowCaloricDishesName = 
				menu.parallelStream()
					.filter(d -> d.getCalories() < 400) // Select Dishes that are below 400 calories.
					.sorted(comparing(Dish::getCalories)) // Sort them by calories.
					.map(Dish::getDishName) // Extract the names of these dishes. 
					.collect(toList()); // Store all the names in a list.
		return lowCaloricDishesName; 
// @formatter:on

	}

}
