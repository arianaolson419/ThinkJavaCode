public class Multadd {
	public static void main(String[] args) {
		double a = 1.0;
		double b = 2.0;
		double c = 3.0;

		double test = multadd(a, b, c);
		double trig = multadd(0.5, Math.cos(Math.PI/4), Math.sin(Math.PI / 4));
		double log = multadd(1, Math.log(10), Math.log(20));

		System.out.printf("%f, %f, %f\n", test, trig, log);
		System.out.println(expSum(3));
	}

	public static double multadd(double a, double b, double c) {
		double result = a * b + c;
		return result;
	}

	public static double expSum(double x) {
		double eToThe = Math.exp(-x);
		double result = multadd(x, eToThe, Math.sqrt(1 - eToThe));
		return result;
	}
}