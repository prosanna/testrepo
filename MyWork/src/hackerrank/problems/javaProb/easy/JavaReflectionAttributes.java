/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

import hackerrank.problems.javaProb.easy.reflection.Student;

/**
 * 
 * 
 * 
 * @author prosannam
 * 
 * @see <a href=
 *      "https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html">https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html</a>
 *
 */
public class JavaReflectionAttributes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Class<?> student = Student.class;
		Method[] methods = student.getDeclaredMethods();//student.getMethods();
		
		ArrayList<String> methodList = new ArrayList<>();
		for (Method m : methods) {
			methodList.add(m.getName());
		}
		Collections.sort(methodList);
		
		for (String name : methodList) {
			System.out.println(name);
		}
	}

}
