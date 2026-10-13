package stack;

public class reverseArray {
    int arr[] = new int[5];
    int top =-1;

    // push
    void push(int value){
        if(top == arr.length-1){
            System.out.println("stack overflow");
            return ;
        }

        top++;
        arr[top] = value;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stcak underflow");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }

    public static void main(String[] args) {
        int array[] = {23,45,56,12,45};

        reverseArray s = new reverseArray();

        //push all element 
        for(int i =0; i<array.length; i++){
            s.push(array[i]);
        }

        // pop
    
        for(int i =0; i< array.length; i++){
          array[i] = s.pop();
        }

        System.out.println("print reverse array: ");
        for(int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    

    }
}
