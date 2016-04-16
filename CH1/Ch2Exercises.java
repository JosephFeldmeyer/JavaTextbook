/** Exercises.java
 * */
 
//import DisplayOneToFive;
//import BasicInputOutput;

public class Ch2Exercises {

	//2.2 
	private void MessageTenWhileLoop() {
		int counter = 1;
		while(counter < 11) {
			System.out.println(counter + ". A message");
			counter = counter + 1; 
		}
	}

	//2.3
	private void MessageTenDoLoop() {
		int counter = 1;
		do {
			System.out.println(counter + ". A message");
			counter = counter + 1;
		} while(counter<11);
	}

	public static void main(final String[] args) {
		//2.1
		DisplayOneToFive object = new DisplayOneToFive();
		object.outputCounts();
		BasicInputOutput object = new BasicInputOutput();
		object.doInputOutput();

		//2.2
		Ch2Exercises object = new Ch2Exercises();
		object.MessageTenWhileLoop();

		//2.3
		object.MessageTenDoLoop();
	}
}