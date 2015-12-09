package week01.Wednesday;

import java.util.Scanner;

public class Problem05 {

	// 5. Find the average of the elements of an array
	public static float getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return (float) sum / array.length;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(getAverage(arr));
		scanner.close();
	}
}
