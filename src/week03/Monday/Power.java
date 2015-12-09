package week03.Monday;

public class Power {

	public static <T1 extends Number, T2 extends Number> double power(T1 first, T2 second){
		return Math.pow(first.doubleValue(), second.doubleValue());
	}
	
	public static void main(String[] args){
		System.out.println(power(new Integer(4), new Double(5.6)));
	}
}
