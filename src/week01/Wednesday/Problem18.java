package week01.Wednesday;

import java.util.Scanner;

public class Problem18 {

	// 18. Reverse each word in a String
	public static String reverseEveryChar(String arg) {
		String newString = " ";
		String result = "";
		for (int i = 0; i < arg.length(); i++) {
			newString += arg.charAt(i);
			if (arg.charAt(i) == ' ' || i == arg.length() - 1) {
				newString = reverseMe(newString);
				result += newString;
				newString = " ";
			}
		}
		return result;
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

		System.out.println(reverseEveryChar(n));
		scanner.close();
	}
}
