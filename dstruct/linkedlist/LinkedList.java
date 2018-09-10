package linkedlist;

public class LinkedList<E> {





    private static class Node<E>{
        E item;
        Node<E> next;

        public Node(E item){
            this.item = item;
        }
    }
}
