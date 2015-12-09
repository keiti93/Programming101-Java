package week03.Monday;

public class Multiply {

	public static <T1 extends Number, T2 extends Number> double multiply(T1 first, T2 second) {
		return first.doubleValue() * second.doubleValue();
	}

	public static void main(String[] args) {
		System.out.println(multiply(new Integer(4), new Double(5.6)));
	}
}
