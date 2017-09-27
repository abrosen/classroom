package exam;


public class DLinkedList<E> {

	private int size;
	private Node<E> head;
	private Node<E> tail;
	
	
	public int size() {
		return size;
	}
	
	
	
	private Node<E> getNode(int index){
		if(index < 0 || index >= size) {
			throw new RuntimeException();
		}
		
		Node<E> found = null;
		
		Node<E> current = head;
		for(int i = 0; i < index;i++) {
			current = current.next;
		}
		
		found = current;
		
		
		return found;
	}
	
	
	
	public void add(int index, E item)  {
		
		// if index is out of bounds X
		if(index < 0 || index > size) {
			throw new RuntimeException();
		}
		
		
		Node<E> temp = new Node<E>(item);
		
		// if adding to empty list
		if( size == 0 ) {
			head = temp;
			tail = temp;
		}
		
		
		// if adding new head X
		else if(index == 0) {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
		
		
		// if adding new tail
		else if(index == size) {
			temp.prev = tail;
			tail.next = temp;
			tail = temp;
		}
		
		
		// every other case X
		else {
			Node<E> node = getNode(index -1);
			temp.next = node.next;
			temp.prev = node;
			node.next.prev = temp;
			node.next = temp;
		}
		size++;
	}
	
	
	
	// removes the element and node at index
	// returns the item contained in the list at that index
	public E remove(int index) {
E retval = null;
		
		// out of bounds X
		if (index < 0  || index >= size ) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		// removing would make list empty
		if(size == 1) {
			retval = head.item;
			head = null;
			tail = null;
		}
		
		// removing the head X
		else if(index == 0) {
			retval = head.item;
			head = head.next;
			head.prev = null;
		}
		
		// removing the tail
		else if(index == size - 1) {
			retval = tail.item;
			tail = tail.prev;
			tail.next = null;
		}
		// removing anywhere else X
		else {
			Node<E> node =  getNode(index -1);
			retval = node.next.item;
			node.next.next.prev=node;
			node.next = node.next.next;
			
		}
		size--;
		return retval;
		
	}
}
