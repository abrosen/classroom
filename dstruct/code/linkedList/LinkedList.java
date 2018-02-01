package linkedList;

public class LinkedList<E> {
	
	private Node<E> head;
	private int size;
	
	
	public LinkedList() {
		head = null;
		size = 0; 
	}
	
	public boolean add(E item) {
		 return false;
	}
	
	
	public void add(int index, E item) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		Node<E> adding = new Node<E>(item);
		if(index == 0) {
			adding.next = head;
			head = adding;
		} else {
			Node<E> before = getNode(index - 1);
			adding.next = before.next;
			before.next = adding;
		}
		
		size++;
	}

	
	private Node<E> getNode(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		
		return current;
		
	}
	
	
	
	
	public String toString() {
		StringBuilder output=  new StringBuilder();
		output.append("[");
		Node<E> current = head;
		while(current.next != null) {
			output.append(current.item  + " ");
			current = current.next;
		}
		
		
		output.append(current.item  + "]");
		return output.toString();
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>() ;
		l.add(0, 5);
		for(int i = 4; i >=0; i-- ) {
			l.add(0,i);
		}
		System.out.println(l);
		
	}

	private static class Node<E> {
		private E item;
		private Node<E> next;
		
		
		public Node(E item) {
			this.item = item;
		}
	}
	
}







