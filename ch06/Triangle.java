public class Triangle {
	public static void main(String[] args) {
		double a = 10;
		double b = 4;
		double c = 5;

		System.out.println(isTriangle(a, b, c));
	}

	public static boolean isTriangle(double a, double b, double c) {
		if (a + b < c) {
			return false;
		} else if (b + c < a) {
			return false;
		} else if (c + a < b) {
			return false;
		} else {
			return true;
		}
	} 
}
