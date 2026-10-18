package LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class PlaindramLogic {

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

    // Check Palindrome
    boolean isPalindrome() {

        // Step 1: Count number of nodes
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Empty list or single node
        if (count <= 1) {
            return true;
        }

        // Step 2: Find half
        int k = count / 2;

        temp = head;

        // Move to second half
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }

        // If length is odd, skip middle node
        if (count % 2 != 0) {
            temp = temp.next;
        }

        // Step 3: Reverse second half
        Node next;
        Node previous = null;

        while (temp != null) {

            next = temp.next;
            temp.next = previous;

            previous = temp;
            temp = next;
        }

        // previous = head of reversed second half

        // Step 4: Compare both halves
        Node first = head;
        Node second = previous;

        while (second != null) {

            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    // Display list
    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
public class palindram {
        public static void main(String[] args) {

        PlaindramLogic list = new PlaindramLogic();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(2);
        list.insertAtEnd(1);

        System.out.println("Linked List:");
        list.display();

        if (list.isPalindrome()) {
            System.out.println("The linked list is a Palindrome");
        } else {
            System.out.println("The linked list is NOT a Palindrome");
        }
    }
}
