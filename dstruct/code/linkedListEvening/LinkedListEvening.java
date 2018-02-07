package linkedListEvening;

public class LinkedListEvening<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public LinkedListEvening() {
		this.head = null;
		this.size = 0;
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
		
		if(index == 0) {  // adding new first thing
			adding.next = head;
			head = adding;
			
		} else {  // adding anywhere else
			Node<E> before= getNode(index - 1);
			//Node<E> after = before.next;
			adding.next = before.next;
			before.next = adding;
		}
		
		size++;
	}
	
	
	public E remove(int index) { 
		E toReturn = null;
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		
		
		if(index == 0) {
			toReturn  = head.item;
			head = head.next;
		} else {
			Node<E> before = getNode(index - 1);
			//Node<E> toRemove = before.next;
			toReturn = before.next.item;
			before.next = before.next.next;
			
			
		}
		
		size--;
		return toReturn;
	}
	
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append("[");
		Node<E> current = head;
		while(current.next != null) {
			output.append(current.item  + " ");
			current = current.next;
		}
		
		
		
		output.append(current.item + "]");
		return output.toString();
	}
	
	private  Node<E> getNode(int index) {  // O(n)
		if(index< 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> current = head;
		for(int i = 0;  i < index; i++ ) {
			current = current.next;
		}
		
		return current;
	}
	
	
	
	
	private static class Node<E>{
		private E item;
		private Node<E> next;
		
		public Node(E item) {
			this.item = item;
		}
	}
	
	public static void main(String[] args) {
		LinkedListEvening<Integer> list = new LinkedListEvening<Integer>();
		list.add(0, 1);
		list.add(0, 0);
		list.add(0, -12);
		list.add( 5);
		list.remove(0);
		list.remove(1);
		
		
		System.out.println(list);
	}
}
