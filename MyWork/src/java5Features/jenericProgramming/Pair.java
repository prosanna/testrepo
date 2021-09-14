/**
 * 
 */
package java5Features.jenericProgramming;

import java.util.ArrayList;

/**
 * 
 * A generic class can have more than one type variables. We can also define
 * <p>
 * <code>public class Pair @param <T,U></code>
 * <p>
 * for the first and second fields
 * 
 * @author prosannam
 * @param <T>
 *
 */
public class Pair<T> {

	private T first;
	private T second;

	public Pair() {
		first = null;
		second = null;
	}

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return this.first;
	}

	public T getSecond() {
		return this.second;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(T second) {
		this.second = second;
	}

}
