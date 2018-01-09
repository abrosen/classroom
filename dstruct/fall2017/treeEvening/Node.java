package treeEvening;

public class Node<E> {
	E item;
	Node<E> left;
	Node<E> right;
	
	
	public Node(E item) {
		this.item = item;
	}
	
	public String toString() {
		return item.toString();
	}
	
}

