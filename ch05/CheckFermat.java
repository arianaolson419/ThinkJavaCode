public class CheckFermat {
	public static void main(String[] args) {
		checkFermat(1, 2, 3, 4);
		checkFermat(1, 2, 3, 1);
	}

	public static void checkFermat(int a, int b, int c, int n) {
		if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && 
			n > 2) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && 
			n <= 2) {
			System.out.println("Of course it works!");
		} else {
			System.out.println("No, that doesn't work");
		}
	}
}