package stack;

import java.util.Stack;

public class firstProgram {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();

        stack.push(23);
        stack.push(2);
        stack.push(256);

        System.out.println("Stack : " + stack);
        System.out.println("Top element : " + stack.peek());
        System.out.println("one element remove: " + stack.pop());
        System.out.println("stack after pop : " + stack);
        System.out.println("Check empty of not: " + stack.isEmpty());


    }
}
