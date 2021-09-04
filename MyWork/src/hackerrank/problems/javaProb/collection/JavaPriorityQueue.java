/**
 * 
 */
package hackerrank.problems.javaProb.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * <b>Java Priority Queue</b>
 * <p>
 * In computer science, a priority queue is an abstract data type which is like
 * a regular queue, but where additionally each element has a "priority"
 * associated with it. In a priority queue, an element with high priority is
 * served before an element with low priority.
 * 
 * @author prosanna
 * @see <a href=
 *      "https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html">https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html</a>
 */
public class JavaPriorityQueue {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student1> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student1 st : students) {
				System.out.println(st.getName());
			}
		}
	}

}

/**
 * 
 * @author prosannam
 *
 */
class Priorities {
	// @formatter:off
	private final PriorityQueue<Student1> queue = new PriorityQueue<>(
			Comparator.comparing(Student1::getCgpa).reversed()
						.thenComparing(Student1::getName)
							.thenComparing(Student1::getId));
// @formatter:on

	public List<Student1> getStudents(List<String> events) {
		events.forEach(event -> {
			if (event.equals("SERVED")) {
				queue.poll();
			} else {
				String[] details = event.split(" ");

				queue.add(new Student1(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));

			}
		});

		List<Student1> students = new ArrayList<>();
		while (!queue.isEmpty()) {
			students.add(queue.poll());
		}

		return students;

	}

}

class Student1 {
	int id;
	String name;
	double cgpa;

	public Student1(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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

	/**
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}

	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}
