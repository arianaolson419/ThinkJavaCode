public class Power {
	public static void main(String[] args) {
		System.out.println(power(5, 3));
	}

	public static int power(int x, int n) {
		int res = 1;

		for (int i = 0; i < n; i++) {
			res *= x;
		}

		return res;
	}
}