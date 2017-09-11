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
	
	public int size() {
		return size;
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
	
	
	public boolean add(E item) {
		this.add(size, item);
		return true;
	}
	
	
	public void add(int index, E item) {
		// check if index is valid
		if(index < 0 ||  index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		
		// check if we need to reallocate
		// IE do we have space for the item
		if(size >= capacity) {
			reallocate();
		}
		
		
		// shift items
		for(int i = size - 1 ;  i >= index ; i--) {
			list[i + 1] =  list[i];
		}
		
		
		// add the item to index
		list[index] = item;
		
		// increment the size
		size++;
	}
	
	public E get(int index) {
		if(index < 0  || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return list[index];
		
	}
	
	public E set(int index, E item) {
		if(index < 0  || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		E retval =  list[index];
		list[index] = item;
		return retval;
		
	}
	
	
	public E remove(int index) {
		// check for valid index
		if(index < 0  || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		// get the value
		E retval =  list[index];
		
		// shift items
		for(int i = index; i<size-1; i++) {
			list[i]  =  list[i+1];
		}
		
			
		size--;
	
		//return value
		return retval;
	}
	
	public String toString() {
		
		String retval = "[";
		for(int i = 0; i < size; i++) {
			retval  = retval + list[i]+ ", ";
		}
		
		
		return retval + "]";
	}
	
	
	
	public static void main(String[] args) {
		
		TarList<String>  list =  new TarList<String>();
		for(int i  = 0; i < 50; i++) {
			 String item =  i + "";
			 list.add(item);
		}
		
		for(int i = 0; i<25; i++) {
			list.remove(list.size() -1);
		}
		
		
		
		
		/*
		for(int i  = 50; i >= 0; i--) {
			 char c = (char) (97 + 25 - i);
			 
			 list.add(i ,  c+ "" );
		}
	
		*/
		
		
		System.out.println(list);
		
	}
	
	
}
