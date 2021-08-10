/**
 * 
 */
package javaEightInAction.chapter5;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

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

		// Find all the transactions in 2011 and sort by value (small to high)
		// @formatter:off
		List<Transaction> tr2011 = 
				transactions.stream()
				.filter(i->i.getYear()==2011)
				.sorted(comparing(Transaction::getValue))
				.collect(toList());
		// @formatter:on

		tr2011.stream().forEach(System.out::println);
		// What are all the cities where the traders work?
		// @formatter:off
		List<String> cities = 
				transactions.stream()
				.map(t->t.getTrader().getCity())
				.distinct()
				.collect(toList());
		// @formatter:on

		cities.stream().forEach(System.out::println);

	}

}
