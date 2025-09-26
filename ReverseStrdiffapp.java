import java.util.Stack;

public class ReverseStrdiffapp {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        
        // Push each character onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();

        // Pop each character and append to the result
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Hello";
        String reversed = reverseString(original);
        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}