public class BottlesOfBeer {
	public static void main(String[] args) {
		sing(5);
	}

	public static void sing(int bottles) {
		if (bottles == 0) {
			end();
		}

		else {
			lyrics(bottles);
			sing(bottles - 1);
		}
	}

	public static void lyrics(int bottles) {
		System.out.printf("%d bottles of beer on the wall,\n%d bottles of beer,\nya’ take one down, ya’ pass it around,\n%d bottles of beer on the wall.\n", 
		bottles, bottles, bottles - 1);
	}

	public static void end() {
		System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya’ can’t take one down, ya’ can’t pass it around,\n’cause there are no more bottles of beer on the wall!");
	}
}