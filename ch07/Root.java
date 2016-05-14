public class Root {
	public static void main(String[] args) {
		System.out.println(squareRoot(9.0));
	}

	public static double squareRoot(double a) {
		/**
		* Estimates the square root of a number
		* @param a is the number for which we will estimate the square root
		*/

		double x0 = a/2.0; // initial estimate
		double x; // estimated root
		boolean flag = true;
		final double error = 0.0001; // the difference between estimates that is "good enough"

		do {
			x = (x0 + a/x0)/2;
			if (Math.abs(x - x0) < error) {
				flag = false;
			}
			x0 = x;
		} while (flag);

		return x;
	}
}