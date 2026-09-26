package LinkedList;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class createList {
    public static void main(String[] args) {
        //  create node
        Node first = new Node(30);
        Node second = new Node(40);
        Node third = new Node(50);
        Node forth = new Node(60);

        // connect node
        first.next = second;
        second.next = third;
        third.next = forth;

        // heade point to first node
        Node head = first;

        // traversing
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");

            current = current.next;
            
        }
        System.out.println();
        System.out.println(head.next.data);
    }
}
