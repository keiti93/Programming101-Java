package week03.Monday;

public class Substract {

	public static <T1 extends Number, T2 extends Number> double substract(T1 first, T2 second) {
		return first.doubleValue() - second.doubleValue();
	}

	public static void main(String[] args) {
		System.out.println(substract(new Integer(7), new Double(5.6)));
	}
}
