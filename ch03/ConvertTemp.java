import java.util.Scanner;

/**
 * Converts from Celcius to Farenheit.
 */

public class ConvertTemp {
	public static void main(String[] args) {
		double celcius, farenheit;
		final double multiplier = 9.0 / 5.0;
		final int adder = 32;
		Scanner in = new Scanner(System.in);

		//prompt the user and get the value
		System.out.print("Exactly how many degrees Celcius? ");
		celcius = in.nextDouble();

		//convert output and get result
		farenheit = celcius * multiplier + (float) adder;
		System.out.printf("%.1f degres C is %.1f degrees F.\n", celcius, farenheit);
	}
}