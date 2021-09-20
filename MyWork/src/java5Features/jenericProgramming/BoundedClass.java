/**
 * 
 */
package java5Features.jenericProgramming;

/**
 * @author prosannam
 *
 */
public class BoundedClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bound<C> objC = new Bound<C>(new C());
		objC.doTest();
		Bound<A> objA = new Bound<A>(new A());
		objA.doTest();
		Bound<B> objB = new Bound<B>(new B());
		objB.doTest();
		
		MultiBound<I> obj = new MultiBound<I>(new Imp());
		obj.doMultiTesting();

	}

}
