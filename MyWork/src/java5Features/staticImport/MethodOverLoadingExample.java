/**
 * 
 */
package java5Features.staticImport;

import java.math.BigDecimal;

/**
 * @author prosannam
 *
 */
public class MethodOverLoadingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test("prosanna", 90.07);
		test("arko");

	}

	public static void test(String a, Integer b) {
		System.out.println("Print Integer: " + a + " " + b);
	}

	public static void test(String a, BigDecimal b) {
		System.out.println("Print BigDecimal: " + a + " " + b);
	}

	public static void test(String a, Number b) {
		System.out.println("Print Number: " + a + " " + b);
	}

	public static void test(String a) {
		System.out.println("Print String: " + a);
	}

}
