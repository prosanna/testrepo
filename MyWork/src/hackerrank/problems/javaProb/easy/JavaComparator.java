/**
 * 
 */
package hackerrank.problems.javaProb.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * <b>Java Comparator</b>
 * <p>
 * Comparators are used to compare two objects. In this challenge, you'll create
 * a comparator and use it to sort an array.
 * 
 * @author prosanna
 * @see <a href=
 *      "https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html#compare%28T,%20T%29">https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html#compare%28T,%20T%29</a>
 * 
 */
public class JavaComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}

	}

}

/**
 * Player class
 * 
 * @author prosanna
 *
 */
class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

/**
 * Checker class
 * 
 * TODO implement a solution with lambda
 *
 */
class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.score == o2.score) {
			return o1.name.compareTo(o2.name);
		} else {
			return Integer.valueOf(o2.score).compareTo(Integer.valueOf(o1.score));
		}

	}

}