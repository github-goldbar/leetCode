package list.linkedlist;

public class RotateList {
    public static void main(String[] args) {
//        Input: head = [1,2,3,4,5], k = 2
//        Output: [4,5,1,2,3]

        ListNode newNode = new ListNode(1);
        ListNode head = newNode;

        newNode.next = new ListNode(2);
        newNode = newNode.next;

        newNode.next = new ListNode(3);
        newNode = newNode.next;

        newNode.next = new ListNode(4);
        newNode = newNode.next;

        newNode.next = new ListNode(5);

        ListNode results = rotateRight(head, 2);

        Utils.countListNodeLength(results);
        System.out.println();
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        int length = 1;

        ListNode fakeHead = head;

        while (head.next != null) {
            length++;
            head = head.next;
        }


        k = k % length;

        if (k == 0) {
            return fakeHead;
        }

        ListNode lastNode = head;

        head = fakeHead;

        lastNode.next = head;

        for (int i = 0; i < length - k - 1; i++) {
            head = head.next;
        }

        ListNode tmpNode = head.next;

        head.next = null;

        return tmpNode;
    }
}
