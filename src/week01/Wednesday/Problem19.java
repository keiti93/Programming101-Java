package week01.Wednesday;

import java.util.Scanner;

public class Problem19 {

	// 19. Is this string a palindrome
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
		String n = scanner.nextLine();

		System.out.println(isStringPalindrome(n));
		scanner.close();
	}
}
