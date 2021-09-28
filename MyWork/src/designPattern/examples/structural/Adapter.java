/**
 * 
 */
package designPattern.examples.structural;

/**
 * <b>Adapter Pattern :</b>
 * <p>
 * Convert the interface of an class into another interface clients expect.
 * Adapter let's classes work together that could not otherwise because of
 * incompatible interfaces.
 * <p>
 * Also known as <b>Wrapper</b>
 * <p>
 * JDK's collection framework offers many examples of the adapter pattern:
 * <p>
 * <code>List<String> musketeers = Arrays.asList("Athos", "Aramis", "Porthos");</code>
 * <p>
 * Here, Arrays#asList is helping us adapt an Array to a List.
 * <p>
 * The I/O framework also makes extensive use of this pattern. As an example,
 * let's consider this snippet, which is mapping an InputStream to a Reader
 * object:
 * <p>
 * <code>InputStreamReader input = new InputStreamReader(new FileInputStream("input.txt"));</code>
 * 
 * @author prosannam
 *         <p>
 *         <b>Advantages:</b>
 *         <p>
 *         1) Helps achieve reusability and flexibility.
 *         <p>
 *         2) Client class is not complicated by having to use a different
 *         interface and can use polymorphism to swap between different
 *         implementations of adapters.
 *         <p>
 *         <b>Disadvantages:</b>
 *         <p>
 *         1) All requests are forwarded, so there is a slight increase in the
 *         overhead.
 *         <p>
 *         2) Sometimes many adaptations are required along an adapter chain to
 *         reach the type which is required.
 */
public class Adapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Movable bugatti = new BugattiVeyron();
		MovableAdapter bugattiAdp = new MoveableAdapterImpl(bugatti);

		System.out.println("Bugatti Speed in MPH : " + bugatti.getSpeed());
		System.out.println("Bugatti Speed in KPH : " + bugattiAdp.getSpeed());

	}

}

interface Movable {
	// returns speed in MPH
	double getSpeed();
}

class BugattiVeyron implements Movable {

	@Override
	public double getSpeed() {
		return 268;
	}

}

interface MovableAdapter {
	// returns speed in KPH
	double getSpeed();
}

class MoveableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;

	public MoveableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHToKPH(luxuryCars.getSpeed());
	}

	private double convertMPHToKPH(double mph) {
		return mph * 1.60934;
	}
}
