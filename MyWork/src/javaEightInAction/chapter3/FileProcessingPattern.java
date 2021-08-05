/**
 * 
 */
package javaEightInAction.chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <b>File Processing Pattern</b>
 * <p>
 * Use Behavior Parameterization
 * 
 * @author prosanna
 *
 */
public class FileProcessingPattern {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String result1 = processFile((BufferedReader br) -> br.readLine());
		String result2 = processFile((BufferedReader br) -> br.readLine() + " " + br.readLine());

		System.out.println(result1);
		System.out.println(result2);

	}

	/**
	 * File Processor function.
	 * 
	 * @param p
	 * @return
	 * @throws IOException
	 */
	public static String processFile(BufferedReaderProcessor p) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader("D:\\WorkShop\\testrepo\\MyWork\\src\\main\\resources\\data.txt"))) {
			return p.process(br);
		}

	}

	@FunctionalInterface
	interface BufferedReaderProcessor {
		String process(BufferedReader b) throws IOException;
	}
}
