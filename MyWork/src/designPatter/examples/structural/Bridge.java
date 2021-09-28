/**
 * 
 */
package designPatter.examples.structural;

/**
 * <b>Bridge Pattern</b>
 * <p>
 * Decouple an abstraction from it's implementation so that two can vary
 * independently.
 * <p>
 * Also known as <b>Handle/Body</b>.
 * <p>
 * <b>Usage in Java</b>
 * <p>
 * The JDBC API is a set of standard interfaces such as Driver, Connection, and
 * ResultSet, to name a few. This enables different database vendors to have
 * their separate implementations.
 * <p>
 * For example, to create a connection to a database, we'd say:
 * <p>
 * <code>Connection connection = DriverManager.getConnection(url);</code>
 * <p>
 * Here, url is a String that can represent any database vendor. As an example,
 * for Oracle, we have:
 * <p>
 * <code>jdbc:oracle:thin:@Host:Port:SID</code>
 * <p>
 * <code>jdbc:oracle:thin:@172.16.29.123:1521:p11gr24</code>
 * <p>
 * And for MySQL:
 * <p>
 * <code>String url = "jdbc:mysql://localhost/demo";</code>
 * 
 * @author prosannam
 *
 */
public class Bridge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle v1= new Car(new Produce(), new Assemble());
		v1.manufacture();
		Vehicle v2 = new Bike(new Produce(), new Assemble());
		v2.manufacture();

	}

}

abstract class Vehicle {
	protected Workshop workShop1;
	protected Workshop workShop2;

	protected Vehicle(Workshop workShop1, Workshop workShop2) {
		this.workShop1 = workShop1;
		this.workShop2 = workShop2;
	}

	abstract public void manufacture();

}

//Refine abstraction 1 in bridge pattern
class Car extends Vehicle {
	public Car(Workshop workShop1, Workshop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Car ");
		workShop1.work();
		workShop2.work();
	}
}

//Refine abstraction 2 in bridge pattern
class Bike extends Vehicle {
	public Bike(Workshop workShop1, Workshop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		workShop1.work();
		workShop2.work();
	}
}

interface Workshop {
	abstract public void work();
}

class Produce implements Workshop {

	@Override
	public void work() {
		System.out.print("Produced");

	}

}

class Assemble implements Workshop {

	@Override
	public void work() {
		System.out.print(" And");
		System.out.println(" Assembled.");

	}

}
