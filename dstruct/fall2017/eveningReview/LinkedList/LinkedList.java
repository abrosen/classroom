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
		}else { // 3) adding to any other index; 
			Node<E> node  =  getNode(index -1);
			temp.next = node.next;
			node.next = temp;
		}
		
		size++;
	}
	
	public E remove(int index) {
		E retval = null;
		// 1) Index is out of bounds
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		
		// removing the head
		if(index == 0) {
			retval = head.item;
			head = head.next;
		} else { // removing any other index
			Node<E> node =  getNode(index - 1);
			retval  =  node.next.item;
			node.next = node.next.next;	
		}
		
		size--;
		return retval;
	}
	
	public int size() {
		return size;
	}
	
	
	public Node<E> getNode(int index){
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		
		Node<E> current = head;
		for(int i = 0; i< index ; i++ ) {
			current = current.next;
		}
		return current;
	}
	
	
	public String toString() {
		String output  = "[ ";
		Node<E> current = head;
		while(current != null) {
			output = output + current.item + " ";
			current = current.next;
		}
			
		
		return  output + " ]";
		
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add(0, "Dan");
		list.add(0, "Carl");
		list.add(0, "Bob");
		list.add(0, "Ann");
		list.add("Fred");
		list.add(list.size() -1, "Edward");
		
		System.out.println(list);
		
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove(3));
		System.out.println(list);
		System.out.println((list.remove(list.size()-1)));
		System.out.println(list);
	}
	
	
	
}
