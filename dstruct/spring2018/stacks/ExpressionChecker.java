package stacks;

public class ExpressionChecker {

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for(Character c : expression.toCharArray()) {
			if(c == '('  || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')'  || c == '}' || c == ']') {
				if(stack.empty()) {
					return false;
				} 
				char top = stack.pop();
				
				if( c == ')'  && top != '(' ) {
					return false;
				} else  if( c == '}'  && top != '{' ) {
					return false;
				} else if( c == ']'  && top != '[' ) {
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
		// TODO Auto-generated method stub
		String expr = "(a[ a[i] + Math.pow((y*2), a[0]) ] +b)";
		System.out.println(isBalanced(expr));
	}

}
