package week03.Monday;

public class Backpack<T> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

public static void main(String[] args) {
		Backpack<Integer> bp = new Backpack<>();
		bp.setObject(87654);
		
		System.out.println(bp.getObject());

	}
}
