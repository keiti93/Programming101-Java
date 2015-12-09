package week01.Wednesday;

import java.util.Scanner;

public class Problem23 {

	// 23. Count number of (non-overlapping) occurrences
	public static int countOccurrences(String needle, String haystack) {
		int counter = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				int j = 1;
				while (haystack.charAt(i + j) == needle.charAt(j)) {
					j++;
					if (haystack.charAt(i + needle.length() - 1) == needle.charAt(needle.length() - 1)) {
						counter++;
						break;
					}
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String needle = scanner.nextLine();
		String haystack = scanner.nextLine();

		System.out.println(countOccurrences(needle, haystack));
		scanner.close();
	}
}
