/**
 * 
 */
package javaEightInAction.chapter4;

/**
 * @author prosanna
 *
 */
public class Dish {

	private final String dishName;
	private final boolean vagetarian;
	private final int calories;
	private final Type type;

	/**
	 * Constructor
	 * 
	 * @param dishName
	 * @param vagetarian
	 * @param calories
	 * @param type
	 */
	public Dish(String dishName, boolean vagetarian, int calories, Type type) {
		this.dishName = dishName;
		this.vagetarian = vagetarian;
		this.calories = calories;
		this.type = type;
	}

	/**
	 * @return the dishName
	 */
	public String getDishName() {
		return dishName;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @return the vagetarian
	 */
	public boolean isVagetarian() {
		return vagetarian;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	};

}
