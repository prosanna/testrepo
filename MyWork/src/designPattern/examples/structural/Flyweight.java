/**
 * 
 */
package designPattern.examples.structural;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Flyweight Design Pattern :</b>
 * <p>
 * Use sharing to support large numbers of fine-grained objects efficiently.
 * <p>
 * <b>The flyweight pattern takes the weight, or memory footprint, off of our
 * objects by recycling them.</b>In other words, if we have immutable objects
 * that can share state, as per this pattern, we can cache them to improve
 * system performance.
 * <p>
 * <b>Usage in Java</b>
 * <p>
 * {@link Number}
 * <p>
 * {@link IntegerCache}
 * <p>
 * For example, {@link Integer} has a static class, IntegerCache, which helps
 * its valueOf method to always cache values in the range -128 to 127:
 * 
 * @author prosannam
 * @see <a href=
 *      "https://www.baeldung.com/java-flyweight">https://www.baeldung.com/java-flyweight</a>
 *      <b>Advantage:</b>
 *      <p>
 *      1) The goal of the flyweight pattern is to reduce memory usage by
 *      sharing as much data as possible.
 *      <p>
 *      2) Many modern applications use caches to improve response time. The
 *      flyweight pattern is similar to the core concept of a cache and can fit
 *      this purpose well.
 *
 */
public class Flyweight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Color, Vehicle> vehiclesCache = new HashMap<>();

		vehiclesCache.computeIfPresent(null, null);
	}

}

interface VehicleF {
	public void start();

	public void stop();

	public Color getColor();
}

class Ferrari implements VehicleF {

	private Engine engine;
	private Color color;

	public Ferrari(Engine engine, Color color) {
		this.engine = engine;
		this.color = color;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Color {

}

class Engine {

}
