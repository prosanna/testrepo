/**
 * 
 */
package designPattern.examples.creational;

/**
 * <b>Abstract Factory Design Pattern</b>
 * <p>
 * Provide an interface for creating a family of related or dependent objects
 * without specifying their concrete classes.
 * <p>
 * There are plenty of examples of this design pattern used throughout the JVM.
 * The most commonly seen are around the XML packages — for example,
 * DocumentBuilderFactory, TransformerFactory, and XPathFactory. These all have
 * a special newInstance() factory method to allow our code to obtain an
 * instance of the abstract factory.
 * 
 * @author prosannam
 *
 */
public class AbstractFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory.buildCar(CarType.MINI);
		CarFactory.buildCar(CarType.MICRO);
		CarFactory.buildCar(CarType.LUXURY);

	}

}

enum CarType {
	MICRO, MINI, LUXURY
}

enum Location {
	DEFAULT, USA, INDIA
}

abstract class Car {
	private CarType model = null;
	private Location location = null;

	public Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}

	abstract void constract();

	/**
	 * @return the model
	 */
	public CarType getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(CarType model) {
		this.model = model;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

}

class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		constract();
	}

	@Override
	void constract() {
		System.out.println("Connecting to Micro Car.");

	}

}

class MiniCar extends Car {
	public MiniCar(Location location) {
		super(CarType.MINI, location);
		constract();
	}

	@Override
	void constract() {
		System.out.println("Connecting to Mini Car.");

	}
}

class LuxuryCar extends Car {
	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		constract();
	}

	@Override
	void constract() {
		System.out.println("Connecting to Luxury Car.");
	}
}

class INDIANCarFactory {

	static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case MICRO:

			car = new MicroCar(Location.INDIA);
			break;
		case MINI:

			car = new MiniCar(Location.INDIA);
			break;
		case LUXURY:

			car = new LuxuryCar(Location.INDIA);
			break;

		default:
			break;
		}

		return car;

	}
}

class USACarFactory {

	static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case MICRO:

			car = new MicroCar(Location.USA);
			break;
		case MINI:

			car = new MiniCar(Location.USA);
			break;
		case LUXURY:

			car = new LuxuryCar(Location.USA);
			break;

		default:
			break;
		}

		return car;

	}
}

class DefaultCarFactory {

	static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case MICRO:

			car = new MicroCar(Location.DEFAULT);
			break;
		case MINI:

			car = new MiniCar(Location.DEFAULT);
			break;
		case LUXURY:

			car = new LuxuryCar(Location.DEFAULT);
			break;

		default:
			break;
		}

		return car;

	}
}

class CarFactory {
	public static Car buildCar(CarType model) {
		Car car = null;
		Location location = Location.INDIA;
		switch (location) {
		case USA:
			car = USACarFactory.buildCar(model);
			break;
		case INDIA:
			car = INDIANCarFactory.buildCar(model);
			break;

		default:
			car = DefaultCarFactory.buildCar(model);
			break;
		}

		return car;
	}
}
