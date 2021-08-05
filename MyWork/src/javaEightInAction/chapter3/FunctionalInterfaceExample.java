/**
 * 
 */
package javaEightInAction.chapter3;

/**
 * <b>Functional Interface</b>
 * <p>
 * Functional Interface is an interface that specifies one abstract method.
 * 
 * @author prosanna
 *
 */
public class FunctionalInterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("Prosanna 1"); // Using Lambda
		/**
		 * Using Anonymous class
		 */
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Prosanna 2");

			}
		};

		process(r1);
		process(r2);
		process(() -> System.out.println("Prosanna 3"));// lambda passed directly

	}

	public static void process(Runnable r) {
		r.run();
	}

}
