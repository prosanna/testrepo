/**
 * 
 */
package javaEightInAction.javabrains;

/**
 * 
 * <p>
 * Inner class and Lambda Expression looks similar but lambda is not the
 * shortcut to inner class. Both are different.
 * 
 * @author prosanna
 *
 */
public class Greeter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Greeting g = new Greeting() {

			@Override
			public void greet() {
				System.out.println("Hello Prosanna! From Inner Class.");

			}
		};

		g.greet();

		Greeting greetProsanna = () -> System.out.println("Hello Prosanna! From Lambda Expression.");

		greetProsanna.greet();

	}

}
