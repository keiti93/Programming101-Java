package week02.Wednesday.Stack;

public class StackImpl implements Stack {

	public Node head;
	public Node tail;

	public StackImpl() {
		head = null;
		tail = null;
	}

	public void push(int data) {
		if (empty()) {
			head = new Node(data);
			tail = head;
		} else {
			tail.next = new Node(data);
			tail = tail.next;
		}
	}

	public int pop() {
		int counter = 0;
		Node temp = head;
		Node previous = null;
		while (temp.next != null) {
			previous = temp;
			temp = temp.next;
			counter++;
		}
		previous.next=null;
		return temp.data;
	}

	public int length() {
		int counter = 0;
		Node temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	public int peek() {
		if (empty())
			return 000000;
		return head.data;
	}

	public boolean empty() {
		return head == null;
	}

	public void clear() {
		head = null;
	}

	public String toString() {
		if (empty())
			return "[]";
		String str = "[";
		Node temp = head;
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str + temp.data + "]";

	}

	public static void main(String[] args) {
		StackImpl s = new StackImpl();
		for (int i = 10; i < 20; i++) {
			s.push(i);
		}
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.empty());
		System.out.println(s.length());
		System.out.println(s.peek());
		s.clear();
		System.out.println(s.length());

	}
}
