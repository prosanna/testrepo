/**
 * 
 */
package designPatter.examples.creational.singleton;

/**
 * <b>Singleton Pattern</b>
 * <p>
 * Ensure a class only has one instance, and provide a global point of access to
 * it.
 * 
 * @author prosannam
 *
 */
public class Singleton {

	private static Singleton instance;

	// private constructor to force use of getInstance() to create singleton object.
	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;

	}

}

/**
 * Class Singleton is not thread safe.
 * 
 * @author prosannam
 *         <p>
 *         The main disadvantage of this is method is that using synchronized
 *         every time while creating the singleton object is expensive and may
 *         decrease the performance of your program. However if performance of
 *         getInstance() is not critical for your application this method
 *         provides a clean and simple solution.
 *
 */
class Singleton1 {
	private static Singleton1 instance;

	// private constructor to force use of getInstance() to create singleton object.
	private Singleton1() {

	}

	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}

/**
 * To avoid access reflection to destroy singleton property.
 * 
 * @author prosannam
 *
 */
enum Singleton2 {
	INSTANCE
}

/**
 * <b>Lazy initialization with Double check locking :</b>
 * <p>
 * In this mechanism, we overcome the overhead problem of synchronized code. In
 * this method, getInstance is not synchronized but the block which creates
 * instance is synchronized so that minimum number of threads have to wait and
 * that’s only for first time.
 * 
 * @author prosannam
 *
 */
class LazySingleton {
	private static LazySingleton instance;

	// private constructor to force use of getInstance() to create singleton object.
	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			//synchronized block to remove overhead
			synchronized (LazySingleton.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new LazySingleton();
				}
			}
		}

		return instance;

	}
}
