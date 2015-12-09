package week01.Wednesday;

import java.util.Scanner;

public class Problem09 {

	// 9. Find the largest integer palindrome number up to N

	public static long reversedNumber(long n) {
		long m = n % 10;
		n = n / 10;
		while (n != 0) {
			m = m * 10 + n % 10;
			n = n / 10;
		}
		return m;
	}

	public static boolean isPalindrome(long n) {
		long m = reversedNumber(n);

		return m == n;
	}

	public static long getLargestPalindrome(long N) {
		while (N != 0) {
			if (isPalindrome(N)) {
				return N;
			}
			N--;
		}
		if (N == 0) {
			System.out.println("No such number");
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(getLargestPalindrome(n));
		scanner.close();
	}
}
