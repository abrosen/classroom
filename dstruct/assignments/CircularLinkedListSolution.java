package circularlinkedlist;
import java.util.Iterator;

public class CircularLinkedListSolution<E> implements Iterable<E> {

	
	
	// Your variables
	// You can include a reference to a tail if you want
	Node<E> head;
	int size;  // BE SURE TO KEEP TRACK OF THE SIZE


	CircularLinkedListSolution() {
		head = null;
		size = 0;
	}


	CircularLinkedListSolution(Node<E> n) {
		head = n;
		head.next = head;
		size = 1;
	}

	// writing helper functions for add and remove, like the book did can help
	// but remember, the last element's next node will be the head!



	// attach a node to the end of the list
	// Be sure to handle the adding to an empty list
	// always returns true 
	public boolean add(E e) {
		return add(size, e);

	}

	
	// need to handle
	// out of bounds
	// empty list
	// adding to front
	// adding to middle
	// adding to "end"
	// REMEMBER TO INCREMENT THE SIZE
	public boolean add(int index, E e){
		
		if (index > size || index < 0) {
			return false;
		}
		
		
		
		Node<E> n = new Node<E>(e);
		
		if(size == 0 ){
			head =  n;
			n.next = head;
		} else {
			if(index == 0){
				n.next = head;
				getNode(size -1).next = n;
				head =  n;
			} else if(index == size) {
				n.next = head;
				getNode(size -1).next = n;
			} else {
				Node<E> prev = getNode( index -1);
				n.next = prev.next;
				prev.next= n;
			}
		}
		size++;
		return true;
	}

	
	// Return Node<E> found at the specified index
	// be sure to handle out of bounds cases
	private Node<E> getNode(int index ) {

		Node<E> node =  head;
		for(int i =0; i < index; i++) {
			node = node.next;
		}
		return node;
	}


	// Helper method
	private E removeAfter(Node<E> node){
		Node<E> temp =  node.next;
		node.next = node.next.next;
		size--;
		return temp.item;
	}

	
	
	// remove must handle the following cases
	// out of bounds
	// removing the only thing in the list
	// removing the first thing in the list (need to adjust the last thing in the list to point to the beginning)
	// removing the last thing (if you have a tail)
	// removing any other node.
	// REMEMBER TO DECREMENT THE SIZE
	public E remove(int index) {
		if(index < 0 || index >= size) {
			return null;
		}
		
		
		E val = null;
		
		if(index == 0 ) {
			Node<E> temp = head;
			val = temp.item;
			getNode(size -1).next =  head.next;
			head = head.next;
			size--;
		} else  {
			Node<E> prev = getNode(index - 1);
			val =  removeAfter(prev);
		}
		
		
		return val;
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
		// TODO Auto-generated method stub
		return new ListIterator<E>();
	}
	
	// provided code
	// you should not have to change this
	// change at your own risk!
	private class ListIterator<E> implements Iterator<E>{
		
		Node<E> nextItem;
		Node<E> prev;
		int index;
		
		@SuppressWarnings("unchecked")
		public ListIterator(){
			nextItem = (Node<E>) head;
			index = 0;
		}

		
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return size != 0;
		}

		public E next() {
			// TODO Auto-generated method stub
			prev =  nextItem;
			nextItem = nextItem.next;
			index =  (index + 1) % size;
			return prev.item;
	
		}
		
		// removed the last thing we had;
		public void remove() {
			int target;
			if(nextItem == head) {
				target = size - 1;
			} else{ 
				target = index - 1;
				index--;
			}
			CircularLinkedListSolution.this.remove(target); //calls the above class
		}
		
	}
	
	
	private static class Node<E>{
		E item;
		Node<E> next;
		
		public Node(E item) {
			this.item = item;
		}
		
	}
	
	// Solve the problem in the main method
	// The answer of n = 13,  k = 2 is 
	// the 11th person in the ring (index 10)
	public static void main(String[] args){
		CircularLinkedListSolution<Integer> l =  new CircularLinkedListSolution<Integer>();
		int n = 5;
		int k = 2;
		for(int i = 1; i <= n ; i++) {
			l.add(i);
		}
		
		
		
		Iterator<Integer> iter = l.iterator();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		while(l.size  != 1){
			for(int i = 0 ; i < k; i++) {
				iter.next();
				
			}
			iter.remove();
			System.out.println(l);
		}
		
		
		
		/*
		
		int currentIndex = -1;
		while(l.size  != 1){
			for(int i = 0 ; i < k; i++) {
				currentIndex = (currentIndex + 1) % l.size;
				
			}
			l.remove(currentIndex);
			currentIndex--;
			System.out.println(l);
		}*/
		
		
	}



	
}
