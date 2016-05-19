import java.util.Arrays;

public class Traverse {
	public static void main(String[] args) {
		parensMatch("())");
	}

	public static int[] letterHist(String inputString) {
		int[] hist = new int[26];
		String newString = inputString.toLowerCase().replace(" ", "");
		for (int i = 0; i < newString.length(); i++) {
			char letter = newString.charAt(i);
			hist[letter - 'a']++;
		}
		return hist;
	}

	public static int parensMatch(String inputString) {
		int count = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if (c == '(') {
				count++;
			}

			else if (c == ')') {
				count--;
			}
		}

		if (count > 0) {
			System.out.printf("Missing %d \')\'\n", count);
		}

		else if (count < 0) {
			System.out.printf("Missing %d \'(\'\n", -count);
		}
		return count;
	}
}