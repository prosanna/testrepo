/**
 * 
 */
package designPattern.examples.creational;

/**
 * <b>Builder Design Pattern.</b>
 * <p>
 * Separate the construction of a complex object from it's representation so
 * that the same construction process can create different representation.
 * 
 * @author prosannam
 *
 */
public class Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HouseBuilder buildIgloo = new IglooHouseBuilder();
		CivilEngineer builder = new CivilEngineer(buildIgloo);
		
		House house = builder.constructHouse();
		 
        System.out.println("Builder constructed: "+ house);

	}

}

interface HousePlan {
	public void setBasement(String basement);

	public void setStructure(String structure);

	public void setRoof(String roof);

	public void setInterior(String interior);
}

class House implements HousePlan {
	private String basement;
	private String structure;
	private String roof;
	private String interior;

	@Override
	public void setBasement(String basement) {
		this.basement = basement;

	}

	@Override
	public void setStructure(String structure) {
		this.structure = structure;

	}

	@Override
	public void setRoof(String roof) {
		this.roof = roof;

	}

	@Override
	public void setInterior(String interior) {
		this.interior = interior;

	}

}

interface HouseBuilder {
	public void buildBasement();

	public void buildStructure();

	public void buildRoof();

	public void buildInterior();

	public House getHouse();
}

class IglooHouseBuilder implements HouseBuilder {

	private House house;

	IglooHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Ice Bars");

	}

	@Override
	public void buildStructure() {
		house.setBasement("Ice Blocks");

	}

	@Override
	public void buildRoof() {
		house.setBasement("Ice Dome");

	}

	@Override
	public void buildInterior() {
		house.setInterior("Ice Carvings");

	}

	@Override
	public House getHouse() {
		return this.house;
	}

}

class CivilEngineer {
	private HouseBuilder houseBuilder;

	public CivilEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public House getHouse() {
		return this.houseBuilder.getHouse();

	}

	public House constructHouse() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildInterior();

		return this.houseBuilder.getHouse();

	}
}
