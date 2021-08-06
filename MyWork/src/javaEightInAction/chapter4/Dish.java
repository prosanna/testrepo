/**
 * 
 */
package javaEightInAction.chapter4;

/**
 * @author prosanna
 *
 */
public class Dish {

	String dishName;
	int calories;

	/**
	 * @param dish
	 * @param calories
	 */
	public Dish(String name, int calories) {
		this.dishName = name;
		this.calories = calories;
	}

	/**
	 * @return the dishName
	 */
	public String getDishName() {
		return dishName;
	}

	/**
	 * @param dishName the dishName to set
	 */
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
