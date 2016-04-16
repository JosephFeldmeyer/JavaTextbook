/** CharacterRectangle.java
* Program to display a rectangle using single character output. 
*/
public class CharacterRectangle {
	private void displaySolidLine(final int width) {
		for (int column = 0; column < width; ++column) {System.out.print('*'); }
	}
	private void displayLineWithEndsOnly(final int width) {
		System.out.print('*');
		for(int column = 0; column < (width-2); ++column) {System.out.print(" "); }
		System.out.print('*');
	}
	private void displayRectangle(final int height, final int width) {
		for (int row = 0; row < height; ++row) {
			if ((row==0) || (row==(height-1))) {displaySolidLine(width); }
			else {displayLineWithEndsOnly(width);}
			System.out.println();
		}
	}
	public static void main (final String[] args) {
		final CharacterRectangle object = new CharacterRectangle();
		object.displayRectangle(6, 8) ;
	}
}
