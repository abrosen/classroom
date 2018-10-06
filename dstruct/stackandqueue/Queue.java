package stackandqueue;

public class Queue<E> {
    private Node<E> front;
    private Node<E> back;

    public boolean isEmpty(){
        return front == null;
    }

    public E peek() {
        return front.item;
    }



    // adds to back
    public boolean offer(E item) {
        Node<E> temp =  new Node<>(item);
        if(this.isEmpty()){
            front = temp;
            back = temp;
        } else {
            back.next = temp;
            back = temp;
        }

        return true;
    }

    // removes front of queue
    public E poll() {
        E toReturn  = front.item;
        if(front == back) {
            front = null;
            back = null;
        } else {
            front = front.next;
        }
        return toReturn;
    }






    private static class Node<E> {
        E item;
        Node<E> next;

        private Node(E item) {
            this.item = item;
        }
    }

    public static void main(String[] args) {
        Queue<Integer>  q = new Queue<>();
        for (int i = 0; i <10 ; i++) {
            q.offer(i);
        }

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }


}
