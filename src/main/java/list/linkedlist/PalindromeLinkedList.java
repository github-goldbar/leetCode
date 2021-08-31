package list.linkedlist;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        ListNode nodeA = new ListNode(1);
        ListNode headA = nodeA;

        nodeA.next = new ListNode(2);
        nodeA = nodeA.next;


        nodeA.next = new ListNode(2);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(1);


        System.out.println(isPalindrome(headA));
        System.out.println();
        Utils.countNodeLength(headA);
        System.out.println();

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode middleNode = findMiddleNode(head);

        ListNode reversedSecondHalf = reverseList(middleNode);

        return linkedListEqual(head, reversedSecondHalf);
    }

    public static ListNode findMiddleNode(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        while(slowNode != null && (fastNode != null && fastNode.next != null)) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        return slowNode;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    public static boolean linkedListEqual(ListNode nodeOne, ListNode nodeTwo) {
        while (nodeTwo != null) {
            if (nodeOne.val != nodeTwo.val) {
                return false;
            }
            nodeOne = nodeOne.next;
            nodeTwo = nodeTwo.next;
        }

        return true;
    }
}
