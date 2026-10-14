package stack;

import java.util.Stack;

/*
    arr = {2,3,5,-4,6,-2,-8,9}
    output = {2,9}

    two oposite sign element can not exixt array

*/
public class MakeBeautifullArray {
    public static int [] beautifull(int arr[]){
        Stack<Integer> s = new Stack<>();

        for(int i =0; i<arr.length; i++){
            if(s.isEmpty()){
                s.push(arr[i]);
            }
            else if(arr[i] >= 0){
                if(s.peek() >= 0){
                    s.push(arr[i]);
                }
                else{
                    s.pop();
                }


            }
            else{
                if(s.peek() <0){
                    s.push(arr[i]);
                }
                else{
                    s.pop();
                }
            }
          
        }

        int ans[] = new int[s.size()];
        int i = ans.length-1;
        while (!s.isEmpty()) {
            ans[i] = s.peek();
            i--;
            s.pop();
            
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,-4,6,-2,-8,9};

        System.out.println("Befor beautifull");
        for(int num: arr){
            System.out.print( num + " ");
        }
        System.out.println();
        int result[] = beautifull(arr);

        System.out.println("after beautifull");
        for(int num: result){
            System.out.print(num + " ");
        }
    }
}
