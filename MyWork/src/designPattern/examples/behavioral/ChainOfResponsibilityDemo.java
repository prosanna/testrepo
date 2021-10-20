/**
 * 
 */
package designPattern.examples.behavioral;

/**
 * <b>Chain Of Responsibility Design Pattern :</b>>
 * <p>
 * Avoid coupling the sender of a request to its receiver by giving more than
 * one object a chance to handle the request. Chain the receiving objects and
 * pass the request along the chain until an object handles it.
 * <p>
 * This pattern allows for objects to implement a common interface and for each
 * implementation to delegate on to the next one if appropriate.<b>This then
 * allows us to build a chain of implementations, where each one performs some
 * actions before or after the call to the next element in the chain.</b>
 * 
 * 
 * @see <a href=
 *      "https://www.oracle.com/java/technologies/filters.html">Usage in
 *      Java: Servlet Filters</a>
 * 
 * @author prosannam
 * @see <a href="https://www.baeldung.com/chain-of-responsibility-pattern">Chain
 *      Of Responsibility</a>
 *      <p>
 *      <b>Drawbacks :</b> 1) Mostly, it can get broken easily:
 *      <p>
 *      a) if a processor fails to call the next processor, the command gets
 *      dropped
 *      <p>
 *      b) if a processor calls the wrong processor, it can lead to a cycle
 *      <p>
 *      4) It can create deep stack traces, which can affect performance
 *      <p>
 *      5) It can lead to duplicate code across processors, increasing
 *      maintenance
 *
 */
public class ChainOfResponsibilityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface ChainOfResponsibility {
	void perform();
}

class LoggingChain {
	private ChainOfResponsibility delegate;

	public void perform() {
		System.out.println("Starting chain");
		delegate.perform();
		System.out.println("Ending chain");
	}
}
