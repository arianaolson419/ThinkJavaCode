import java.util.Arrays;
import java.util.Scanner;

public class StringThings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String input2 = in.nextLine();

		System.out.println(canSpell(input1, input2));
	}

	public static boolean isAbecedarian(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			} 
		}

		return true;
	}

	public static boolean isDoubloon(String s) {
		s = s.toLowerCase();
		int[] hist = letterHist(s);
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] != 2 && hist[i] != 0) {
				return false;
			}
		}
		return true;
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

	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.toLowerCase().replace(" ", "");
		s2 = s2.toLowerCase().replace(" ", "");
		int[] hist1 = letterHist(s1);
		int[] hist2 = letterHist(s2);

		for (int i = 0; i < hist1.length; i++) {
			if (hist1[i] != hist2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean canSpell(String s1, String s2) {
		s1 = s1.toLowerCase().replace(" ", "");
		s2 = s2.toLowerCase().replace(" ", "");
		int[] hist1 = letterHist(s1);
		int[] hist2 = letterHist(s2);

		for (int i = 0; i < hist1.length; i++) {
			if (hist1[i] < hist2[i]) {
				return false;
			}
		}

		return true;
	}
}