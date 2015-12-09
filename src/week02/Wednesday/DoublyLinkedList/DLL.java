package week02.Wednesday.DoublyLinkedList;

public interface DLL {
    public void add(int data);
    public void remove(int index) ;
    public int size();
    public int getFirst();
    public int getLast();
    public Node getElement(int index);
    public int getElementIndex(int data);
}
