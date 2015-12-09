package week02.Wednesday.Stack;

public class noClonesAllowed extends StackImpl {

	@Override
	public void push(int data) {
		if (empty()) {
			head = new Node(data);
			tail = head;
		} else {
			boolean flag = false;
			Node temp = head;
			while (temp != null) {
				if (temp.data == data) {
					System.out.println("The element "+ data +" is already in the stack so it won't be pushed.");
					flag = true;
				} 
				temp = temp.next;
			}
			if (flag==false){
			tail.next = new Node(data);
			tail = tail.next;
		}}

	}
	public static void main(String[] args) {
		StackImpl s = new noClonesAllowed();
		for (int i = 10; i < 20; i++) {
			s.push(i);
		}
		System.out.println(s);
		s.push(11);
		System.out.println(s);

}
}