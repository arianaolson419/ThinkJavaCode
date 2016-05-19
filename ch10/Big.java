import java.math.BigInteger;

public class Big {
	public static void main(String[] args) {
		for (int i = 0; i <= 30; i++) {
			System.out.print(factorial(i) + " ");
			System.out.println(bigFactorial(BigInteger.valueOf(i)));
		}
	}

	public static int factorial(int n) {
		int prod = 1;

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				prod *= i;
			}
		}

		return prod;
	}

	public static BigInteger bigFactorial(BigInteger bigN) {
		BigInteger prod = BigInteger.valueOf(1);

		if (bigN.compareTo(prod) > 0) {
			for (BigInteger i = BigInteger.valueOf(1); 
					i.compareTo(bigN) < 1; i = i.add(BigInteger.valueOf(1))) {
				prod = i.multiply(prod);
			}
		}

		return prod;
	}
}