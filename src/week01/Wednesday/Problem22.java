package week01.Wednesday;

import java.util.Scanner;

public class Problem22 {

	// 22. Check for palindrome length around '*'
	public static int getPalindromeLength(String input) {
		String string1 = "";
		String string2 = "";
		int counter = 0;

		int i = 0;
		while (input.charAt(i) != '*') {
			string1 += input.charAt(i);
			i++;
		}

		if (input.charAt(i) == '*') {
			i++;
			while (i != input.length()) {
				string2 += input.charAt(i);
				i++;
			}
		}
		string1 = reverseMe(string1);

		for (int j = 0; j < string1.length(); j++) {
			if (j == string2.length() - 1) {
				break;
			}
			if (string1.charAt(j) == string2.charAt(j)) {
				counter++;
				if (string1.charAt(j) != string2.charAt(j)) {
					break;
				}
			}
		}
		return counter;
	}

	public static String reverseMe(String arg) {
		String result = "";
		for (int i = arg.length() - 1; i >= 0; i--) {
			result += arg.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		System.out.println(getPalindromeLength(n));
		scanner.close();
	}
}
