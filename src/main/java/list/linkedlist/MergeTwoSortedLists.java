package list.linkedlist;


public class MergeTwoSortedLists {
//    [-9,3]
//    [5,7]

    public static void main(String[] args) {

        ListNode nodeA = new ListNode(-9);
        ListNode headA = nodeA;
        nodeA.next = new ListNode(3);

        ListNode nodeB = new ListNode(5);
        ListNode headB = nodeB;
        nodeB.next = new ListNode(7);

        ListNode results = mergeTwoLists(headA, headB);

        Utils.countNodeLength(results);
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode newFakeHead = new ListNode();
        ListNode current = newFakeHead;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                current.next = l2;

                l2 = l2.next;
            } else {
                current.next = l1;

                l1 = l1.next;
            }current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return newFakeHead.next;
    }
}
