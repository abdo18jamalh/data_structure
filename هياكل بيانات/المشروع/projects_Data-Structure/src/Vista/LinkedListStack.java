package Vista;

public class LinkedListStack<E> implements Stack<E>{
    SinglyLinkedList<E> slist = new SinglyLinkedList<>();
    public int size() {
        return slist.size();
    }

    public boolean isEmpty() {
        return slist.isEmpty();
    }

    public void push(E data) {
        slist.addFirst(data);
    }

    public E pop() {
        return slist.removeFirst();
    }

    public E top() {
        return slist.getFirst();
    }
    public E dis() {
        return (E) slist.display();
    }
    
}
