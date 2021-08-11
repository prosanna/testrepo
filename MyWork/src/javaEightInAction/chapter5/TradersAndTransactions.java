/**
 * 
 */
package javaEightInAction.chapter5;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 * @author prosanna
 *
 */
public class TradersAndTransactions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		// @formatter:off
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011,300),				
				new Transaction(raoul, 2012,1000),
				new Transaction(raoul, 2011,400),
				new Transaction(mario, 2012,710),
				new Transaction(mario, 2012,700),
				new Transaction(alan, 2012,950)
				);
		// @formatter:on

		// Find all the transactions in 2011 and sort by value (small to high).
		// @formatter:off
		List<Transaction> tr2011 = 
				transactions.stream()
				.filter(i->i.getYear()==2011)
				.sorted(comparing(Transaction::getValue))
				.collect(toList());
		// @formatter:on

		tr2011.stream().forEach(System.out::println);
		System.out.println();
		// What are all the cities where the traders work?
		// @formatter:off
		List<String> cities = 
				transactions.stream()
				.map(t->t.getTrader().getCity())
				.distinct()
				.collect(toList());
		// @formatter:on

		cities.stream().forEach(System.out::println);
		System.out.println();
		// Find all traders from Cambridge and sort them by name.
		// @formatter:off
		List<Trader> traders = 
				transactions.stream()
				.map(Transaction::getTrader)
				.filter(t->t.getCity()=="Cambridge")
				.distinct()
				.sorted(comparing(Trader::getName))
				.collect(toList());
		// @formatter:on
		traders.stream().map(Trader::getName).forEach(System.out::println);
		System.out.println();
		// Return a string of all traders names sorted alphabetically.

		/*
		 * List<String> tradersName = transactions.stream() .map(Transaction::getTrader)
		 * .sorted(comparing(Trader::getName)) .distinct() .map(Trader::getName)
		 * .collect(toList());
		 */
		String traderStr = transactions.stream().map(t -> t.getTrader().getName())// Extract all names of the traders as
																					// Stream of Strings.
				.distinct()// Select unique names
				.sorted()// Sort the name alphabetically
				.reduce("", (n1, n2) -> n1 + n2);// Combine each name one by one to form a String that concatenates all
													// the names.
		/**
		 * Better Solution to this using joining (Which internally make use of a
		 * StringBuilder)
		 */
		String traderStrBetterSol = transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted()
				.collect(joining());
		// @formatter:on
		// tradersName.stream().forEach(System.out::println);
		System.out.println(traderStr);
		System.out.println(traderStrBetterSol);
		System.out.println();

		// Are any traders based in Milan?
		// @formatter:off
		boolean milanBaseTrader = transactions.stream().map(t -> t.getTrader().getCity()).anyMatch(s -> s == "Milan");
		System.out.println("Any Milan Base Trader : " + (milanBaseTrader ? "YES" : "NO"));
		boolean milanBaseTrader2 = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));// Better solution
		System.out.println("Any Milan Base Trader : " + (milanBaseTrader2 ? "YES" : "NO"));		
// @formatter:on

		System.out.println();

		// Print all transaction values from the traders living in Cambridge.
		// @formatter:off
		transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.forEach(System.out::println);
// @formatter:on

		// What is the highest value of all the Transitions ?
		// @formatter:off
		Optional<Integer> maxValue = 
				transactions.stream()
						.map(Transaction::getValue)
						.reduce(Integer::max);
// @formatter:on
		System.out.println(maxValue.get().intValue());

		// Find the transaction with the smallest value
		// @formatter:off
		Optional<Transaction> smallestTransaction = 
				transactions.stream()
						.reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
		smallestTransaction.stream().forEach(System.out::println);
// @formatter:on

	}

}
