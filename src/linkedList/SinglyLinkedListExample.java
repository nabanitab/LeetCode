package linkedList;

class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node in the list

    // Constructor to initialize the node with data
    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next node is null
    }
}

class SinglyLinkedList {
    Node head; // Reference to the head of the linked list

    // Constructor to initialize an empty linked list
    public SinglyLinkedList() {
        this.head = null; // Initially, the linked list is empty
    }

    // Method to insert a new node at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data); // Create a new node with the given data

        // If the linked list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse the list until the last node is reached
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Attach the new node to the last node
        last.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head; // Start from the head node
        System.out.print("Linked List: ");
        // Traverse the list and print each node's data
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // Move to the next node
        }
        System.out.println();
    }
}

public class SinglyLinkedListExample {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList(); // Create a new linked list object

        // Append elements to the linked list
        myList.append(10);
        myList.append(20);
        myList.append(30);

        // Print the linked list
        myList.printList(); // Output: Linked List: 10 20 30
    }
}

