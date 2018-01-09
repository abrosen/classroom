package stackEvening;

public class Stack<E> {
	Node<E> top;

	
	public boolean empty() {
		return top == null; 
	}
	
	public E peek() {
		return top.item;
	}
	
	public void push(E item) {
		Node<E> temp  = new Node<E>(item);
		temp.next = top;
		top = temp;
	}
	
	public E pop() {
		E retval = top.item;
		top = top.next;
		return  retval;
	}
	
	public static void a(int x) {
		System.out.println(x);
		a(x+1);
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 1; i <= 5; i++) {
			s.push(i);
		}
		
		while(!s.empty()){
			System.out.println(s.pop());
		}
		
	}
}

