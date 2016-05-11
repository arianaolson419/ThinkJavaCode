import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		int guess;
		int answer = random.nextInt(100) + 1;

		// get input
		System.out.println("I'm thinking of a number between 1 and 100.\nCan you guess what it is?");
		System.out.print("Type a number: ");
		guess = in.nextInt();
		System.out.printf("Your guess is: %d\n", guess);
		System.out.printf("The number I was thinking of is: %d\n", answer);
		System.out.printf("You were off by: %d\n", guess - answer);
	}
}