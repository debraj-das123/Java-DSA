package Queue;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next = null;
    }
}
class Queue{
    Node front;
    Node rear;
    Queue(){
        front = null;
        rear = null;
    }

    // enqueue
    void enqueue(int value){
        Node newNode = new Node(value);
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }

        return value;
    }

    int peek(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

        // Display
    void display() {

        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }

        System.out.println();
    }
}
public class createWithList {
    public static void main(String[] args) {
            

        // Queue object
        Queue q = new Queue();

        // Enqueue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Queue:");
        q.display();

        // Dequeue
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        System.out.println("Queue after Dequeue:");
        q.display();

        // Peek
        System.out.println("Front element: " + q.peek());
    }
    
}
