/** InputUntilStopTyped.java
 * 
 * Program to input strings until 'stop' is typed. 
 * */
 
 import java.util.Scanner;
 
 public class InputUntilStopTyped {
	private void doInput() {
		try (Scanner scan = new Scanner(System.in);) {
			String s = "";
			do{
				System.out.print("Type a String: ");
				s = scan.nextLine();
			} while(s.compareTo("stop") != 0);
		}
	}
	public static void main(final String[] args) {
		InputUntilStopTyped object = new InputUntilStopTyped();
		object.doInput();
	}
 }
