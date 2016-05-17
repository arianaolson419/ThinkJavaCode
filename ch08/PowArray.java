import java.util.Arrays;
import java.util.Random;

public class PowArray {
	public static void main(String[] args) {
		double[] a = {4, 8, 1, 2};
		int[] scores = randomArray(10);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(histogram(scores, 10)));
		System.out.println(indexOfMax(scores));
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
}