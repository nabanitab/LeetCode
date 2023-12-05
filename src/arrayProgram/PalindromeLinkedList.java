package arrayProgram;

public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // Empty list or single-node list is a palindrome
        }

        ListNode middle = findMiddle(head);
        ListNode reversedSecondHalf = reverseList(middle.next);
        middle.next = null; // Break the list into two halves

        return compareLists(head, reversedSecondHalf);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    private boolean compareLists(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList solution = new PalindromeLinkedList();

        // Example 1
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println("Output 1: " + solution.isPalindrome(head1)); // Output: true

        // Example 2
        ListNode head2 = new ListNode(1, new ListNode(2));
        System.out.println("Output 2: " + solution.isPalindrome(head2)); // Output: false
    }
}

