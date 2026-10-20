package Queue;


public class circularqueue {
    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int value){
        if((rear+1) % queue.length == front){
            System.out.println("queue is full");
            return;
        }

        if(front == -1){
            front =0;
            rear =0;
        }else{
            rear = (rear +1) % queue.length;
        }

        queue[rear] = value;


    }

    // dequeu
    static int dequeue(){
        // queue empty
        if(front == -1){
            System.out.println("queue is empty");
            return -1;
        }

        int value = queue[front];
        if(front == rear){
            front = -1;
            rear =-1;
        }else{
            front = (front +1)% queue.length;
        }

        return  value;

    }

    // Display
    static void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        System.out.println("Queue:");
        display();

        System.out.println("Removed: " + dequeue());
        System.out.println("Removed: " + dequeue());

        System.out.println("Queue after dequeue:");
        display();

        enqueue(60);
        enqueue(70);

        System.out.println("Queue after new elements:");
        display();
    }

}
