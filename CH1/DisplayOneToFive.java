public class DisplayOneToFive {
	private void outputCounts() {
		int counter = 1;
		while(counter<6) {
			System.out.println(counter);
			counter = counter + 1;
		}
	}
	
	public static void main(final String[] args) {
		DisplayOneToFive object = new DisplayOneToFive();
		object.outputCounts();
	}
}
