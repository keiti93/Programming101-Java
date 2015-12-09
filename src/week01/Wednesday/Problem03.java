package week01.Wednesday;

import java.util.Scanner;

public class Problem03 {

	// 3. Find the minimum element of an array
	public static int minimum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(minimum(arr));
		scanner.close();
	}
}
