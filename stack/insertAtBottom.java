package stack;

import java.util.Stack;

public class insertAtBottom {
    public static void insert(Stack<Integer> st, int value){
        Stack<Integer> temp = new Stack<>();

        // stcak1 -> stcak 2
        while (!st.isEmpty()) {
            temp.push(st.pop());
            
        }

        // insert
        st.push(value);

        // stack2 -> stcak1

        while (!temp.isEmpty()) {
            st.push(temp.pop());
            
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Stack 1: " + st);

        insert(st, 55);
        System.out.println("After inser element : " + st);

    }
}
