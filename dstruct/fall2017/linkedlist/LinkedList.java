package linkedlist;

public class LinkedList<E> {
	private int size;
	private Node<E> head;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	
	
	public boolean add(E item) {
		add(size, item);
		return true;
	}



	public void add(int index, E item) {
		//index out of bounds 
		if(index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		Node<E> temp = new Node<E>(item);
		
		// adding a new head ( index 0)
		if(index == 0) {
			temp.next = head;
			head = temp;	
		} 
		// adding anywhere else
		else { 
			Node<E> node = getNode(index - 1);
			temp.next = node.next;
			node.next = temp;
		}
		
		
		size++;
	}
	
	public E remove(int index) {
		E retval = null;
		//  out of bounds
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		
		
		if(index == 0) { // removing the head
			retval = head.item;
			head = head.next;
			
		} else {
			Node<E> node =  getNode(index -1);
			retval = node.next.item;
			node.next = node.next.next;
		} // removing anywhere else
		
		
	
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
	
	public E get(int index) {
		return getNode(index).item;
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
		LinkedList<String> list = new LinkedList<String>();
		list.add(0, "Dick");
		list.add(0, "Tom");

		list.add(0, "Ann");
		list.add(2, "Joe");
		list.add("Andrew");
		System.out.println(list);
		System.out.println(list.getNode(0).item);
		System.out.println(list.getNode(1).item);
		System.out.println(list.getNode(2).item);
		//System.out.println(list.getNode(3).item);
	}
	
	
}
