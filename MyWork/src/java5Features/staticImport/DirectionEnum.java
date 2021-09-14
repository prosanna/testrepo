/**
 * 
 */
package java5Features.staticImport;

/**
 * @author prosannam
 *
 */
public enum DirectionEnum {

	NORTH(10),SOUTH(20);

	int si;
	DirectionEnum(int i) {
		this.si=i;
	}
	public int getValue() {
		return si;

	}
}
