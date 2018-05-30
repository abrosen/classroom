package arraylistEvening;

import java.util.Arrays;

public class MyArrayList<E> {
	private E[] data;
	private int size;
	private int capacity;
	public static final int INITIAL_CAPACITY = 10;
	
	public MyArrayList() {
		this.capacity = INITIAL_CAPACITY;
		this.size = 0;
		this.data = (E[]) new Object[INITIAL_CAPACITY];
	}
	
	public int size() {  // O(1)
		return this.size;
	}
	
	public boolean isEmpty() {  //O(1)
		return this.size == 0;
	}
	
	
	public boolean add(E item) {
		add(this.size, item);
		return true;
	}
	
	public void add(int index, E item) {
		if(index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException("ur an idiot.");
		}

		if(size == capacity) {  //  O(n)
			reallocate();
		}
		
		for(int i = this.size -1;  i >= index ; i--) { // O(n)
			data[i+1] = data[i];
		}
		
		
		this.data[index] = item;
		
		size++;
	}
	
	private void reallocate() {  //O(n)
		this.capacity *= 2;
		E[] oldData = this.data;
		this.data = (E[]) new Object[capacity];
		for(int i = 0; i <size;i++) {
			data[i] = oldData[i];
		}
		
	}

	public E get(int index) {  //O(1_
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
	
		return data[index];
	}
	
	public E set(int index,  E newItem ) {  //  O(1)
		if(index <0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		E oldItem = data[index];
		data[index] = newItem;
		return oldItem;
	}
	
	public E remove(int index) {  // O(n)
		if(index < 0 ||index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for(int i = index ; i < size - 1;i++) {
			data[i] = data[i+1];
		}
		
		E removed = data[index];
		size--;
		return removed;
	}
	
	
	public int indexOf(E item) {
		for(int i = 0; i < size;i++) {
			if(data[i].equals(item)) {
				return i;
			}
		}
		return -1;
		
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
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		for(int i =0; i < 1000; i++) {
			list.add(i);
			//
		}
		System.out.println(list);
		for(int i = 0; i< 100; i++) {
			list.remove(0);
		}
		System.out.println(list.indexOf(100));
	}

}
