package week02.Wednesday.PairThem;

public class MainPair {

	public static void main(String[] args) {
		Pair pair = new Pair('a', 'b');
		Pair pair2 = new Pair('a', 'c');
		System.out.println(pair.toString());
		System.out.println(pair.equals(pair2));

	}

}
