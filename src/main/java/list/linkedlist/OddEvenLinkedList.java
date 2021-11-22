package list.linkedlist;

public class OddEvenLinkedList implements Cloneable{
    public static void main(String[] args) {

        ListNode nodeA = new ListNode(1);
        ListNode headA = nodeA;

        nodeA.next = new ListNode(2);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(3);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(4);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(5);
//        nodeA = nodeA.next;
//
//        nodeA.next = new ListNode(6);


        Utils.countListNodeLength(oddEvenList(headA));
//        Utils.countListNodeLength(headA);

    }

    public static ListNode oddEvenList(ListNode head) {
        int count = 1;

        ListNode oddHead = new ListNode(-1);
        ListNode odd = oddHead;

        ListNode evenHead = new ListNode(-1);
        ListNode even = evenHead;

        while (head != null) {
            if (count % 2 != 0) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
            count++;
            head = head.next;
        }

        if (count % 2 == 0) {
            even.next = null;
        }

        odd.next = evenHead.next;

        return oddHead.next;
    }
}
