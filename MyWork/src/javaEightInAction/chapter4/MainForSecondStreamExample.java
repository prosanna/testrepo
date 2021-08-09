/**
 * 
 */
package javaEightInAction.chapter4;

import java.util.Arrays;
import java.util.List;

/**
 * @author prosanna
 *
 */
public class MainForSecondStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// @formatter:off
		List<Dish> menu = Arrays.asList(new Dish("fruit",true, 300,Dish.Type.MEAT), 
											new Dish("chicken",false, 200,Dish.Type.MEAT), 
											new Dish("pork",false, 1000,Dish.Type.MEAT),
											new Dish("rice",true, 800,Dish.Type.OTHER));
// @formatter:on

		List<String> str = Java8UtilityForFirstStreamExample.limitedHighCaloricDishName(menu, 3);
		for (String string : str) {
			System.out.println(string);
		}

		// Stream : Internal Iteration Example
		Java8UtilityForFirstStreamExample.internalIterationExample(menu);

	}

}
