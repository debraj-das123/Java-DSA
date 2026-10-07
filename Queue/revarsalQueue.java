package Queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revarsalQueue {

    static void reverseQueue(Queue<Integer> q) {

        // Create Stack
        Stack<Integer> stack = new Stack<>();

        // Queue -> Stack
        while (!q.isEmpty()) {
            int value = q.remove();
            stack.push(value);
        }

        // Stack -> Queue
        while (!stack.isEmpty()) {
            int value = stack.pop();
            q.add(value);
        }
    }

    public static void main(String[] args) {

        // Create Queue
        Queue<Integer> q = new LinkedList<>();

        // Add elements
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);

        System.out.println("Original Queue: " + q);

        // Reverse Queue
        reverseQueue(q);

        System.out.println("Reversed Queue: " + q);
    }
}
