package week03.Monday;


public class Pair<K, V> {
	private K first;
	private V second;
	
	public Pair(K first, V second){
		this.first = first;
		this.second = second;
	}
	

	public Pair(){}
	
	public K getFirst() {
		return first;
	}

	public void setFirst(K first) {
		this.first = first;
	}

	public V getSecond() {
		return second;
	}

	public void setSecond(V second) {
		this.second = second;
	}

public static void main(String[] args){
	Pair<Integer, String> newPair = new Pair<>();
	newPair.setFirst(1);
	newPair.setSecond("Meow");
	
	System.out.println(newPair.getFirst() + " " + newPair.getSecond());
	}
}
