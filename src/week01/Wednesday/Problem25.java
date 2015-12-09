package week01.Wednesday;

import java.util.Scanner;

public class Problem25 {

	// 25. Sum all the numbers in a String
	public static int sumOfNumbers(String input) {
		int sum = 0;
		int number;
		String numberS = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				numberS += input.charAt(i);
				number = Integer.parseInt(numberS, 10);
				sum += number;
				numberS = "";
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		System.out.println(sumOfNumbers(n));
		scanner.close();
	}
}
