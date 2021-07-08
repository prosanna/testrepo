/**
 * 
 */
package testMyAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @author prosannam
 *
 */
public class MyAnnotationProcessor {

	/**
	 * @param args
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
													IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> dummyClass = DummyQueryImpl.class;

		
		Method method = dummyClass.getDeclaredMethod("method1");
		Query annotation = method.getAnnotation(Query.class);

		String methodToCall = annotation.methodName();

		DummyQueryImpl dummyObj = (DummyQueryImpl) dummyClass.getDeclaredConstructor().newInstance();
		Type classs = dummyClass.getClass();		
		
		
		
		Method method2 = dummyClass.getMethod(methodToCall);
		method2.invoke(dummyObj);

	}

}
