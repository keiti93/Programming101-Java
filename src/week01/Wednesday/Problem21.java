package week01.Wednesday;

import java.util.Scanner;

public class Problem21 {

	// 21. Copy every character K times
	public static String copyEveryChar(String input, int k) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < k; j++) {
				result += input.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		int k = scanner.nextInt();

		System.out.println(copyEveryChar(n, k));
		scanner.close();
	}
}
