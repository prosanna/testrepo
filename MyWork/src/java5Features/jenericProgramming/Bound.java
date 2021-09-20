/**
 * 
 */
package java5Features.jenericProgramming;

/**
 * @author prosannam
 *
 */
public class Bound<T extends A> {
	private T objRef;

	/**
	 * Constructor
	 * 
	 * @param obj
	 */
	public Bound(T obj) {
		this.objRef = obj;
	}

	public void doTest() {
		this.objRef.displayCode();
	}

}
