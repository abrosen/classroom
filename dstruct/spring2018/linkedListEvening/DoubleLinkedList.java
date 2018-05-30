package linkedListEvening;


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
		if(index< 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}

		Node<E> adding = new Node<E>(item);
		
		if(size == 0) {
			this.head = adding;
			this.tail = adding;
			
		}
		else if(index == 0 ) {  // new Head
			adding.next = head;
			head.prev = adding;
			head = adding;
		}
		else if(index == size){  // new tail;
			adding.prev = tail;
			tail.next = adding;
			tail = adding;
		}
		else {  //everything
			Node<E> before =  getNode(index - 1);
			adding.next = before.next;
			adding.prev = before;
			before.next = adding;
			adding.next.prev = adding;
		}

		size++;

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


	
	public E remove(int index) {
		E toReturn = null;
		if(index< 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		if(size == 1) {
			toReturn = head.item;
			this.head = null;
			this.tail = null;
		} else if( index == 0 ) {
			toReturn = head.item;
			head  = head.next;
			head.prev = null;
		} else if( index == size -1) {
			toReturn = tail.item;
			tail = tail.prev;
			tail.next = null;
		} else {
			Node<E> before  = getNode(index -1);
			toReturn = before.next.item;
			before.next = before.next.next;
			before.next.prev = before;
		}
		
		
		size--;
		return toReturn;
	}

	public E get(int index) {
		Node<E> node = this.getNode(index);
		return node.item;
	}
	

	private static class Node<E> {
		private E item;
		private Node<E> next;
		private Node<E> prev;


		public Node(E item) {
			this.item = item;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList<Integer> l =  new DoubleLinkedList<Integer>();
		for(int i = 0 ; i < 5; i++) {
			l.add(0,i);
		}
		l.add(2,100);
		l.remove(2);
		l.remove(4);
		System.out.println(l);

	}

}
