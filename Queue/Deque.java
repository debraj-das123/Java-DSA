package Queue;

class DEQUEUE{
    int front;
    int rear;
    int arr[];
    int n;

    DEQUEUE(int n){
        this.n = n;
        front = -1;
        rear = -1;
        arr = new int[n];
    }

    boolean isEmpty(){
        return front == -1;
    }

    boolean isFull(){
        return front == (rear +1)%n;
    }

    void isertFront(int value){
        if(isFull()){
            System.out.println(" Dequeu is full");
        }

        if(isEmpty()){
            front = rear = 0;
        }
        else{
            front = (front -1 + n)%n;
        }
        arr[front] = value;
    }

    void isertRear(int value){
        if(isFull()){
            System.out.println(" Dequeu is full");
        }
        if(isEmpty()){
            front = rear = 0;
        }
        else{
            rear = (rear +1)%n;
        }

        arr[rear] = value;
    }

    void deletefront(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return ;
        }
        System.out.println(" delete element : "+ arr[front]);

        if(front == rear ){
            front = rear = -1;
        }
        else{
            front = (front +1)%n;
        }
    }

    void deleterear(){
        if(isEmpty()){
            System.out.println("queue is empty ");
            return;
        }

        System.out.println("delete element : " + arr[rear]);
        if(front == rear){
            front = rear = -1;
        }
        else{
            rear = (rear -1 +n)%n;
        }
    }

    void display(){
        if(isFull()){
            System.out.println("deque is emepty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");

            if(i == rear){
                break;
            }

            i = (i+1)%n;
        }
        System.out.println();
    }
}
public class Deque {
    public static void main(String[] args) {
        DEQUEUE d = new DEQUEUE(6);
        d.isertRear(34);
        d.isertRear(30);
        d.isertRear(6);
        d.isertRear(10);
        d.isertRear(4);
        d.display();
        d.deletefront();
        d.display();
        d.isertFront(100);
        d.display();
    }
}
