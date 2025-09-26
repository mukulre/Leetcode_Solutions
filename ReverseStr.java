import java.util.Stack;

class ReverseStr {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) result.append(stack.pop());
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
}