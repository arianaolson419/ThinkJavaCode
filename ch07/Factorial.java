public class Factorial {
	public static void main(String[] args) {
		System.out.println(myExp(3.0, 10));
		System.out.println(Math.exp(3));
		
	}

	public static int factorial(int n) {
		int res = 1;

		for (int i = n; i > 0; i--) {
			res *= i;
		}
		return res;
	}

	public static double myExp(double x, int n) {
		double res = 0;

		for(int i = 0; i < n; i++){
			res += Math.pow(x, i)/factorial(i);
		}

		return res;
	}
}