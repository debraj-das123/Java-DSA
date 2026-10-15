package stack;

import java.util.Arrays;

/*
   Input:
[73, 74, 75, 71, 69, 72, 76, 73]

Output:
[1, 1, 4, 2, 1, 1, 0, 0]

*/
public class DailyTempature {
    public static int [] tempature(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int stack[] = new int[n];
        int top =-1;
        for(int i =0; i<n; i++){
            while (top != -1 && arr[i] > arr[stack[top]]) {
                int pre = stack[top];
                top--;
                ans[pre] = i -pre;
                
            }
            top++;
            arr[top] = i;
        }

        return ans;
    }
    public static void main(String[] args) {
    int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};

    int[] result = tempature(arr);

    System.out.println(Arrays.toString(result));
}
}
