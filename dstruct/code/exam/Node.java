package exam;

public class Node<E> {
	E item;
	Node<E> prev;
	Node<E> next;
	
	public Node(E item) {
		this.item = item;
	}
}
