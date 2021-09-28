/**
 * 
 */
package designPattern.examples.creational;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Prototype Design Pattern</b>
 * <p>
 * Specify the kind of objects to create using a prototypical instance, and
 * create new objects by copying this prototype.
 * <p>
 * Example is the java.util.Date class. Notably, this overrides the
 * Object.clone() method to copy across an additional transient field as well.
 * 
 * @author prosannam
 *
 */
public class Prototype {

	public static void main(String[] args) {
		colorStore.getColor("blue").addColor();
		colorStore.getColor("black").addColor();
		colorStore.getColor("black").addColor();
		colorStore.getColor("blue").addColor();

	}
}

abstract class Color implements Cloneable {

	protected String colorName;

	abstract void addColor();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}

class blueColor extends Color {

	public blueColor() {
		this.colorName = "blue";
	}

	@Override
	void addColor() {
		System.out.println("This is blue color.");

	}

}

class blackColor extends Color {

	public blackColor() {
		this.colorName = "black";
	}

	@Override
	void addColor() {
		System.out.println("This is black color.");
	}
}

class colorStore {
	private static Map<String, Color> mapColor = new HashMap<>();
	static {
		mapColor.put("blue", new blueColor());
		mapColor.put("black", new blackColor());
	}

	public static Color getColor(String color) {
		return mapColor.get(color);

	}
}
