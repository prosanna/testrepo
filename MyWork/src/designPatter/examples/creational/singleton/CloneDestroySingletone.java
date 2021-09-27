/**
 * 
 */
package designPatter.examples.creational.singleton;

/**
 * @author prosannam
 *
 */
public class CloneDestroySingletone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			SingletonCloneable instance1 = SingletonCloneable.instance;
			SingletonCloneable instance2 = (SingletonCloneable) instance1.clone();
			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class SuperClass implements Cloneable {
	int i = 10;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class SingletonCloneable extends SuperClass {
	public static SingletonCloneable instance;

	private SingletonCloneable() {

	}

	static {
		instance = new SingletonCloneable();
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException();
	}

}
