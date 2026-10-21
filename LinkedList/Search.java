package LinkedList;


/*
    10 -> 20 -> 30 -> 40

    Search 30
    → Found

*/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyLinkedList {

    Node head;

    // Insert at end
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Search an element
    boolean searching(int target){
        Node cuurent = head;
        while (cuurent != null) {
            if(cuurent.data == target){
                return true;
            }

            cuurent = cuurent.next;

            
        }
        return false;
    }

    // Display linked list
    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}

public class Search {
        public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Linked List:");
        list.display();

        int target = 30;

        if (list.searching(target)) {
            System.out.println(target + " is found");
        } else {
            System.out.println(target + " is not found");
        }
    }
}
