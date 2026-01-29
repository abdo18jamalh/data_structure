/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;



public class CircularLinkedList<E> {

    private Node<E> tail;
    private int size;

    public CircularLinkedList() {
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void addFirst(E data) {
        if (size() == 0) {
            Node<E> newNode = new Node(data, null);
            tail = newNode;
            tail.setNext(tail);
        } else {
            Node<E> newNode = new Node(data, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public E getFirst() {
        return tail.getNext().getData();
    }

    public E removeFirst() {
        if (size() == 0) {
            return null;
        }
        E delete = tail.getNext().getData();
        if (tail.getNext() == tail)
            tail = null;
        else
            tail.setNext(tail.getNext().getNext());
        size--;
        return delete;
    }

    public void addLast(E data) {
        addFirst(data);
        tail = tail.getNext();
    }
    
    public E getLast() {
        return tail.getData();
    }

    public E removeLast(){
        if(size()==0) return null ;
        E delete = tail.getData();
        if(tail.getNext()==tail)
            tail = null;
        else{
            Node<E> temp = tail.getNext();
            while(temp.getNext() != tail){
                temp = temp.getNext();
            }
            temp.setNext(tail.getNext());
            tail = temp ;
        }
        size--;
        return delete ;
    }
    
    public String display() {
        StringBuilder sb = new StringBuilder();
        if (tail == null) {
            sb.append("List is empty");
            return sb.toString();
        }

        Node<E> temp = tail.getNext();
        do {
             sb.append(temp.getData() ).append( " ----> ");
            temp = temp.getNext();
        } while (temp != tail.getNext());

        sb.append("go to first ( ").append(temp.getData()).append(" )");
        return sb.toString();
    }

    public class Node<E> {

        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
