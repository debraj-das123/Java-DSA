package LinkedList;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddTwoNumbers {

    public static Node addTwoNumbers(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int x = 0;
            int y = 0;

            if (l1 != null) {
                x = l1.data;
            } else {
                x = 0;
            }

            if (l2 != null) {
                y = l2.data;
            } else {
                y = 0;
            }

            int sum = x + y + carry;

            int digit = sum % 10;
            carry = sum / 10;

            curr.next = new Node(digit);
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }

    // Insert a node at the end
    public static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Display the linked list
    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node l1 = null;
        Node l2 = null;

        // First number: 342
        l1 = insert(l1, 2);
        l1 = insert(l1, 4);
        l1 = insert(l1, 3);

        // Second number: 465
        l2 = insert(l2, 5);
        l2 = insert(l2, 6);
        l2 = insert(l2, 4);

        System.out.println("First Linked List:");
        display(l1);

        System.out.println("Second Linked List:");
        display(l2);

        Node result = addTwoNumbers(l1, l2);

        System.out.println("Result Linked List:");
        display(result);
    }
}

