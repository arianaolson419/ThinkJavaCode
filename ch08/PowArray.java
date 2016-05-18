import java.util.Arrays;
import java.util.Random;

public class PowArray {
	public static void main(String[] args) {
		double[] a = {4, 8, 1, 2};
		int[] numbers = {1, 2, 4};
		int[] scores = randomArray(10);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(histogram(scores, 10)));
		System.out.println(indexOfMax(scores));
		System.out.println(Arrays.toString(sieve(5)));
		System.out.println(areFactors(15, numbers));
		System.out.println(arePrimeFactors(16, numbers));
	}

	public static double[] powArray(double[] a, int n) {
		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Math.pow(a[i], n);
		}
		return b;
	}

	public static int[] randomArray(int size) {
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		return a;
	}

	public static int[] histogram(int[] scores, int bins) {
		int[] counts = new int[bins];
		for (int score : scores) {
			counts[score/bins]++;
		}

		return counts;
	}

	public static int indexOfMax(int[] array) {
		int index = -1;
		int value = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > value) {
				index = i;
				value = array[i];
			}
		}

		return index;
	}

	public static boolean[] sieve(int n) {
		boolean[] a = new boolean[n + 1];
		Arrays.fill(a, true);
		a[0] = true;
		a[1] = true;

		if (n > 1) {
			for (int i = 2; (double) i <= Math.sqrt(n); i++) {
				if (a[i]) {
					int k = 0;
					for (int j = i*i + k; j <= n; j *= k) {
						a[j] = false;
						k++;	
					}
				}
			}
		}

		return a;
	}

	public static boolean areFactors(int n, int[] numbers) {
		boolean flag = true;
		for (int i = 0; i < numbers.length; i++) {
			if (n % numbers[i] != 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static boolean arePrimeFactors(int n, int[] numbers) {
		boolean[] primes;
		if (areFactors(n, numbers)) {
			primes = sieve(n);

			for (int i = 0; i < numbers.length; i++) {
				if (!primes[numbers[i]]) {
					return false;
				}
			}
			return true;
		}

		else {
			return false;
		}
	}
}