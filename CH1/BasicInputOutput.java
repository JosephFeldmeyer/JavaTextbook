/** BasicInputOutput.java 
 * 
 * A program to input a name and message and then display them
 * */

// Import for Scanner
import java.util.Scanner;

public class BasicInputOutput {
	private void doInputOutput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type your name: ");
		final String name = scan.nextLine();
		System.out.print("Type in a message: ");
		final String message = scan.nextLine();
		System.out.println("\nHello, you are: " + name);
		System.out.println("And your message is: " + message + "\n");
	}
	public static void main(final String[] args) {
		BasicInputOutput object = new BasicInputOutput();
		object.doInputOutput();
	}
}
