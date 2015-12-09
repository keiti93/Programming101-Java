package week02.Wednesday.PairThem;

public class Pair {
	private Object first;
	private Object second;
	
	public Pair(Object first, Object second){
		this.first = first;
		this.second = second;
	}
	
	public Object getFirst() {
		return first;
	}
	public Object getSecond() {
		return second;
	}
	
	public boolean equals(Pair b){
		return (b.first==this.first && b.second==this.second);
	}
	
	@Override
	public String toString(){
		return "(" + first + ", " + second + ")";
	}
}
