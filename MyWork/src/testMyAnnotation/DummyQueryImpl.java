/**
 * 
 */
package testMyAnnotation;

/**
 * @author prosannam
 *
 */
@Query(methodName = "method1", type = DummyQueryImpl.class)
public class DummyQueryImpl {

	@Query(methodName = "method2", type = DummyQueryImpl.class)
	public void method1() {
		System.out.println("I am method 1..");
	}
	
	public void method2() {
		System.out.println("Hello Prosanna");
	}
}
