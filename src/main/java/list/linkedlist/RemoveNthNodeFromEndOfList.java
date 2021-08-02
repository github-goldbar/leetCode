package list.linkedlist;

import java.net.http.HttpRequest;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
//        Given the head of a linked list, remove the nth node from the end of the list and return its head.

//        Example 1:
//
//        Input: head = [1,2,3,4,5], n = 2
//        Output: [1,2,3,5]

        ListNode nodeA = new ListNode(1);
        ListNode headA = nodeA;

        nodeA.next = new ListNode(2);
        nodeA = nodeA.next;


        nodeA.next = new ListNode(3);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(4);
        nodeA = nodeA.next;

        nodeA.next = new ListNode(5);
        nodeA = nodeA.next;

        headA = removeNthFromEnd(headA, 2);
        System.out.println();
        countNodeLength(headA);
        System.out.println();
//        Example 2:
//
//        Input: head = [1], n = 1
//        Output: []


//        Example 3:
//
//        Input: head = [1,2], n = 1
//        Output: [1]

        ListNode nodeC = new ListNode(1);
        ListNode headC = nodeC;

        nodeC.next = new ListNode(2);
        nodeC = nodeC.next;

        headC = removeNthFromEnd(headC, 1);
        System.out.println();
        countNodeLength(headC);
        System.out.println();
//        Constraints:
//
//        The number of nodes in the list is sz.
//        1 <= sz <= 30
//        0 <= Node.val <= 100
//        1 <= n <= sz
//
//
//        Follow up: Could you do this in one pass?
//

    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //        Input: head = [1,2,3,4,5], n = 2
        //        Output: [1,2,3,5]

        int length = countNodeLength(head);
        head = deleteNodeCountFromEnd(n, head, length);

        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static int countNodeLength(ListNode node) {
        int length = 1;
        System.out.println("node = " + node.val);

        while(node.next != null) {
            length++;
            node = node.next;
            System.out.println("node = " + node.val);
        }

        return length;
    }

    /**
     * Get the index-th node in the linked list. If the index is invalid, return -1.
     */
    public static ListNode getNode(int index, ListNode head, int length) {
        if (length == 0 || index >= length) {
            return null;
        } else if (index <= 0) {
            return head;
        }

        ListNode current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public static ListNode deleteNodeCountFromEnd(int index, ListNode head, int length) {

        index = (length - index);

        if (index < 0 || index >= length) {
            return null;
        }

        // delete at head
        if (index <= 0) {
            head = getNode(1, head, length);
        }

        // delete at index
        else if (index < length) {
            getNode(index - 1, head, length).next = getNode(index + 1, head, length);
        }

        // delete at tail
        else if (index == length) {
            getNode(length - 1, head, length).next = null;
        }

        return head;

    }


}
