package linkedList;

public class LinkedList<E> {
	
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	
	public LinkedList() {
		head = null;
		tail = null;
		size = 0; 
	}
	
	public boolean add(E item) {
		this.add(size, item); 
		return true;
	}
	
	
	public void add(int index, E item) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> adding = new Node<E>(item);
		
		if(size == 0) {
			head = adding;
			tail = adding;
		}
		else if(index == 0) {
			adding.next = head;
			head = adding;
		
		} else if( index == size) {
			tail.next = adding;
			tail = adding;
		}
		else {
			Node<E> before = getNode(index - 1);
			adding.next = before.next;
			before.next = adding;
		}
		
		size++;
	}

	//finishing with tail left to students
	public E remove(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		E toReturn = null;
		
		if(index == 0) {
			toReturn = this.head.item;
			// Node<E> nextNode = head.next;
			head = head.next;
			
		} else {
			Node<E> before = getNode(index -1);
			toReturn =  before.next.item;
			before.next = before.next.next;
			
		}
		
		size--;
		return toReturn;
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
			l.add(i);
		}
		System.out.println(l);
		l.remove(0);
		l.remove(2);
		
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







