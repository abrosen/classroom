package circularlinkedlist;
import java.util.Iterator;

public class CircularLinkedList<E> implements Iterable<E> {

	
	
	// Your variables
	Node<E> head;
	Node<E> tail;
	int size;  // BE SURE TO KEEP TRACK OF THE SIZE

	
	// implement this constructor
	
	public CircularLinkedList() {
	}


	// I highly recommend using this helper method
	// Return Node<E> found at the specified index
	// be sure to handle out of bounds cases
	private Node<E> getNode(int index ) {

		return null;
	}


	// attach a node to the end of the list
	public boolean add(E item) {
		this.add(size,item);
		return false;

	}

	
	// Cases to handle
	// out of bounds
	// adding to empty list
	// adding to front
	// adding to "end"
	// adding anywhere else
	// REMEMBER TO INCREMENT THE SIZE
	public void add(int index, E item){

	}

	

	
	
	// remove must handle the following cases
	// out of bounds
	// removing the only thing in the list
	// removing the first thing in the list (need to adjust the last thing in the list to point to the beginning)
	// removing the last thing 
	// removing any other node
	// REMEMBER TO DECREMENT THE SIZE
	public E remove(int index) {
		return null;
	}
	
	
	
	
	// Turns your list into a string
	// Useful for debugging
	public String toString(){
		Node<E> current =  head;
		StringBuilder result = new StringBuilder();
		if(size == 0){
			return "";
		}
		if(size == 1) {
			return head.item.toString();
			
		}
		else{
			do{
				result.append(current.item);
				result.append(" ==> ");
				current = current.next;
			} while(current != head);
		}
		return result.toString();
	}
	
	
	public Iterator<E> iterator() {
		return new ListIterator<E>();
	}
	
	// provided code for different assignment
	// you should not have to change this
	// change at your own risk!
	// this class is not static because it needs the class it's inside of to survive!
	private class ListIterator<E> implements Iterator<E>{
		
		Node<E> nextItem;
		Node<E> prev;
		int index;
		
		@SuppressWarnings("unchecked")
		//Creates a new iterator that starts at the head of the list
		public ListIterator(){
			nextItem = (Node<E>) head;
			index = 0;
		}

		// returns true if there is a next node
		// this is always should return true if the list has something in it
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return size != 0;
		}
		
		// advances the iterator to the next item
		// handles wrapping around back to the head automatically for you
		public E next() {
			// TODO Auto-generated method stub
			prev =  nextItem;
			nextItem = nextItem.next;
			index =  (index + 1) % size;
			return prev.item;
	
		}
		
		// removed the last node was visted by the .next() call 
		// for example if we had just created a iterator
		// the following calls would remove the item at index 1 (the second person in the ring)
		// next() next() remove()
		public void remove() {
			int target;
			if(nextItem == head) {
				target = size - 1;
			} else{ 
				target = index - 1;
				index--;
			}
			CircularLinkedList.this.remove(target); //calls the above class
		}
		
	}
	
	// It's easiest if you keep it a singly linked list
	// SO DON'T CHANGE IT UNLESS YOU WANT TO MAKE IT HARDER
	private static class Node<E>{
		E item;
		Node<E> next;
		
		public Node(E item) {
			this.item = item;
		}
		
	}
	
	public static void main(String[] args){
		
		
		
		
		
		
	}



	
	
}
