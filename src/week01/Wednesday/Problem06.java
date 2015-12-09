package week01.Wednesday;

import java.util.Scanner;

public class Problem06 {

	// 6. Double factorial
	public static int fact(long result2) {
		int result = 1;
		if (result2 == 0 || result2 == 1) {
			return result;
		} else {
			for (int i = 1; i < result2 + 1; i++) {
				result *= i;
			}
		}
		return result;
	}

	public static long doubleFact(int n) {
		return fact(fact(n));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(doubleFact(n));
		scanner.close();
	}
}
