package Queue;

public class createwitharray {
    int queue[];
    int front;
    int rear;

    createwitharray(int size){
        queue = new int[size];
        front = -1;
        rear =-1;
    }

    // enqueue
    void enqueue(int value){
        if(rear == queue.length -1){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1){
                front =0;
            }

            rear++;
            queue[rear] = value;

            System.out.println(value + "inserted");
        }
    }

    // dequeue
    int dequeue(){
        if(front == -1 || front > rear){
            System.out.println("queue id empty");
        }
        int value = queue[front];
        front++;
        return value;
    }

    int peek() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[front];
    }

        // Display
    void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        createwitharray q = new createwitharray(5);
        q.enqueue(23);
        q.enqueue(45);
        q.enqueue(10);
        q.enqueue(40);
        q.enqueue(2);

        System.out.println("Queue");
        q.display();

        System.out.println("remove: "+ q.dequeue());
        System.out.println("remove: "+ q.dequeue());

        System.out.println("Queue after deletion");
        q.display();

        System.out.println("front element: " + q.peek());
    }
}
