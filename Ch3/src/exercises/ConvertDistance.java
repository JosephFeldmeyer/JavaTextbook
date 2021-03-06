package exercises;
/** ConvertDistance.java
 * Convert from feet to cm or yards to meters or miles to km
 * @author Joseph Feldmeyer
 */
import java.util.Scanner;
public class ConvertDistance {
	private void doConversion(final String convertMethod, final double convertDistance) {
		if(convertMethod.compareTo("feet") == 0) {
			final double cm = convertDistance*30.48;
			System.out.println(convertDistance + " feet is " + cm + " centimeters.");
		} else if (convertMethod.compareTo("yards") == 0) {
			final double m = convertDistance*0.9144;
			System.out.println(convertDistance + " yards is " + m + " meters.");
		} else if (convertMethod.compareTo("miles") == 0) {
			final double km = convertDistance*1.60934;
			System.out.println(convertDistance + " miles is " + km + " kilometers.");
		} else { System.out.println("I cannot do that Dave."); }
	}
	public static void main (final String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			ConvertDistance object = new ConvertDistance();
			System.out.print("Type 'feet' to convert from feet to centimeters, 'yards' to convert from yards to meters, and 'miles' to convert from miles to kilometers.");
			final String convertMethod = scan.nextLine();
			System.out.print("How many " + convertMethod + "?");
			final double convertDistance = scan.nextDouble();
			object.doConversion(convertMethod, convertDistance);
		}
		
	}
}