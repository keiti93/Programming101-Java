package week01.Friday;

import java.util.Scanner;

public class Problem32 {

	// 32. Palindrome Score
	public static int pScore(int n) {
		int score = 1;
		if (isPalindrome(n)) {
			return score;
		}
		while (isPalindrome(n) != true) {
			long m = reversedNumber(n);
			n = (int) (n + m);
			score += 1;
		}
		return score;
	}

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

		System.out.println(pScore(n));
		scanner.close();
	}
}
