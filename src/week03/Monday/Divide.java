package week03.Monday;

public class Divide {

	public static <T1 extends Number, T2 extends Number> double divide(T1 first, T2 second){
		return first.doubleValue() / second.doubleValue();
	}
	
	public static void main(String[] args){
		System.out.println(divide(new Integer(11), new Double(5.6)));
	}
}
