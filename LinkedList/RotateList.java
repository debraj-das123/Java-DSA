package LinkedList;
/*
    1 -> 2 -> 3 -> 4 -> 5 -> null  k = 2
    4 -> 5 -> 1 -> 2 -> 3 -> null
*/
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class MainLogic{
    Node head;

    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if( head == null){
            head = newNode;
            return ;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            
        }

        temp.next = newNode;
    }

    void rotate(int k){
        if(head == null || head.next == null || k == 0){
            return;
        }

        int length =1;
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        // length = 5
        // tail = 5

        // make cicular list

        k = k % length;

        if (k == 0) {
            return;
        }
        tail.next = head;
        int step = length -k;
        Node newtail = head;
        for(int i =1; i<step; i++){
            newtail = newtail.next;
        }
        head = newtail.next;
        newtail.next = null;

    }
    // Display
    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
public class RotateList {
    public static void main(String[] args) {

        MainLogic list = new MainLogic();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        System.out.println("Before Rotation:");
        list.display();

        int k = 2;

        list.rotate(k);

        System.out.println("After Rotation:");
        list.display();
    }
}
