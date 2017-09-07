package review;

import java.util.Arrays;

public class TarList<E> {

	private E[] list;
	private int capacity; 	// how many things we can hold
	private int size;   	// actual number of things
	private static final int INITIAL_CAPACITY = 10;
	
	public TarList() {
		this(INITIAL_CAPACITY);
	}
	
	public TarList(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		list =  (E[]) new Object[capacity];
		
	}
	
	private void reallocate() {
		capacity *= 2;
		
		E[] newList =  (E[]) new Object[capacity];
		for(int i = 0 ; i < size; i++) {
			newList[i] =  this.list[i];
		}
		this.list = newList;
		
		//list =  Arrays.copyOf(list, capacity);
	}
	
}
