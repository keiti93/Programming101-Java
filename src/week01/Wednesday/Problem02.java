package week01.Wednesday;

import java.util.Scanner;

public class Problem02 {

	// 2. Is N prime?
	public static boolean isPrime(int n) {
		int counter = 2;
		if (Math.abs(n) == 1) {
			return false;
		} else {
			while (counter != Math.abs(n)) {
				if ((Math.abs(n) % counter) == 0) {
					return false;
				}
				counter += 1;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		System.out.println(isPrime(n));
		scanner.close();
	}
}
