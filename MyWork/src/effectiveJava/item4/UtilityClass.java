/**
 * 
 */
package effectiveJava.item4;

/**
 * 
 * Non instantiable utility class
 * @author prosanna
 *
 */
public class UtilityClass {
	
	//Suppress default constructor for noninstantiability
	private UtilityClass(){
		throw new AssertionError();
	}
	
	public static void getName() {
		System.out.println("Hello Prosanna!");
	}

}
