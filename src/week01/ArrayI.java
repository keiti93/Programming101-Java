package week01;

public class ArrayI {

	public static int multiply(int[] arr, int i){
		int pr = 1;
		for (int j = 0; j<arr.length;j++){
			pr*= arr[j];
		}
		return pr/arr[i];
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 0, 5 };
		System.out.println(multiply(arr, 4));

	}

}
