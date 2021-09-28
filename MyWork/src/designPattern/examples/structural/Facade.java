/**
 * 
 */
package designPattern.examples.structural;

/**
 * <b>Facade Design Pattern :</b>
 * <p>
 * Provide an unified interface to a set of interfaces in a subsystem. Facade
 * defines a higher level interface that makes the subsystem easier to use.
 * <p>
 * <b>From Baeldung</b>
 * <p>
 * <b>Advantages :</b>
 * <p>
 * 1) A facade encapsulates a complex subsystem behind a simple interface. It
 * hides much of the complexity and makes the subsystem easy to use.
 * <p>
 * 2) Besides a much simpler interface, there's one more benefit of using this
 * design pattern.<b>It decouples a client implementation from the complex
 * subsystem.</b> Thanks to this, we can make changes to the existing subsystem
 * and don't affect a client.
 * <p>
 * <b>Drawbacks :</b>
 * <p>
 * 1) The facade pattern doesn't force us to unwanted tradeoffs, because it only
 * adds additional layers of abstraction.
 * <p>
 * 2) Sometimes the pattern can be overused in simple scenarios, which will lead
 * to redundant implementations.
 * 
 * @author prosannam
 *
 */
public class Facade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
