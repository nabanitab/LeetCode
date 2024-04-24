package linkedList.reverse;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode next = current.next; // Store the next node
            current.next = previous; // Reverse the next pointer
            previous = current; // Move previous to current node
            current = next; // Move current to the next node
        }

        // Previous will be pointing to the last node of the original list,
        // which will become the head of the reversed list
        return previous;
    }
}

