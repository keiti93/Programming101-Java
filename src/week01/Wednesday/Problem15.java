package week01.Wednesday;

import java.util.Scanner;

public class Problem15 {

	// 15. Can balance?
	public static boolean canBalance(int[] numbers) {
		int sumLeft = numbers[0];
		int sumRight = 0;
		for (int i = 1; i < numbers.length; i++) {
			sumRight += numbers[i];
		}
		if (numbers.length == 2 && sumLeft == sumRight) {
			return true;
		}

		for (int j = 1; j < numbers.length; j++) {
			sumLeft += numbers[j];
			sumRight -= numbers[j];
			if (sumLeft == sumRight) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(canBalance(arr));
		scanner.close();
	}
}
