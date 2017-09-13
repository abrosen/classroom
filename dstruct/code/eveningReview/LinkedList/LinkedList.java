package eveningReview.LinkedList;

public class LinkedList<E> {
	
	Node<E> head;
	private int size;
	
	public LinkedList() {
		size = 0;
		this.head = null;
	}
	
	public boolean add(E item) {
		add(size, item);
		return true;
	}
	
	
	public void add(int index, E item) {
		// 1) Index is out of bounds
		if(index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		
		Node<E> temp =  new Node<E>(item);
		// 2) adding to the head  (inserting this item to index 0)
		if(index == 0) {
			temp.next = head;
			head  =  temp;
			
		}
		
		
		// 3) adding to any other index;
		
		
		size++;
	}
	
	public int size() {
		return size;
	}
}
