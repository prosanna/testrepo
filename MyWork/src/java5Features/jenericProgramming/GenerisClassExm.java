package java5Features.jenericProgramming;

import java.util.ArrayList;
import java.util.List;
/**
 * javap to see raw type.
 * @author prosannam
 *
 * @param <T>
 * @param <V>
 */
public class  GenerisClassExm<T,V> {

	
	
	
	public static void addNumbers(List<? super Integer> list) {
	    for (int i = 1; i <= 10; i++) {
	        list.add(i);
	    }
	}
	
	
	public static void main(String[] args) {
		List<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		
		GenerisClassExm.addNumbers(i) ;
		
	}
}
