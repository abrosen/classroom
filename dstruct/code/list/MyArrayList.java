package list;

import java.util.List;

import cern.colt.Arrays;

public class MyArrayList<E> {
	
	private int size;
	private int capacity;
	public static final int INITIAL_CAPACITY =10;
	private E[] data;
	
	public MyArrayList() {
		this.size = 0;
		this.data = (E[]) new Object[INITIAL_CAPACITY];
		this.capacity =  INITIAL_CAPACITY;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	

	public E get(int index) {
		
		if(index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		
		E item = data[index];
		return item;
	}
	
	
	// replaces thing at index with item
	// returns the thing being replaced
	public E set(int index, E item) {
		if(index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		
		E prevItem = data[index];
		data[index] = item;
		
		return prevItem;
	}
	
	
	
	public boolean add(E item) {
		this.add(this.size,  item);
		return true;
	}
	
	public void add(int index, E item) {
		if(index < 0 || index > this.size ) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		if(size == capacity) {  // if size is too small to hold new item
			reallocate();
		}
	
		// what about the other indexes
		
		data[index] = item;
		
		size++;
	}
	

	public boolean contains(E item) {
		return false;
	}
	
	public int indexOf(E item) {
		return -1;
		
	}
	
	public E remove(int index) { 
		return null;
	}
	
	
	private void reallocate() { //doubles the capacity
		E[] oldData = data;
		this.capacity *= 2;
		data = (E[]) new Object[capacity];
		
		for(int i = 0 ; i < size; i++) {
			data[i] = oldData[i];
		}
		
	}

	public String toString() {
		//return Arrays.toString(this.data);
		
		String output = "[";
		for(int i = 0; i < this.size -1; i++) {
			output = output +  this.data[i] +", ";
		}
		return  output + this.data[size - 1] + "]";
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList<String> list = new MyArrayList<String>();
		
		for(int i = 0; i< 1000; i++) {
			list.add(0 ,i + "");
			System.out.println(list);
		}
	}

}
