/** TriangleCalculation.java
 * 
 * Program to input the lengths of the sides of a triangle and output 
 * the perimeter and area of the triangle using Heron's Formula to 
 * calculate the area. 
 * */
 
 import java.util.Scanner;
 
 public class TriangleCalculation {
	private void doComputations() {
		final Scanner scan = new Scanner(System.in);
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
		scan.close();
	}
	public static void main(final String[] args) {
		TriangleCalculation object = new TriangleCalculation();
		object.doComputations();
	}
 }
