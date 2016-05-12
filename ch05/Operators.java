public class Operators {
	public static void main(String[] args) {
		System.out.print("13");
		and(13);
		System.out.println("\n4");
		and(4);

	}

	public static void and(int x) {
		if (x > 0 && x < 10) {
			System.out.println("positive single digit number");
		}	
	}
}