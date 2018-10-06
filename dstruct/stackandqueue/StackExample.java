package stackandqueue;


import java.util.Scanner;

public class StackExample {



    //
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (Character c : expression.toCharArray()) {
            if(c == '(' || c=='[' || c == '{' ) {
                stack.push(c);

            } else if( c== ')' || c== ']' || c == '}') {
                if(stack.isEmpty()){
                    return false;
                }
                char opener = stack.pop();
                if( !((opener=='(' && c==')') || (opener=='[' && c==']') || (opener=='{' && c=='}'))){
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }






    public static boolean isPalindrome(String word) {
        Stack<Character> stack =  new Stack<>();
        for (Character c : word.toCharArray()) {
            if(Character.isAlphabetic(c) ) {
                stack.push(c);
            }
        }

        for (int i = 0; i < word.length(); i++) {

            if(Character.isAlphabetic(word.charAt(i))){
                char c =  stack.pop();
                if(c != word.charAt(i)){
                    return false;
                }
            }

        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("a man, a plan, a canal, panama"));
        System.out.println(isBalanced("(a+b)(c*d)(f[a(x)]+c{})"));
    }
}
