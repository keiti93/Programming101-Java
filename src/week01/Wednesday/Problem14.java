package week01.Wednesday;

import java.util.Scanner;

public class Problem14 {

	// 14. Max span
	public static int maxSpan(int[] numbers) {
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j > 0; j--) {
				if (numbers[i] == numbers[j]) {
					count = j - i + 1;
					if (count >= maxCount) {
						maxCount = count;
					}
					count = 0;
					break;
				}
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(maxSpan(arr));
		scanner.close();
	}
}
