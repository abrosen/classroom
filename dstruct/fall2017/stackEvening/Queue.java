package stackEvening;

public class Queue<E> {
	Node<E> front;
	Node<E> back;
	
	public boolean empty() {
		return front == null;
	}
	
	public E peek() {
		return front.item;
	}
	
	public void enqueue(E item) {
		Node<E> temp = new Node<E>(item);
		if(this.empty()) {
			front = temp;
			back  = temp;
		} else {
			back.next = temp;
			back = temp;
		}
	}
	
	public E dequeue() {  // or poll
		E retval = front.item;
		if(front == back) {
			front = null;
			back = null;
		} else {
			front = front.next;
		}
		return retval;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new Queue<Integer>();
		for(int i = 1 ; i <= 5; i++) {
			q.enqueue(i);
		}
		
		while(!q.empty()) {
			System.out.println(q.dequeue());
		}

	}

	
	
	
	
	
	
	
}
