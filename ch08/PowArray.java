import java.util.Arrays;

public class PowArray {
	public static void main(String[] args) {
		double[] a = {4, 8, 1, 2};
		System.out.println(Arrays.toString(powArray(a, 2)));
	}

	public static double[] powArray(double[] a, int n) {
		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Math.pow(a[i], n);
		}
		return b;
	}
}