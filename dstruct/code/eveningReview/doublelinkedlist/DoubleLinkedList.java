package eveningReview.doublelinkedlist;

public class DoubleLinkedList<E> {
	private int size;
	private Node<E> head;
	private Node<E> tail;
	
	
	public DoubleLinkedList() {
		size =0;
		head = null;
		tail = head;
	}
	
	
	public int size() {
		return size;
	}
	
	public boolean add(E item) {
		this.add(size, item);
		return true;
	}
	
	public void add(int index, E item) {
		// out of bounds
		if(index < 0 || index > size) {
			System.err.println("My hovercraft is full of eels.");
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		Node<E> temp = new Node<E>(item);
		
		// adding to an empty list
		if(this.size == 0 ) {
			head = temp;
			tail = temp;
		} else if(index == 0) { // adding a new head
			temp.next = head;
			head.prev = temp;
			head = temp;
		} else if(index == size ) { // adding new tail
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}else { // all other cases
			Node<E> node =  getNode(index -1);
			temp.next = node.next;
			temp.prev = node;
			node.next.prev = temp;
			node.next = temp;
		}
		
		size++;
	}
	
	public E remove(int index) {
		E retval = null;
		
		// out of bounds
		if(index < 0 || index >= size) {
			System.err.println("My hovercraft is full of eels.");
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		
		// removing will result in an empty list
		if(size == 1) {
			retval = head.item;
			head = null;
			tail = null;
		} else if(index == 0) { // removing the head
			retval =  head.item;
			head = head.next;
			head.prev = null;
			
		} else if(index == size-1) { // removing the tail
			retval = tail.item;
			tail = tail.prev;
			tail.next = null;
			
		} else { // removing any other node
			Node<E> node = getNode(index -1);
			retval = node.next.item;
			node.next.next.prev = node;
			node.next= node.next.next;
			
		}
		
		
		
		
		
		size--;
		return retval;
	}
	
	
	private Node<E> getNode(int index){
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		Node<E> current = head;
		for(int i = 0 ; i < index; i++) {
			current = current.next;
		}
		return current;
		
	}	
	
	public String toString() {
		String  retval = "[ ";
		Node<E> current = head;
		
		while(current != null) {
			retval =  retval + current.item.toString() +" ";
			current = current.next;
		}
		
		
		return retval + "]";
		
	}
	
	public static void main(String[] args) {
		DoubleLinkedList<String> list =  new DoubleLinkedList<String>();
		list.add("foo");
		list.add(0,"Foo");
		list.add("bar");
		list.add(1,"a");
		list.add(1, "aa");
		list.add(2, "b");
		list.add(3, "c");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		list.remove(list.size -1);
		System.out.println(list);

		list.remove(list.size -1);
		System.out.println(list);

		list.remove(list.size -1);
		System.out.println(list);

		list.remove(list.size -1);
		System.out.println(list);
		
		
	}
} 
