package week01.Wednesday;

import java.util.Arrays;
import java.util.Scanner;

public class Problem13 {

	// 13. Maximal scalar product
	public static long maximalScalarSum(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		long result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i] * b[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("First array: ");

		int[] arr1 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.println("Second array: ");

		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr2[i] = scanner.nextInt();
		}

		System.out.println(maximalScalarSum(arr1, arr2));
		scanner.close();
	}
}
