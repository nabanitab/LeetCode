package fome;


public class ReveseLinkList{
    public static ListNode reveseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev=current;
            current=nextNode;
        }

        return prev;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode reversed = reveseList(head);
        while (reversed != null){
            System.out.println(reversed.val+ " ");
            reversed = reversed.next;
        }
    }
}