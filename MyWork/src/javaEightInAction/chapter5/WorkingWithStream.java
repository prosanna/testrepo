/**
 * 
 */
package javaEightInAction.chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

import javaEightInAction.chapter4.Dish;
import javaEightInAction.chapter4.Dish.Type;

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
				List<Dish> menu = Arrays.asList(new Dish("fruit",true, 300,Dish.Type.OTHER), 
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
		System.out.println();

		/**
		 * Filtering Unique elements with Stream.distinct() method
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

		System.out.println();
		/**
		 * Truncating a Stream with stream.limit(n) method
		 */
		List<Dish> dishes = menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(toList());
		for (Dish dish : dishes) {
			System.out.println(dish.getDishName());
		}
		System.out.println();
		/**
		 * Skipping elements with stream.skip() method
		 */
		List<Dish> skipDish = menu.stream().filter(d -> d.getCalories() > 300).skip(2).collect(toList());
		for (Dish dish : skipDish) {
			System.out.println(dish.getDishName());
		}
		System.out.println();
		/**
		 * Quiz : Filter first two meat dishes.
		 */
		List<Dish> meatDishes = menu.stream().filter(d -> d.getType() == Type.MEAT).limit(2).collect(toList());
		for (Dish dish : meatDishes) {
			System.out.println(dish.getDishName());
		}

		System.out.println();
		// Stream Mapping
		/**
		 * Applying a function to each element of a stream
		 */
		List<String> dishNames = menu.stream().map(Dish::getDishName).collect(toList());
		for (String string : dishNames) {
			System.out.println("Dish Names : " + string);
		}
		/**
		 * More Method reference and chaining another map
		 */
		List<Integer> dishNamesLengths = menu.stream().map(Dish::getDishName).map(String::length).collect(toList());
		for (Integer i : dishNamesLengths) {
			System.out.println("Dish Names Lengths : " + i.intValue());
		}
		/**
		 * Flattening stream : Use of Flat Map
		 */
		String[] arrOfWords = { "Hello", "World" };
		List<String> uniqueCharacters = Arrays.asList(arrOfWords).stream().map(word -> word.split(""))
				.flatMap(Arrays::stream).distinct().collect(toList());
		for (String string : uniqueCharacters) {
			System.out.println(string);
		}
		/**
		 * Quiz : Given a list of numbers [1,2,3,4,5] return a list of square of each
		 * number [1,4,9,16,25]
		 */
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squrOfNumbers2 = numbers2.stream().map(num->num*num).collect(toList());
		for (Integer integer : squrOfNumbers2) {
			System.out.println(integer.intValue());
		}

	}

}
