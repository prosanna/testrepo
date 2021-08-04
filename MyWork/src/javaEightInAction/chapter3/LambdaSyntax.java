/**
 * 
 */
package javaEightInAction.chapter3;

/**
 * <b>Lambda Syntax</b>
 * 
 * @author prosanna
 * 
 * @see <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html</a>
 *
 */
public class LambdaSyntax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test s = () -> "Prosanna";
		System.out.println(s.check());

	}

	@FunctionalInterface
	interface test {
		String check();
	}
}
