/**
 * 
 */
package java5Features.staticImport;

/**
 * @author prosannam
 *
 */
public class TestMyCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(DefaultBOJTypeDaily.ST.getValue());
		System.out.println(InstrumentTypeCategoryIDMapping.valueOf("SI").getValue(null));
		System.out.println(InstrumentTypeCategoryIDMapping.isValidInstrumentType("GB"));

	}

}
