public class OddSum {
	public static void main(String[] args) {
		System.out.println(oddSum(91));
	}

	public static int oddSum(int n) {
		if (n % 2 == 0 || n < 0) {
			return 0;
		}

		if (n == 1) {
			return n;
		} else {
			return n + oddSum(n-2);
		}
	}
}