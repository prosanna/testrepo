/**
 * 
 */
package designPattern.examples.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Composite Design Pattern</b>
 * <p>
 * Compose objects into tree structure to represent part-whole hierarchies.
 * Composite lets clients treat individual objects and composition of objects
 * uniformly or in the same way.
 * 
 * @author prosannam
 *
 */
public class Composite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Department salesDepartment = new SalesDepartment(1, "Sales department");
		Department financialDepartment = new FinancialDepartment(2, "Financial department");

		HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);

		headDepartment.printDepartmentName();

	}

}

/**
 * Base Component
 * 
 * @author prosannam
 *
 */
interface Department {
	void printDepartmentName();
}

/**
 * Leaf 1
 * 
 * @author prosannam
 *
 */
class FinancialDepartment implements Department {
	private Integer id;
	private String name;

	@Override
	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());

	}

	public FinancialDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}

/**
 * Leaf 2
 * 
 * @author prosannam
 *
 */
class SalesDepartment implements Department {
	private Integer id;
	private String name;

	@Override
	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());

	}

	public SalesDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}

/**
 * <p>
 * <b>This is a composite class as it holds a collection of Department
 * components</b>, as well as methods for adding and removing elements from the
 * list.
 * 
 * The composite <code>printDepartmentName()</code> method is implemented by
 * iterating over the list of leaf elements and invoking the appropriate method
 * for each one.
 * 
 * @author prosannam
 *
 */
class HeadDepartment implements Department {

	private Integer id;
	private String name;

	private List<Department> childDepartments;

	public HeadDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printDepartmentName() {
		childDepartments.forEach(Department::printDepartmentName);

	}

	public void addDepartment(Department department) {
		childDepartments.add(department);
	}

	public void removeDepartment(Department department) {
		childDepartments.remove(department);
	}

}
