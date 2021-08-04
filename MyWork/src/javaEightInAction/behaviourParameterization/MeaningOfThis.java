/**
 * 
 */
package javaEightInAction.behaviourParameterization;

/**
 * <b>Anonymous class puzzler</b>
 * <p>
 * What will be the output : 4, 5, 6 or 42?
 * 
 * @author prosanna
 *
 */
public class MeaningOfThis {

	public final int value = 4;

	public void doIt() {
		int value = 6;
		Runnable r = new Runnable() {
			public final int value = 5;

			@Override
			public void run() {
				int value = 10;
				System.out.println(this.value);
			}
		};
		r.run();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MeaningOfThis m = new MeaningOfThis();
		m.doIt();

	}

}
