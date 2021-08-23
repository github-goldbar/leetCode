package list.linkedlist;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

//        Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
//        Output: Intersected at '8'
//        Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
//        From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

        ListNode node = new ListNode(8);
        node.next = new ListNode(4);
        node.next.next = new ListNode(5);

        ListNode nodeA = new ListNode(4);
        ListNode headA = nodeA;
        nodeA.next = new ListNode(1);
        nodeA = nodeA.next;
        nodeA.next = node;

        ListNode nodeB = new ListNode(5);
        ListNode headB = nodeB;
        nodeB.next = new ListNode(6);
        nodeB = nodeB.next;
        nodeB.next = new ListNode(1);
        nodeB = nodeB.next;
        nodeB.next = node;


//        System.out.println(getIntersectionNode(headA, headB));

        ListNode nodeC = new ListNode(1);
        ListNode nodeD = new ListNode(1);

        System.out.println(getIntersectionNode(nodeC, nodeD));

//        node.next = head.next;

//        Sybstem.out.println(headA.val);
//        for (int i = 0; i < 4; i++) {
//            headA = headA.next;
//            System.out.println(headA.val);
//        }
//
//        System.out.println();
//
//        System.out.println(headB.val);
//        for (int i = 0; i < 5; i++) {
//            headB = headB.next;
//            System.out.println(headB.val);
//        }

        //    Constraints:

        //    The number of nodes of listA is in the m.
        //    The number of nodes of listB is in the n.
        //    0 <= m, n <= 3 * 10^4
        //    1 <= Node.val <= 10^5
        //    0 <= skipA <= m
        //    0 <= skipB <= n
        //    intersectVal is 0 if listA and listB do not intersect.
        //    intersectVal == listA[skipA + 1] == listB[skipB + 1] if listA and listB intersect.
    }

    static public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode aRunner = headA;
        ListNode bRunner = headB;

        int aRunnerLength = countListNodeLength(aRunner);
        int bRunnerLength = countListNodeLength(bRunner);

        while(aRunnerLength != bRunnerLength) {
            if(aRunnerLength > bRunnerLength) {
                aRunnerLength--;
                aRunner = aRunner.next;
            } else {
                bRunnerLength--;
                bRunner = bRunner.next;
            }
        }

        while(aRunner != null || bRunner != null) {
            if (aRunner == bRunner) {
                return aRunner;
            }

            aRunner = aRunner.next;
            bRunner = bRunner.next;
        }



        System.out.println("aRunnerLength = " + aRunnerLength);
        System.out.println("bRunnerLength = " + bRunnerLength);

        return null;
    }

    static public int countListNodeLength(ListNode node) {
        int length = 1;

        while (node.next != null) {
            length++;
            node = node.next;
        }

        return length;
    }



}
