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
		test1 t1 = ()->{};
		test2 t2 = () -> "Prosanna";//Expression
		test2 s = () -> {return "Prosanna";};//explicit return statement.
		test3 t3 = (Integer a) -> {return "Prosanna" + a;};// return is a Control-flow statement.
		System.out.println(s.check());
		System.out.println(t3.check(Integer.valueOf(69)));

	}

	@FunctionalInterface
	interface test1 {
		void check();
	}

	@FunctionalInterface
	interface test2 {
		String check();
	}

	@FunctionalInterface
	interface test3 {
		String check(Integer i);
	}
}
