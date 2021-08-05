/**
 * 
 */
package javaEightInAction.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import javaEightInAction.Apple;

/**
 * <b>Function Descriptor</b>
 * <p>
 * The signature of the abstract method of a functional Interface is called a
 * function descriptor.
 * 
 * @author prosanna
 * @see <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html</a>
 *
 */
public class DifferentFunctionalInterfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// @formatter:off
		List<Apple> appleList = Arrays.asList(new Apple("green", 90), 
				new Apple("red", 1000),
				new Apple("green", 900),
				new Apple("green", 600)); 
// @formatter:on

		List<Integer> i = map(appleList, (Apple a) -> a.getWeight());
		for (Integer integer : i) {
			System.out.println(integer);
		}

		forEach(Arrays.asList(1, 2, 3, 4, 5, 6), (Integer a) -> System.out.println(a));

	}

	/**
	 * Example of {@link public interface Function<T, R>}
	 * 
	 * @param <T>
	 * @param <R>
	 * @param list
	 * @param f
	 * @return List<R>
	 */
	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for (T t : list) {
			result.add(f.apply(t));
		}

		return result;

	}

	/**
	 * Example of {@link public interface Consumer<T>}
	 * 
	 * @param <T>
	 * @param list
	 * @param c
	 */
	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for (T t : list) {
			c.accept(t);
		}
	}

}
