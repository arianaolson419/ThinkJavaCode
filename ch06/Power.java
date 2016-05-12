public class Power {
	public static void main(String[] args) {
		System.out.println(power(5, 30));
	}

	public static double power(double x, double n) {
		if (n == 0) {
			return 1.0;
		} else {
			return x * power(x, n-1);
		}
	}
}