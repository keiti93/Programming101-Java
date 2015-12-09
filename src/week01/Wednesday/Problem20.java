package week01.Wednesday;

import java.util.Scanner;

public class Problem20 {

	// 20. Is this number a palindrome
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(isPalindrome(n));
		scanner.close();
	}
}
