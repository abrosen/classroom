package eveningReview.doublelinkedlist;

public class Node<E> {
	E item;
	Node<E> next;
	Node<E> prev;
	
	public Node(E item) {
		this.item = item;
		this.next = null;
		this.prev = null;
		
	}
	
}

