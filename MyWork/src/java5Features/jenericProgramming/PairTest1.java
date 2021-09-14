/**
 * 
 */
package java5Features.jenericProgramming;

/**
 * @author prosannam
 *
 */
public class PairTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] word = { "Mary", "had", "a", "little", "lamb" };
		Pair<String> p = ArrayAlg1.minMax(word);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		
		System.out.println(ArrayAlg1.getMiddle(word));
		double middle =  ArrayAlg1.getMiddle(3.14,1729.44,0.00);
		System.out.println(middle);

	}

}

class ArrayAlg1 {
	/**
	 * 
	 * @param <T>
	 * @param a
	 * @return
	 */
	public static <T> T  getMiddle(T... a) {
		return a[a.length/2];
	}
	
	/**
	 * Example of bound type
	 * @param <T>
	 * @param a
	 * @return
	 */
	public static <T extends Comparable> T min(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		T smallest = a[0];
		for(int i=0;i<a.length;i++) {
			if(smallest.compareTo(a[i])>0)
				smallest=a[i];
		}
		
		
		return smallest;
		
	}
	
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static Pair<String> minMax(String[] a) {
		if (a == null || a.length == 0) {
			return null;

		}

		String min = a[0];
		String max = a[1];
		for (int i = 0; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) {
				min = a[i];
			}
			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}

		}

		return new Pair<String>(min, max);

	}
	
	
}
