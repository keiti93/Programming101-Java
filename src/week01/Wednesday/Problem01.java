package week01.Wednesday;

import java.util.Scanner;

public class Problem01 {

	// 1. Is it an odd number?
	public static boolean isOdd(int n) {
		return Math.abs(n) % 2 == 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(isOdd(n));
		scanner.close();

	}
}
