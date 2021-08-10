/**
 * 
 */
package javaEightInAction.chapter5;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

import javaEightInAction.chapter4.Dish;

/**
 * @author prosanna
 *
 */
public class WorkingWithStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// @formatter:off
				List<Dish> menu = Arrays.asList(new Dish("fruit",true, 300,Dish.Type.MEAT), 
													new Dish("chicken",false, 200,Dish.Type.MEAT),
													new Dish("salmon",false, 400,Dish.Type.FISH),
													new Dish("pork",false, 1000,Dish.Type.MEAT),
													new Dish("mutton",false, 9000,Dish.Type.MEAT),
													new Dish("pizza",false, 500,Dish.Type.MEAT),													
													new Dish("rice",true, 800,Dish.Type.OTHER));
		// @formatter:on

		/**
		 * Filtering with a predicate.
		 */
		List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVagetarian).collect(toList());

		for (Dish dish : vegetarianMenu) {
			System.out.println(dish.getDishName());
		}

		/**
		 * Filtering Unique elements with Stream.distinct() method
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

		/**
		 * Truncating a Stream with stream.limit(n) method
		 */
		List<Dish> dishes = menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(toList());
		for (Dish dish : dishes) {
			System.out.println(dish.getDishName());
		}
	}

}
