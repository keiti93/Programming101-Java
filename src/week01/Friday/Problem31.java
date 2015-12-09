package week01.Friday;

import java.util.Scanner;

public class Problem31 {

	// 31. Consonants in a string
	public static int countConsonants(String str) {
		str = str.toLowerCase();
		String cons = "bcdfghjklmnpqrstvwxz";
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < cons.length(); j++) {
				if (str.charAt(i) == cons.charAt(j)) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		System.out.println(countConsonants(n));
		scanner.close();
	}
}
