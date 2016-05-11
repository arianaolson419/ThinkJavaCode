import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		int seconds, minutes, hours;
		final int SECONDS_TO_MINUTES = 60;
		final int SECONDS_TO_HOURS = 3600;
		Scanner in = new Scanner(System.in);

		// get user input
		System.out.print("How many seconds? ");
		seconds = in.nextInt();

		// convert input and display
		hours = seconds / SECONDS_TO_HOURS;
		minutes = (seconds % SECONDS_TO_HOURS) / SECONDS_TO_MINUTES;
		seconds = (seconds % SECONDS_TO_HOURS) % SECONDS_TO_MINUTES;

		System.out.printf("%d hour(s), %d minute(s), and %d second(s)\n", hours, minutes, seconds);
	}
}