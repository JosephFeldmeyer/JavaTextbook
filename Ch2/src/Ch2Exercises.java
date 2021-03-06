/** Exercises.java
 * */
 
import java.util.Scanner;

public class Ch2Exercises {

	//2.2 
	private void InputUntilMinusOneTyped(){
		try(Scanner scan1 = new Scanner(System.in);) {
			int i = 0;
			while( (i != -1) ) {
				System.out.print("Type in an number: ");
				//scan1.nextLine();
				i = scan1.nextInt();
			}
		}
	}
	
	//2.3
	private void MessageTenWhileLoop() {
		int counter = 1;
		while(counter < 11) {
			System.out.println(counter + ". A message: while");
			counter = counter + 1; 
		}
	}
	
	//2.4
	private void MessageTenDoLoop() {
		int counter = 1;
		do {
			System.out.println(counter + ". A message: do");
			counter = counter + 1;
		} while(counter<11);
	}

	//2.5
	private void LoopOneChar1() {		
		int counter2 = 1; 
		while (counter2 < 5) {
			int counter1 = 1; 
			while (counter1 < 5) {
				System.out.print("*");
				counter1 = counter1 + 1;
			}
			System.out.print("\n");
			counter2 = counter2 + 1;
		}
	}
	
	//2.6
	private void LoopOneChar2() {
		int counter2 = 1; 
		while (counter2 < 6) {
			int counter1 = 1; 
			while (counter1 <= counter2) {
				System.out.print("*");
				counter1 = counter1 + 1;
			}
			System.out.print("\n");
			counter2 = counter2 + 1;
		}
	}
	
	//2.7 
	private void AddTenIntegers(){
		try (Scanner scan = new Scanner(System.in)) {
			int sum = 0;
			int counter = 1; 
			while (counter < 11) {
				System.out.print("Type in an integer: ");
				sum = sum + scan.nextInt();
				counter = counter + 1;
			}
			System.out.print("The sum is: " + sum);
		}
	}

	//2.8
	private void AddIntegers() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("How many numbers to input? ");
			int counterLimit = scan.nextInt();
			int counter = 1;
			int sum = 0;
			while (counter <= counterLimit) {
				System.out.print("Type in an integer: ");
				sum = sum + scan.nextInt();
				counter = counter + 1;
			}
			System.out.print("The sum is: " + sum);
		}		
	}

	//2.9 
	private void StringCompare(){
		System.out.println("PROGRAM".compareTo("ProGram"));
		System.out.println("ProGram".compareTo("proGram"));
		System.out.println("proGram".compareTo("program"));
		System.out.println("program".compareTo("program3"));
		System.out.println("program3".compareTo("programs"));
	}

	//2.10
	private void TriangleCalculationUntilStop() {
		try(Scanner scan = new Scanner(System.in)){
			String str = "";
			while(str.compareTo("stop") != 0) {
				System.out.print("Enter length of first side: ");
				final double a = scan.nextDouble();
				System.out.print("Enter length of second side: ");
				final double b = scan.nextDouble();
				System.out.print("Enter length of third side: ");
				final double c = scan.nextDouble();
				// Test to ensure that the input describes a valid triangle
				// by checking the triangle inequality holds before attempting
				// calculations. 
				if( ((a+b)>c) && ((b+c)>a) && ((a+c)>b) ) {
					final double perimeter = a+b+c;
					final double s = 0.5 * perimeter; 
					final double t = s * (s-a) * (s-b) * (s-c); 
					final double area = Math.sqrt(t);
					System.out.println("Perimeter is: " + perimeter); 
					System.out.println("Area is: " + area);
				}
				else {
					System.out.println("The input values do not describe a triangle."); 
				}
				System.out.print("Do you want to stop? ");
				scan.nextLine();
				str = scan.nextLine();
			}
		}
	}

	public static void main(final String[] args) {
		//2.1
		//DisplayOneToFive object = new DisplayOneToFive();
		//object.outputCounts();
		//BasicInputOutput object1 = new BasicInputOutput();
		//object1.doInputOutput();

		Ch2Exercises object2 = new Ch2Exercises();

		//2.2
		//object2.InputUntilMinusOneTyped();
		
		//2.3
		//object2.MessageTenWhileLoop();
		
		//2.4
		//object2.MessageTenDoLoop();
		
		//2.5 
		//object2.LoopOneChar1();

		//2.6
		//object2.LoopOneChar2();

		//2.7
		//object2.AddTenIntegers();

		//2.8
		//object2.AddIntegers();

		//2.9
		object2.StringCompare();

		//2.10
		object2.TriangleCalculationUntilStop();

	}
}