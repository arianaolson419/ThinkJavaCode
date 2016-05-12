import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		Random random = new Random();
		int answer = random.nextInt(100) + 1;
		prompt(answer);
	}

	public static void prompt(int answer) {
		Scanner in = new Scanner(System.in);
		int guess;
		System.out.print("Type a number: ");
		guess = in.nextInt();
		if (guess == answer) {
			System.out.printf("Your guess is: %d\n", guess);
			System.out.println("That's right!");
		} else {
			System.out.printf("Your guess is: %d\n", guess);
			System.out.println("Try again!");
			/*System.out.printf("Psst! the answer is %d\n", answer);*/
			prompt(answer);
		}
	}
}