/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * <b>Java Sort</b>
 * 
 * @author prosanna
 *
 */
public class JavaSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getCgpa() == o2.getCgpa()) {
					return o1.getFname().compareTo(o2.getFname());
				} else if (o1.getFname() == o2.getFname()) {
					return Integer.valueOf(o1.getId()).compareTo(o2.getId());
				} else {
					return Double.valueOf(o2.getCgpa()).compareTo(Double.valueOf(o1.getCgpa()));
				}
			}
		});
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}

	}

}

/**
 * Student class
 * 
 * @author prosanna
 *
 */
class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}
