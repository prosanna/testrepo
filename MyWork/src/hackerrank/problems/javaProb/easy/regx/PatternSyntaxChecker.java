/**
 * 
 */
package hackerrank.problems.javaProb.easy.regx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * <b>PatternSyntaxChecker</b>
 * <p>
 * In this problem, a regex is only valid if you can compile it using the
 * Pattern.compile method.
 * 
 * @author prosanna
 * 
 * @see <a href=
 *      "https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29">https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29</a>
 *
 */
public class PatternSyntaxChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		List<String> patterns = new ArrayList<String>();

		for (int j = 0; j <= i; j++) {
			String p = s.nextLine();
			if (!p.isBlank()) {
				patterns.add(p);
			}

		}
		s.close();

		
		for (String pattern : patterns) {
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			
		}
	}
	
	private void Alternate(Scanner in) {
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	
            testCases--;
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }
		}

	}

}
