package week01.Wednesday;

import java.util.Scanner;

public class Problem24 {

	// 24. Decode an URL
	public static String decodeUrl(String input) {
		String temporary = "";
		String result = "";
		String code = "";
		int i = 0;
		while (input.length() >= 2) {
			if (input.charAt(i) == '%') {
				temporary = input.substring(0, i);
				code = input.substring(i, i + 3);
				result += temporary;
				switch (code) {
				case "%20":
					result += " ";
					break;
				case "%3A":
					result += ":";
					break;
				case "%3D":
					result += "?";
					break;
				case "%2F":
					result += "/";
					break;
				}
				input = input.substring(i + 3, input.length());
				i = 0;
			} else {
				if (input.charAt(i) == input.charAt(input.length() - 1)) {
					result += input;
					break;
				}
				i++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		System.out.println(decodeUrl(n));
		scanner.close();
	}
}
