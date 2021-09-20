/**
 * 
 */
package java5Features.jenericProgramming;

/**
 * @author prosannam
 *
 */
public class MultiBound<T extends I> {
	private T objRef;

	public MultiBound(T obj) {
		this.objRef = obj;
	}
	
	public void doMultiTesting() {
		this.objRef.displayCode();
	}

}
