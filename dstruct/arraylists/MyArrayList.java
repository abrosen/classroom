package arraylists;

public class MyArrayList<E> {

    private int size;  // how many items are in the list
    private int capacity;  // how many items the underlying array can hold
    private E[] theData;

    public MyArrayList(){
        size = 0;
        capacity = 10;
        theData = (E[]) new Object[10];
    }


    public int size() {  // O(1)
        return size;
    }


    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean add(E item) {
        this.add(size, item);
        return true;
    }


    public void add(int index, E item) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " +index+ " was out of bounds. What are you doing???");
        }

        if(size == capacity) {  // O(n) time...sometimes.  Amortized over the cost of adding
            this.reallocate();
        }

        for(int i = size - 1; i >= index; i--) { //If adding to the end... constant
            E temp = theData[i];
            theData[i+1] = temp;
        }

        theData[index] = item;
        size++;
    }

    private void reallocate(){
        //doubles or 1.5x capacity
        //don't do +1 capacity
        capacity = 2 * capacity;
        
        E[] newData = (E[]) new Object[capacity];
        for(int i = 0; i < theData.length; i++) {
            newData[i] =  theData[i];
        }

        theData = newData;
        

    }



    public E remove(int index) {
        if(index  < 0 || index >= size) {
            throw new IndexOutOfBoundsException("WE ALREADY WENT OVER THIS! IT'S OUT OF BOUNDS!!!");
        }
        E item =  theData[index];

        for(int i = index  + 1; i < size; i++) {  //O(n), unless we remove last item in the list
            theData[i-1] =  theData[i];
        }

        size--;
        return item;
    }

    public E get(int index) {
        if(index  < 0 || index >= size) {
            throw new IndexOutOfBoundsException("WE ALREADY WENT OVER THIS! IT'S OUT OF BOUNDS!!!");
        }
        return theData[index];
    }


    public E set(int index, E item) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("WE ALREADY DID THIS JOKE!");
        }
        E oldItem  = theData[index];
        theData[index] = item;

        return oldItem;
    }

    public int indexOf(E item) {
        for (int i = 0; i < size; i++) {
            if(item.equals(theData[i])){
                return i;
            }
        }
        return -1;
    }


    public boolean contains(E item) {
        for (int i = 0; i < size; i++) {
            if(item.equals(theData[i])){
                return true;
            }
        }
        return false;
    }


    public String toString(){
        String output = "["+theData[0];
        for (int i = 1; i < size; i++) {
            output+= ", " + theData[i];
        }


       return output + "]";
    }


    public static void main(String[] args) {
        MyArrayList<Integer>  list =  new MyArrayList<Integer>();
        for(int i = 0 ; i < 5; i++){
            list.add(i);
            System.out.println(list);
        }
        list.remove(1);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
    }

}
