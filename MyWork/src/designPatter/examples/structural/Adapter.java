/**
 * 
 */
package designPatter.examples.structural;

/**
 * <b>Adapter Pattern :</b>
 * <p>
 * Convert the interface of an class into another interface clients expect.
 * Adapter let's classes work together that could not otherwise because of
 * incompatible interfaces.
 * <p>
 * Also known as <b>Wrapper</b>
 * 
 * @author prosannam
 *
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
