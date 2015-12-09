package week01.Wednesday;

import java.util.Scanner;

public class Problem17 {

	// 17. Reverse a String
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

		System.out.println(reverseMe(n));
		scanner.close();
	}
}
