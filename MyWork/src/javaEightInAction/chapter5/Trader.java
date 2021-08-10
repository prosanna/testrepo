/**
 * 
 */
package javaEightInAction.chapter5;

/**
 * @author prosanna
 *
 */
public class Trader {

	private final String name;
	private final String city;

	/**
	 * @param name
	 * @param city
	 */
	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

}
