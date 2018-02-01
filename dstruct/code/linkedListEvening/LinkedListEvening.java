package linkedListEvening;

public class LinkedListEvening<E> {
	private Node<E> head;
	private int size;
	
	public LinkedListEvening() {
		this.head = null;
		this.size = 0;
	}
	
	
	public void add(int index, E item) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> temp = new Node<E>(item);
		
		if(index == 0) {  // adding new first thing
			temp.next = head;
			head = temp;
			
		} else {  // adding anywhere else
			Node<E> before= getNode(index - 1);
			//Node<E> after = before.next;
			temp.next = before.next;
			before.next = temp;
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
		list.add(0, 5);
		
		
		System.out.println(list);
	}
}
