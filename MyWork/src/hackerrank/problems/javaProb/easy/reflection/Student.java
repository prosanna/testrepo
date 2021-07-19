/**
 * 
 */
package hackerrank.problems.javaProb.easy.reflection;

/**
 * @author prosannam
 * 
 * @see <a href=
 *      "https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html">https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html</a>
 *
 */
public class Student {
	
	private String name;
    private String id;
    private String email;
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
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void anotherMethod() {
	}
	
	public void someMoreMethod() {
	}

}
