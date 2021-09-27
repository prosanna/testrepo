/**
 * 
 */
package java5Features.jenericProgramming;

import java.util.*;

/**
 * @author prosannam
 *
 */
public class MultiBound<T extends I> {
	private T objRef;

	public MultiBound(T obj) {
		this.objRef = obj;
	}
	
	public void doMultiTesting() {
		this.objRef.displayCode();
	}
	Locale aLocale = new Locale.Builder().setLanguage("sr").setScript("Latn").setRegion("RS").build();

}
