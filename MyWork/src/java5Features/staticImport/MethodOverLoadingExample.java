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
		/*
		 * test("prosanna",10); test("arko");
		 */
		
	DirectionEnum d =	DirectionEnum.NORTH;
	System.out.println(d.name());
	System.out.println(DirectionEnum.valueOf("SOUTH"));
	System.out.println(DirectionEnum.values());
	System.out.println(d.getValue());

	}

	/*
	 * public static void test(String a, Integer b, Integer c) {
	 * System.out.println("Print Integer: " + a + " " + b); }
	 */
	
	public static void test(String a, Integer... b) {
		System.out.println("VAR-ARGS: " + a + " " + b);
	}

	public static void test(String a, BigDecimal b) {
		System.out.println("Print BigDecimal: " + a + " " + b);
	}

	public static void test(String a, Number b) {
		System.out.println("Print Number: " + a + " " + b);
	}

	/*
	 * public static void test(String a) { System.out.println("Print String: " + a);
	 * }
	 */

}
