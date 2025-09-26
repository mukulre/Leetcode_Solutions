import java.util.Stack;


public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty or top element doesn’t match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // If stack is empty after processing, it's balanced
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String input1 = "{[()]}{}}}}";
        String input2 = "{[(])}){[])}";


        System.out.println("Is \"" + input1 + "\" valid? " + isValid(input1)); // true
        System.out.println("Is \"" + input2 + "\" valid? " + isValid(input2)); // false
    }
}