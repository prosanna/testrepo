/**
 * 
 */
package designPattern.examples.structural;

import java.io.BufferedReader;

/**
 * <b>Decorator Design pattern</b>
 * <p>
 * Attach additional responsibilities to an object dynamically. Decorator
 * provides a flexible alternative for extending functionality.
 * <p>
 * Also known as <b>Wrapper</b>
 * <p>
 * <b>Usage in Java</b>
 * <p>
 * {@link BufferedReader}
 * 
 * @author prosannam
 * @see <a href=
 *      "https://www.baeldung.com/java-decorator-pattern">https://www.baeldung.com/java-decorator-pattern</a>
 *
 */
public class Decorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ChristmasTree cTree1 = new Garland(new ChristmasTreeImpl());
		System.out.println(cTree1.decorate());

		ChristmasTree cTree2 = new BubbleLights(new Garland(new ChristmasTreeImpl()));
		System.out.println(cTree2.decorate());

	}

}

interface ChristmasTree {
	String decorate();
}

class ChristmasTreeImpl implements ChristmasTree {

	@Override
	public String decorate() {
		return "Christmas tree";

	}

}

abstract class TreeDecorator implements ChristmasTree {

	private ChristmasTree tree;

	public TreeDecorator(ChristmasTree tree) {
		this.tree = tree;
	}

	@Override
	public String decorate() {
		return tree.decorate();
	}

}

class Garland extends TreeDecorator {

	public Garland(ChristmasTree tree) {
		super(tree);
	}

	public String decorate() {
		return super.decorate() + decorateWithGarland();
	}

	private String decorateWithGarland() {
		return " with Garland";
	}
}

class BubbleLights extends TreeDecorator {

	public BubbleLights(ChristmasTree tree) {
		super(tree);
	}

	public String decorate() {
		return super.decorate() + decorateWithBubbleLights();
	}

	private String decorateWithBubbleLights() {
		return " with Bubble Lights";
	}
}
