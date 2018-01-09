package eveningReview;

public class TarList<E> {
	
	private E[] list;
	private int size;
	private static int INITIAL_CAPICITY = 10;
	
	public TarList() {
		list = (E[]) new Object[INITIAL_CAPICITY];
	}
	
	public TarList(int capcity) {
		list = (E[]) new Object[capcity];
	}
	
	
	private void reallocate() {
		E[] oldList = list;
		list = (E[]) new Object[list.length * 2];
		for(int i = 0; i < oldList.length; i++) {
			this.list[i] = oldList[i];
		}
	}
	public boolean add(E item) {
		this.add(size, item);
		return true;
	}
	
	
	public void add(int index, E item) {
		// check to see if index is valid
 		if(index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		// check to see if we need to grow
		if(this.capacity() <= this.size) {
			this.reallocate();
		}
		
		// shift items 
		for(int i = size ; i  > index  ; i--)  {
			list[i] = list[i-1];
		}
		
		
		// insert item
		list[index] = item;
		
		// increment size
		size++;
	}
	
	
	public E remove(int index) {
		// valid index
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		// grab the value we remove
		E oldItem = this.list[index];
		// shift items
		for(int i = index; i < size -1  ;  i++) {
			list[i] = list[i + 1];
		}
		
		// decrement size
		size--;
		
		// return 
		return oldItem;
	}
	
	
	public E get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return list[index];
	}
	
	
	public E set(int index, E item) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E oldItem   = list[index]; 
		list[index]  = item;
		
		return oldItem;
	}
	
	
	
	
	public int indexOf(E thing) {

		for(int i = 0 ; i < this.size; i++) {
			if( list[i].equals(thing)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int size() {
		return size;
	}
	
	private int capacity() {
		return list.length;
	}
	
	public String toString() {
		String output = "[";
		for(int i = 0 ; i < size;i++ ) {
			output =  output + " "  + list[i].toString();
		}
		return output + "]";
	}
	
	public static void main(String[] arg) {
		TarList<String> l =  new TarList<String>();
		System.out.println(l);
		l.add("A");
		l.add("b");
		for(int i = 0; i < 50; i++) {
			l.add(0 , "" + i);
		}
		System.out.println(l);
		l.remove(1);
		l.remove(1);
		l.remove(1);
		l.remove(1);
		l.remove(1);
		l.remove(0);
		l.remove(l.size()-2);
		
		
		System.out.println(l);
		
		for(int i =0 ; i < l.size(); i++) {
			System.out.println( l.get(i));
			l.set(i, i + "");
		}
		System.out.println(l);
	}

}
