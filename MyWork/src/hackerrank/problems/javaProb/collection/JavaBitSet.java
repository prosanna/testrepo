/**
 * 
 */
package hackerrank.problems.javaProb.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

/**
 * <b>Java BitSet</b>
 * <p>
 * Java's BitSet class implements a vector of bit values (i.e.: false(0) or
 * true(1)) that grows as needed, allowing us to easily manipulate bits while
 * optimizing space (when compared to other collections). Any element having a
 * bit value of 1 is called a set bit.
 * 
 * @author prosanna
 * @see <a href=
 *      "https://docs.oracle.com/javase/7/docs/api/java/util/BitSet.html">https://docs.oracle.com/javase/7/docs/api/java/util/BitSet.html</a>
 */
public class JavaBitSet {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine().trim();
        StringTokenizer st=new StringTokenizer(s);
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
		
		BitSet bit1 = new BitSet(N);
		BitSet bit2 = new BitSet(N);
		
		while (M --> 0) {
			s=br.readLine().trim();
	           st=new StringTokenizer(s);
	           String ins=st.nextToken();
	           int a=Integer.parseInt(st.nextToken());
	           int b=Integer.parseInt(st.nextToken());
	           switch(ins)
	           {
	               case "AND":
	                    if(a==1)
	                         bit1.and(bit2);
	                    else
	                        bit2.and(bit1);
	                    break;
	               case "OR":
	                    if(a==1)
	                        bit1.or(bit2);
	                    else
	                        bit2.or(bit1);
	                    break;
	               case "XOR":
	                    if(a==1)
	                        bit1.xor(bit2);
	                    else
	                        bit2.xor(bit1);
	                    break;
	               case "FLIP":
	                    if(a==1)
	                        bit1.flip(b);
	                    else
	                        bit2.flip(b);
	                    break;
	               case "SET":
	                    if(a==1)
	                        bit1.set(b);
	                    else
	                        bit2.set(b);
	                    break;

	           }
	           System.out.println(bit1.cardinality()+" "+bit2.cardinality());
		}
		
		
		

	}

}
