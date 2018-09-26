package linkedlist;

import java.util.Collections;

public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }


    public void deleteList() {
        head = null;
        tail = null;
        size = 0;
    }

    // This is an instance method, so you can access the head, tail, and the Node class
    public int count(E item) {
        int count = 0;
        Node<E> current = head;
        while(current != null) {
            if(item.equals(current.item)){
                count++;
            }

            current = current.next;
        }
        return count;
    }


    //  3 5
    //  4 7
    //  1 2
    public static DoublyLinkedList<Integer> merge(DoublyLinkedList<Integer> listA, DoublyLinkedList<Integer> listB){
        DoublyLinkedList<Integer> out =  new DoublyLinkedList<>();
        while(listA.size() >0  && listB.size() > 0) {
            if(listA.get(0)  > listB.size()) {
                out.add(listA.get(0));
                listA.remove(0);
            } else {
                out.add(listB.get(0));
                listB.remove(0);
            }
        }
        while(listA.size() != 0) {
            out.add(listA.remove(0));
        }
        while(listB.size() != 0) {
            out.add(listB.remove(0));
        }


        return out;
    }

    // 5 4 3 2 1
    //
    public void reverse(){
        DoublyLinkedList<E> temp = new DoublyLinkedList<>();
        while(this.size != 0){
            E item = this.remove(0);
            temp.add(0,item);
        }
        this.head = temp.head;
        this.tail = temp.tail;
        this.size = temp.size;
    }

    public E get(int index){
        return this.getNode(index).item;
    }


    public boolean add (E item){
        add(size,item);
        return true;
    }


    public void add(int index, E item) {
        //Scenario: Out of bounds
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Aren't we tired of errors?");
        }

        Node<E> temp =  new Node<E>(item);
        //Scenario: Adding the very first item
        if(size == 0) {
            this.head = temp;
            this.tail = temp;
        }
        //Scenario: Adding a new head
        else if(index == 0){
            temp.next = head;
            head.prev = temp;
            head = temp;

        }
        //Scenario: Adding a new tail
        else if(index == size) {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        //Scenario: Any other case
        else{
            Node<E> before =  this.getNode(index - 1);
            temp.next = before.next;
            temp.prev = before;
            before.next = temp;
            temp.next.prev  = temp;
        }



        size++;
    }


    public E remove(int index) {
        E removed = null;
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Foobar");
        }

        if (size == 1) {
            removed = head.item;
            head = null;
            tail = null;
        } else if( index == 0) {
            removed = head.item;
            head = head.next;
            head.prev = null;
        } else if(index == size -1) {
            removed = tail.item;
            tail = tail.prev;
            tail.next = null;

        } else {
            Node<E> before = getNode(index -1);
            removed = before.next.item;
            before.next = before.next.next;
            before.next.prev = before;
        }

        size--;
        return removed;
    }



    private Node<E> getNode(int index){  //O(n)
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public String toString() {
        String output="[ ";
        Node<E> current = head;
        while(current != null) {
            output  += current.item.toString() + " ";
            current = current.next;
        }


        return output+"]";
    }

    public static void main(String[] args) {
        DoublyLinkedList<String> l =  new DoublyLinkedList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        System.out.println(l);
        System.out.println(l.remove(1));
        System.out.println(l.remove(0));
        System.out.println(l.remove(0));
        System.out.println(l);

    }

    private static class Node<E>{
        private E item;
        private Node<E> next;
        private Node<E> prev;

        public Node(E item){
            this.item =  item;
        }
    }
}
