/**
 * 
 */
package javaEightInAction;

/**
 * @author prosanna
 *
 */
public class BehaviourParameterization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 
	 * @author prosanna
	 *
	 */
	@FunctionalInterface
	interface ApplePredicate{
		boolean test (Apple apple);
	}

}
