/**
 * 
 */
package testMyAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * @author prosannam
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@ interface MyAnnotation{
	String stringValue() default "Default is Prosanna";
	int intvalue() default 101;
}



@MyAnnotation(stringValue = "this is main class", intvalue = 200)
public class MainClass {

	@MyAnnotation(intvalue = 100)
	public static void myMethod() {
		
	}
	

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<?> mainClass = MainClass.class;
		
		Method method = mainClass.getMethod("myMethod");
		Annotation[] anno = method.getAnnotations();
		
		for (Annotation a : anno) {
			System.out.println(a);
		}

	}

}
