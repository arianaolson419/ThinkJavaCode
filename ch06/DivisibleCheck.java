import java.util.Scanner;

public class DivisibleCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		boolean x;
		System.out.println("Give me two numbers");
		n = in.nextInt();
		m = in.nextInt();
		x = isDivisible(n, m);
		System.out.printf("It is %b that %d is divisible by %d\n", x, n, m);
	}

	public static boolean isDivisible(int n, int m) {
		return n % m == 0;
	}
}