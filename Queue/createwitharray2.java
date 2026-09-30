package Queue;

public class createwitharray2 {
    static int queue[] = new int[5];
    static int front =-1;
    static int rear = -1;

    // enqueue
    static void enqueue(int value) {

        // Queue full
        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
            return;
        }

        // First element
        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = value;
    }

    // Dequeue
    static int dequeue() {

        // Queue empty
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = queue[front];

        front++;

        return value;
    }

    // Display
    static void display() {

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
        enqueue(10);
        enqueue(40);
        enqueue(50);
        enqueue(60);

        System.out.println("Queue:");
        display();

        System.out.println("Removed: " + dequeue());
        System.out.println("Removed: " + dequeue());

        System.out.println("After Dequeue:");
        display();
    }

}
