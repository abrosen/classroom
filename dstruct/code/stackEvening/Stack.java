package stackEvening;

public class Stack<E> {
	private Node<E> top;
	

	public boolean isEmpty() {
		return top == null;
	}
	
	public E peek() {
		return top.item;
	}
	
	public E pop() {
		if(this.isEmpty()) {
			return null;
		}
		E toReturn = top.item;
		top = top.next;
		
		return toReturn;
	}
	
	
	public E push(E item) {
		Node<E> newTop= new Node<E>(item);
		newTop.next = top;
		top = newTop;
		
		
		return item;
	}
	
	private static class Node<E> {
		private E item;
		private Node<E> next;
		public Node(E item) {

			this.item = item;
		}
		
		
	}
}
