/**
 * 
 */
package javaEightInAction.chapter6;

import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javaEightInAction.chapter4.Dish;
import javaEightInAction.chapter4.Dish.CaloricLevel;
import javaEightInAction.chapter4.Dish.Type;

/**
 * @author prosannam
 *
 */
public class MoreExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// @formatter:off
		List<Dish> menu = Arrays.asList(new Dish("fruit",true, 300,Dish.Type.OTHER), 
										new Dish("chicken", false, 200, Dish.Type.MEAT),
										new Dish("salmon", false, 400, Dish.Type.FISH),
										new Dish("prawns", false, 400, Dish.Type.FISH),
										new Dish("pork", false, 1000, Dish.Type.MEAT),
										new Dish("mutton", false, 9000, Dish.Type.MEAT),
										new Dish("pizza", false, 500, Dish.Type.OTHER),											
										new Dish("rice", true, 800, Dish.Type.OTHER),
										new Dish("french fries", true, 800, Dish.Type.OTHER));
// @formatter:on
		Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));
		for (Entry<Type, List<Dish>> d : dishesByType.entrySet()) {
			Arrays.stream(new String[] { d.getKey().toString() })
					.flatMap(i -> d.getValue().stream().map(x -> i + " : [" + x.getDishName() + "] "))
					.forEach(System.out::print);

			System.out.println();
		}
		
		Map<Dish.CaloricLevel, List<Dish>> dishesByCaloricLevel = 
						menu.stream().collect(groupingBy(i -> {
							if (i.getCalories() <= 400)
								return CaloricLevel.DIET;
							else if (i.getCalories() <= 700)
								return CaloricLevel.NORMAL;
							else
								return CaloricLevel.FAT;
						}));
		for (Entry<Dish.CaloricLevel, List<Dish>> c : dishesByCaloricLevel.entrySet()) {
			Arrays.stream(new String[] { c.getKey().toString() })
					.flatMap(i -> c.getValue().stream().map(x -> i + " : [" + x.getDishName() + "] "))
					.forEach(System.out::print);

			System.out.println();
		}
		
		System.out.println("===============================================");
		
		Map<Type, Map<Dish.CaloricLevel, List<Dish>>> dishesByTypeAndCaloricLevel = 
				menu.stream().collect(groupingBy(Dish::getType, groupingBy(i -> {
							if (i.getCalories() <= 400)
								return CaloricLevel.DIET;
							else if (i.getCalories() <= 700)
								return CaloricLevel.NORMAL;
							else
								return CaloricLevel.FAT;
						})));
		for (Entry<Type, Map<CaloricLevel, List<Dish>>> x : dishesByTypeAndCaloricLevel.entrySet()) {
			System.out.println(x.getKey().toString()+" : "+x.getValue());
		}

	}

}
