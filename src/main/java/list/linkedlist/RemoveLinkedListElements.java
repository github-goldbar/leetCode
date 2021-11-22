package list.linkedlist;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
//        Example 1:
//
//        Input: head = [1,2,6,3,4,5,6], val = 6
//        Output: [1,2,3,4,5]

        ListNode nodeA = new ListNode(1);
        ListNode headA = nodeA;

        nodeA.next = new ListNode(2);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(6);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(3);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(4);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(5);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(6);

//        removeElements(headA, 6);

        Utils.countListNodeLength(headA);

//        Example 2:
//
//        Input: head = [], val = 1
//        Output: []

//        ListNode nodeB = new ListNode(2);
//        removeElements(nodeB, 1);

//        Example 3:
//
//        Input: head = [7,7,7,7], val = 7
//        Output: []

        ListNode nodeB = new ListNode(7);
        ListNode headB = nodeB;

        nodeB.next = new ListNode(7);
        nodeB = nodeB.next;

        nodeB.next = new ListNode(7);
        nodeB = nodeB.next;

        nodeB.next = new ListNode(7);

        removeElements(headB, 7);

        Utils.countListNodeLength(headB);

//        Constraints:
//
//        The number of nodes in the list is in the range [0, 10^4].
//        1 <= Node.val <= 50
//        0 <= val <= 50
    }

    public static ListNode removeElements(ListNode head, int target) {
        if (head == null) {
            return null;
        }

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode current = head;
        ListNode previous = fakeHead;

        while (current != null) {
            if (current.val == target){
                previous.next = current.next;
            } else {
                previous = previous.next;
            }
            current = current.next;
        }

        return fakeHead.next;

//        ListNode fakeHead = new ListNode(0);
//        fakeHead.next = head;
//
//        ListNode slowRunner = fakeHead;
//        ListNode fastRunner = fakeHead.next;
//        while (fastRunner.next != null) {
//            while (fastRunner.val != target) {
//                slowRunner = slowRunner.next;
//                fastRunner = fastRunner.next;
//            }
//
//            while (fastRunner.val == target) {
//                fastRunner = fastRunner.next;
//            }
//
//            slowRunner.next = fastRunner;
//        }
//
//        return head;
    }



}
