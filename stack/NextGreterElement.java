package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreterElement {
    public static int[] nextgreatestElemet(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();


        for(int i =0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] <arr[i]){
                int index = st.pop();
                ans[index] = arr[i];
            }

            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};

        int[] result = nextgreatestElemet(arr);

        System.out.println(Arrays.toString(result));
    }
}
