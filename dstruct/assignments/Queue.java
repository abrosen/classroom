/*
 * Implement a reference based queue
 */
public class Queue<E> {
	
	private Node<E> front;
	private Node<E> back;

	public Queue() {
		this.front = null;
		this.back  = null;
	}
	
	
	/*
	 * places element in the back of the Queue
	 */
	public void enqueue(E element){
		
		//Fill in
	}
	
	/*
	 * remove the front node of the queue and return it
	 */
	public E dequeue(){
		//Fill in;
		return null; //replace
	}
	
	/*
	 * Look at the front of the queue and return it, without removing
	 */
	public E peek(){
		//Fill in;
		return null; //replace
	}
	
	public boolean empty(){
		return false;  //replace
	}

}
