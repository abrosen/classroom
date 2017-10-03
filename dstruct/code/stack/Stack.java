package stack;

public class Stack<E> {
	Node<E> top;
	
	
	public boolean empty() {
		return top == null;
	}
	
	
	public void push(E item) {
		Node<E> temp  = new Node(item);
		temp.next = top;
		top = temp;
	}
	
	public E peek() {
		return top.item;
	}
	
	public E pop() {
		E retval =  top.item;
		top = top.next;
		return retval;
	}
	
	public static  void main(String[] args) {
		Stack<Integer> s =  new Stack<>();
		for(int i = 1; i <= 5; i++) {
			s.push(i);
		}
		
		while(!s.empty()) {
			System.out.println(s.pop());
		}
		
	}
	
	
}
