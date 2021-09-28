/**
 * 
 */
package designPattern.examples.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * @author prosannam
 *
 */
public class ReflectionDesrtoySingleton {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// This line will destroy the singleton pattern
				constructor.setAccessible(true);

				instance2 = (Singleton) constructor.newInstance();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
