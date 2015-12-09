package week03.Monday;

public class Triple<K, V, T>{
		private K first;
		private V second;
		private T third;
		
		public Triple(K first, V second, T third){
			this.first = first;
			this.second = second;
			this.third = third;
		}
		

		public Triple(){}
		
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
		
		public T getThird() {
			return third;
		}

		public void setThird(T third) {
			this.third = third;
		}

	public static void main(String[] args){
		Triple<Integer, String, Integer> newTriple = new Triple<>();
		newTriple.setFirst(1);
		newTriple.setSecond("Meow");
		newTriple.setThird(12);
		
		System.out.println(newTriple.getFirst() + " " + newTriple.getSecond() + " " + newTriple.getThird());
		}
	}

