package stackEvening;

import java.util.Stack;

public class ParenMatching {

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for(Character c : expression.toCharArray()) {
			if(c == '(' || c == '[' || c == '{' ) {
				stack.push(c);
			} else if(c == ')' || c == ']' || c == '}' ) {
				if(stack.empty()) {
					return false;
				}
				
				char top = stack.pop();
				if(c== ')' && top != '(' ) {
					return false;
				} else if(c== '}' && top != '{' ) {
					return false;
				} else if(c== ']' && top != '[' ) {
					return false;
				}
			} else {
				continue;
			}
		}		
		if(!stack.empty()) {
			return false;
		}
		
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(isBalanced("(a[0]+b[1 + a[(1*2)]] )"));
	}

}
