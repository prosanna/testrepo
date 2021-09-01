/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.lang.reflect.Method;

/**
 * <b>Java Generics</b>
 * <p>
 * Generic methods are a very efficient way to handle multiple datatypes using a
 * single method. This problem will test your knowledge on Java Generic methods.
 * 
 * @author prosanna
 *
 */
public class JavaGenerics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		int count = 0;

		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();

			if (name.equals("printArray"))
				count++;
		}

		if (count > 1)
			System.out.println("Method overloading is not allowed!");

	}

}

/**
 * Printer class
 * 
 * @author prosanna
 *
 */
class Printer {

	/**
	 * Generic print array method.
	 * 
	 * @param <E>
	 * @param array
	 */
	public <E> void printArray(E[] array) {
		for (E element : array) {
			System.out.println(element);
		}

	}

}
