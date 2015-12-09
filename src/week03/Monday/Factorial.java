package week03.Monday;

public class Factorial {

	public static <T1 extends Number> double factorial(T1 number) {
		double result = 1;
		for (double i =  number.doubleValue(); i>=1; i--){
			System.out.println(i);
			result*=i;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorial(new Double(5.6)));
	}
}
