/** ConvertBinaryToDecimal.java
 * Program to convert a <code>String</code> representing a binary number
 * to an <code>int</code> to be output in decimal.
 * @author Joseph Feldmeyer
 */
public class ConvertBinaryToDecimal {
	private String getBinaryNumberString(){
		try(Scanner in = new Scanner(System.in)) {
			System.out.print("Enter a binary number: ");
			return in.nextLine();
		}
	}
	/** Attempt to conbert the string argument representing a binary
	* number to a decimal integer. If any invalid characters are found in the string
	* stop and return the partially converted value. 
	*/
	int convertBinaryToDecimal(final String s) {
		int value = 0;
		int power = 1; 
		for (int position = s.length()-1; position > -1; --position, power *= 2) {
			switch(s.charAt(position)) {
				case '0':
					break;
				case '1':
					value += power; 
					break;
				case'-':
					if(position == 0) { value = -value; break; }
					else{ return value; }
				default: 
					return value; 
			}
		} 
		return value; 
	}
	private void doOutput(final int result) {
		System.out.println("Value as decimal is: " + result);
	}
	public static void main(final String[] args) {
		ConvertBinaryToDecimal object = new ConvertBinaryToDecimal();
		object.doOutput(
			object.convertBinaryToDecimal(
				object.getBinaryNumberString()
			)
		);
	}
}
