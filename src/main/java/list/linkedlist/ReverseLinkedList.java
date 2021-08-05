package list.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
//        Given the head of a singly linked list, reverse the list, and return the reversed list.

//        Example 1:

//        Input: head = [1,2,3,4,5]
//        Output: [5,4,3,2,1]

//        Example 2:
//
//        Input: head = [1,2]
//        Output: [2,1]

//        Example 3:
//
//        Input: head = []
//        Output: []
    }

    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode nextNode;

        if (currentNode == null) {
            return null;
        }

        while (currentNode.next != null) {
            nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;

        }

        return head;
    }
}
