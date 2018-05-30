package linkedList;


public class DoubleLinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public DoubleLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean add(E item) {
		this.add(size, item);
		return true;
	}
	
	
	
	public void add(int index, E item) {
		// Out of bounds 
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> adding = new Node<E>(item); 
		
		// adding first item to empty list
		if(size == 0) {
			this.head = adding;
			this.tail = adding;
		}
		else if(index == 0) { // adding new head
			adding.next = head;
			head.prev = adding;
			head = adding;
			
		}
		else if(index == size) { // adding new tail
			adding.prev = tail;
			tail.next =  adding;
			tail = adding;
		}
		else {// everything else
			Node<E> before  = this.getNode(index - 1);
			adding.next = before.next;
			adding.prev = before;
			before.next.prev =  adding;
			before.next = adding;
		}
		size++;
	}

	
	public E remove(int index) {
		E toReturn = null;
		if(index < 0  || index  >=size) {
			throw new IndexOutOfBoundsException();
		}
		
		
		if(size == 1) {
			toReturn = head.item;
			head = null;
			tail = null;
		} else if(index == 0) {
			toReturn = head.item;
			head = head.next;
			head.prev = null;
		} else if(index == size -1) {
			toReturn = tail.item;
			tail = tail.prev;
			tail.next = null;
		} else {
			
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
	
	
	public E get(int index) {
		//Node<E> targetNode = getNode(index);
		return getNode(index).item;
	}
	
	
	public E set(int index, E newItem) {
		E oldItem = null;
		Node<E> targetNode = getNode(index);
		oldItem = targetNode.item;
		targetNode.item  =newItem;
		return oldItem;
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
	
	
	
	
	
	
	private static class Node<E> {
		private E item;
		Node<E>   next;
		Node<E>   prev;
		
		public Node(E item) {
			this.item = item;
		}
		
	}
	
	public static void main(String[] args) {
		DoubleLinkedList<Integer> l  = new DoubleLinkedList<Integer>();
		l.add(1);
		l.add(0,0);
		l.add(2,3);
		l.add(2,2);
		System.out.println(l);
		
	}
	
}
