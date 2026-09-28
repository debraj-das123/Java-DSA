package stack;

// implement stack using array

public class implementWithArray {
    int arr [] = new int[5];
    int top = -1;
    void push(int value){
        if(top == 4){
            System.out.println("Stack overflow");
            return ;
        }

        top++;
        arr[top] = value;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack under flow");
            return -1;
        }

        int value = arr[top];
        top--;
        return value;
    }

    void display(){
        for(int i = top; i >=0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        implementWithArray s = new implementWithArray();

        s.push(34);
        s.push(23);
        s.push(90);

       s.display();

       s.pop();

       s.display();

    }
}
