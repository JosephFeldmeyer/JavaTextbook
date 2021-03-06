package exercises;
/** DisplayTriangle.java
 * Program that displays a triangle
 * Program that asks users for number of rows, then displays a triangle with that number of rows. 
 * Program that asks users for number of rows and columns, then displays a rectangle of that size. 
 * @author Joseph Feldmeyer
 *
 */
import java.util.Scanner;
public class DisplayTriangle {
	private void displayTriangleFlushedRight(){
		for(int rowCount = 1; rowCount < 7; ++rowCount ) {
			for(int colCount = 1; colCount < 7; ++colCount) {
				if (colCount < 7 - rowCount) { System.out.print(" "); }
				else {System.out.print("*"); }
			}
			System.out.println();
		}
	}
	private void displayTriangleCenter(final int nrowsTri) {
		for (int rowCount = 1; rowCount <= nrowsTri; ++rowCount ) {
			for (int colCount = 1; colCount < (2*nrowsTri); ++colCount ) {
				if (colCount <= (nrowsTri - rowCount)) { System.out.print(" "); }
				else if (colCount < nrowsTri + rowCount) { System.out.print("*"); }
				else { System.out.print(" "); }
			}
			System.out.println();
		}
	}
	private void displayRectangle(final int nrow, final int ncol) {
		for (int rowCount = 1; rowCount <= nrow; ++rowCount ) {
			for (int colCount = 1; colCount <= ncol; ++colCount ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main (final String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			DisplayTriangle object = new DisplayTriangle();
			object.displayTriangleFlushedRight();
			System.out.print("How many rows would you line in your triangle? ");
			final int nrowsTri = scan.nextInt();
			object.displayTriangleCenter(nrowsTri);
			System.out.print("How many rows would you like in your rectangle? ");
			final int nrowsRec = scan.nextInt();
			System.out.print("How many columns would you like in your rectangle? ");
			final int ncolRec = scan.nextInt();
			object.displayRectangle(nrowsRec, ncolRec);
		}
	}
}
