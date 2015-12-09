package week01.Wednesday;

import java.util.Scanner;

public class Problem04 {

	// 4. Find the kth minimal element of an array
	public static int kthMin(int k, int[] arr) {

		sort(arr);
		return arr[k];
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the kth element: ");
		int min = scanner.nextInt();

		System.out.println(kthMin(min, arr));
		scanner.close();
	}
}
