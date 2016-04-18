package exercises;
/** DecimalToBinary.java
 * Read in a decimal integer and print out the binary equivalent. 
 * @author Joseph Feldmeyer
 *
 */
import java.util.Scanner;
public class DecimalToBinary {
	private String doConversion(final int decInput) {
		if(decInput==0) { return " "; }
		else {
			switch(decInput % 2) {
				case 0:
					return doConversion(decInput/2) + "0";
				case 1:
					return doConversion((decInput-1)/2) + "1";
			}	
		}
		return " ";
	}
	public static void main (final String[] args){
		DecimalToBinary object = new DecimalToBinary();
		try(Scanner scan = new Scanner(System.in)) {
			System.out.print("Type in a decimal integer: ");
			final int decInput = scan.nextInt();
			System.out.println("The binary equivalent of that number is: " + object.doConversion(decInput));
		}
	}
}
