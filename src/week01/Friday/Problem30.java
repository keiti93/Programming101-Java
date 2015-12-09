package week01.Friday;

import java.util.Scanner;

public class Problem30 {

	// 30. Vowels in a string
	public static int countVowels(String str) {
		str = str.toLowerCase();
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		System.out.println(countVowels(n));
		scanner.close();
	}
}
