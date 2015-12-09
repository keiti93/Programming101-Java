package week01.Wednesday;

import java.util.Scanner;

public class Problem11 {

	// 11. Raise an integer to a power of another
	public static long pow(int a, int b) {
		long result = 1;
		for (int i = 0; i < b; i++) {
			result = result * a;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		System.out.println(pow(n, m));
		scanner.close();
	}
}
