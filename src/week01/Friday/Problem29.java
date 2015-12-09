package week01.Friday;

import java.util.Scanner;

public class Problem29 {

	// 29. Hack Numbers
	public static boolean isHack(int n) {
		String m = Integer.toBinaryString(n);
		int counter = 0;
		for (int i = 0; i < m.length(); i++) {
			if (m.charAt(i) == '1') {
				counter += 1;
			}
		}
		if (isStringPalindrome(m) && counter % 2 == 1) {
			return true;
		}
		return false;
	}

	public static int nextHack(int n) {
		while (!isHack(++n)) {
		}
		return n;
	}

	public static boolean isStringPalindrome(String argument) {
		argument = argument.toLowerCase();
		return argument.equals(reverseMe(argument));
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
		int n = scanner.nextInt();

		System.out.println(nextHack(n));
		scanner.close();
	}
}
