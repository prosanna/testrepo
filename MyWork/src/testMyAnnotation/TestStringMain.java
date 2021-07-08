/**
 * 
 */
package testMyAnnotation;

/**
 * @author prosannam
 *
 */
public class TestStringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("Hello");
		
		
		//"hello world!".chars().forEach(System.out::println);
		"hello world!".chars().mapToObj(i -> (char)i).forEach(System.out::println);

	}

}
