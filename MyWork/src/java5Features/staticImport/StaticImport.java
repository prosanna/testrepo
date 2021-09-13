/**
 * 
 */
package java5Features.staticImport;

import static java5Features.staticImport.Constant.*;
import static java5Features.staticImport.Constant1.*;

/**
 * @author prosannam
 *
 */
public class StaticImport {
	/*
	 * public static void test() { System.out.println("Hello Arko"); }// High Priority
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(NAME + " " + ADDRESS + " " + MOBILE_NO);
		Constant1.test();
		

	}

}
