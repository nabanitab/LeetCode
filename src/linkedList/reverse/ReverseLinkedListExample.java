package linkedList.reverse;

public class ReverseLinkedListExample {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        System.out.println("Original list:");
        printLinkedList(head);

        // Reverse the linked list
        ReverseLinkedList reverser = new ReverseLinkedList();
        ListNode reversedHead = reverser.reverseList(head);

        // Print the reversed linked list
        System.out.println("\nReversed list:");
        printLinkedList(reversedHead);
    }

    // Helper method to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
