package Queue;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next =null;
    }

}
class MyList{
    Node head;
    Node front = null;
    Node rear = null;
    void enqueu(int value){
        Node newnode = new Node(value);
        if(rear == null){
            front = newnode;
            rear = newnode;
        }
        else{
            rear.next = newnode;
            rear =  newnode;
        }
    }

    void dequeue(){
        if(front == null){
            System.out.println("queue is empty");
        }
        System.out.println("delete = " + front.data);
        front = front.next;
        if(front == null){
            rear = null;
        }
    }
    void display(){
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
public class implementusingLinkedList {
    public static void main(String[] args) {
        MyList q = new MyList();
        q.enqueu(70);
        q.enqueu(760);
        q.enqueu(90);
        q.enqueu(56);
        q.enqueu(34);
        System.out.println("display ---");
        q.display();
        q.dequeue();
        q.display();
    }
}
