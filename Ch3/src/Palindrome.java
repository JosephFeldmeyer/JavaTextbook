/** Palindrome.java
 * Program to check for a palindrome
 * */
import java.util.Scanner;
public class Palindrome {
	Scanner in = new Scanner(System.in);
	private String getInput() {
		System.out.print("Enter text to check: ");
		return in.nextLine();
	}
	private void testForPalindrome (final String s) {
		final String forward = s.toLowerCase();
		final String reversed  = (new StringBuilder(forward)).reverse().toString();
		System.out.print("The string is ");
		if (forward.compareTo(reversed) != 0) {System.out.print("not "); }
		System.out.print("a plaindrome.");
	}
	public static void main(final String[] args) {
		final Palindrome object = new Palindrome();
		object.testForPalindrome(object.getInput());
	}
}
